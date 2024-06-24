package org.agenda.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.agenda.modelo.Contactos;

public class AgendaController {

    private final String VERIFICAR_CORREO_SQL = "SELECT COUNT(*) FROM contactos WHERE correo = ?";
    private final String VERIFICAR_NOMBRE_SQL = "SELECT COUNT(*) FROM contactos WHERE nombre = ?";
    private final String VERIFICAR_APELLIDO_SQL = "SELECT COUNT(*) FROM contactos WHERE apellido = ?";
    
    private final String INSERTAR_CONTACTO_SQL = "INSERT INTO contactos (DNI, nombre, apellido, correo, direccion, localidad) VALUES (?, ?, ?, ?, ?, ?)";
    private final String ELIMINAR_CONTACTO_SQL = "DELETE FROM contactos WHERE id = ?";
    private final String MODIFICAR_CONTACTO_SQL = "UPDATE contactos SET DNI = COALESCE(?, DNI), nombre = COALESCE(?, nombre), apellido = COALESCE(?, apellido), correo = COALESCE(?, correo), direccion = COALESCE(?, direccion), localidad = COALESCE(?, localidad) WHERE id = ?";
    private final String MOSTRAR_TODOS_CONTACTOS_SQL = "SELECT * FROM contactos";
    private final String MOSTRAR_CONTACTOS_POR_CORREO_SQL = "SELECT * FROM contactos WHERE correo = ?";
    private final String OBTENER_ID_CONTACTO_POR_CORREO_SQL = "SELECT id FROM contactos WHERE correo = ?";
    private final String ASIGNAR_CONTACTO_A_USUARIO_SQL = "INSERT INTO usuariocontacto (idUsuario, idContacto) VALUES (?, ?)";
    private final String OBTENER_CONTACTOS_POR_USUARIO_SQL = "SELECT c.id, c.DNI, c.nombre, c.apellido, c.correo, c.direccion, c.localidad " +
                                                             "FROM contactos c " +
                                                             "INNER JOIN usuariocontacto uc ON c.id = uc.idContacto " +
                                                             "WHERE uc.idUsuario = ?";
    private final String ELIMINAR_RELACION_USUARIO_CONTACTO_SQL = "DELETE FROM usuariocontacto WHERE idUsuario = ? AND idContacto = ?";

    public void asignarContactoAUsuario(int idUsuario, int idContacto) {
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(ASIGNAR_CONTACTO_A_USUARIO_SQL)) {
            
            instruccion.setInt(1, idUsuario);
            instruccion.setInt(2, idContacto);

            int filasInsertadas = instruccion.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Contacto asignado al usuario correctamente");
            } else {
                System.out.println("Hubo un problema al asignar el contacto al usuario");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Contactos> obtenerContactosPorUsuario(int idUsuario) {
        List<Contactos> contactos = new ArrayList<>();
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(OBTENER_CONTACTOS_POR_USUARIO_SQL)) {
            
            instruccion.setInt(1, idUsuario);
            ResultSet resultado = instruccion.executeQuery();
            while (resultado.next()) {
                Contactos contacto = new Contactos(
                    resultado.getInt("id"),
                    resultado.getString("DNI"),
                    resultado.getString("nombre"),
                    resultado.getString("apellido"),
                    resultado.getString("correo"),
                    resultado.getString("direccion"),
                    resultado.getString("localidad")
                );
                contactos.add(contacto);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al obtener los contactos del usuario desde la base de datos.","Error!", JOptionPane.ERROR_MESSAGE);
        }
        return contactos;
    }

    public void crearContacto(String DNI, String nombre, String apellido, String correo, String direccion, String localidad, int idUsuario){

    Contactos contacto = new Contactos(DNI, nombre, apellido, correo, direccion, localidad);
    if (!verificarExistencia(VERIFICAR_CORREO_SQL, contacto.getCorreo())) {
        // Manejo del caso en que el correo no es válido
        System.out.println("El correo ya está registrado");
        return;
    }

    if (!verificarExistencia(VERIFICAR_NOMBRE_SQL, contacto.getNombre())) {
        // Manejo del caso en que el nombre no es válido
        System.out.println("El nombre ya está registrado");
        return;
    }

    if (!verificarExistencia(VERIFICAR_APELLIDO_SQL, contacto.getApellido())) {
        // Manejo del caso en que el apellido no es válido
        System.out.println("El apellido ya está registrado");
        return;
    }

    try (Connection conexion = BD.getConnection();
         PreparedStatement instruccion = conexion.prepareStatement(INSERTAR_CONTACTO_SQL, Statement.RETURN_GENERATED_KEYS)) {
        
        instruccion.setString(1, contacto.getDNI());
        instruccion.setString(2, contacto.getNombre());
        instruccion.setString(3, contacto.getApellido());
        instruccion.setString(4, contacto.getCorreo());
        instruccion.setString(5, contacto.getDireccion());
        instruccion.setString(6, contacto.getLocalidad());

        int filasInsertadas = instruccion.executeUpdate();
        if (filasInsertadas > 0) {
            // Obtener el ID generado para el contacto creado
            ResultSet generatedKeys = instruccion.getGeneratedKeys();
            int idContacto = -1;
            if (generatedKeys.next()) {
                idContacto = generatedKeys.getInt(1);
            }

            // Si se obtuvo el ID del contacto, crear la relación usuario-contacto
            if (idContacto != -1) {
                asignarContactoAUsuario(idUsuario, idContacto);
                System.out.println("Contacto creado correctamente y asignado al usuario");
            } else {
                System.out.println("No se pudo obtener el ID del contacto creado");
            }
        } else {
            System.out.println("Hubo un problema al crear el contacto");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    public void eliminarContactoPorId(int idContacto){
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(ELIMINAR_CONTACTO_SQL)) {
            
            instruccion.setInt(1, idContacto);
            int filasAfectadas = instruccion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("El contacto con ID " + idContacto + " fue eliminado correctamente");
            } else {
                System.out.println("No se pudo eliminar el contacto con ID " + idContacto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarContacto(int idContacto, String DNI, String nombre, String apellido, String correo, String direccion, String localidad){
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(MODIFICAR_CONTACTO_SQL)) {
            
            instruccion.setString(1, DNI);
            instruccion.setString(2, nombre);
            instruccion.setString(3, apellido);
            instruccion.setString(4, correo);
            instruccion.setString(5, direccion);
            instruccion.setString(6, localidad);
            instruccion.setInt(7, idContacto); // Condición WHERE

            int filasAfectadas = instruccion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("El contacto con ID " + idContacto + " fue actualizado correctamente");
            } else {
                System.out.println("No se pudo actualizar el contacto con ID " + idContacto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Contactos> mostrarTodosContactos(){
        List<Contactos> contactos = new ArrayList<>();
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(MOSTRAR_TODOS_CONTACTOS_SQL)) {
            
            ResultSet resultado = instruccion.executeQuery();
            while (resultado.next()) {
                Contactos contacto = new Contactos(
                    resultado.getInt("id"),
                    resultado.getString("DNI"),
                    resultado.getString("nombre"),
                    resultado.getString("apellido"),
                    resultado.getString("correo"),
                    resultado.getString("direccion"),
                    resultado.getString("localidad")
                );
                contactos.add(contacto);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error para mostrar tus contactos desde la base de datos.","Error!", JOptionPane.ERROR_MESSAGE);
        }
        return contactos;
    }

    public int obtenerIdContactoPorCorreo(String correo) {
        int idContacto = -1;
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(OBTENER_ID_CONTACTO_POR_CORREO_SQL)) {
            instruccion.setString(1, correo);
            ResultSet resultado = instruccion.executeQuery();
            if (resultado.next()) {
                idContacto = resultado.getInt("id");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ID de contacto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return idContacto;
    }

    private boolean verificarExistencia(String sql, String valor) {
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(sql)) {
            
            instruccion.setString(1, valor);
            try (ResultSet resultado = instruccion.executeQuery()) {
                if (resultado.next()) {
                    return true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Contactos> mostrarContactosPorCorreo(String correo) {
        List<Contactos> contactos = new ArrayList<>();
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(MOSTRAR_CONTACTOS_POR_CORREO_SQL)) {
            
            instruccion.setString(1, correo);
            ResultSet resultado = instruccion.executeQuery();
            while (resultado.next()) {
                Contactos contacto = new Contactos(
                    resultado.getInt("id"),
                    resultado.getString("DNI"),
                    resultado.getString("nombre"),
                    resultado.getString("apellido"),
                    resultado.getString("correo"),
                    resultado.getString("direccion"),
                    resultado.getString("localidad")
                );
                contactos.add(contacto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contactos;
    }

    public void eliminarRelacionUsuarioContacto(int idUsuario, int idContacto) {
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(ELIMINAR_RELACION_USUARIO_CONTACTO_SQL)) {
            
            instruccion.setInt(1, idUsuario);
            instruccion.setInt(2, idContacto);

            int filasEliminadas = instruccion.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Relación usuario-contacto eliminada correctamente");
            } else {
                System.out.println("No se pudo eliminar la relación usuario-contacto");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
