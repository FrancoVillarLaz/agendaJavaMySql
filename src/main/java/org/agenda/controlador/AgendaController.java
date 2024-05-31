package org.agenda.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.agenda.modelo.Contactos;

public class AgendaController {

    private static final String VERIFICAR_CORREO_SQL = "SELECT COUNT(*) FROM contactos WHERE correo = ?";
    private static final String VERIFICAR_NOMBRE_SQL = "SELECT COUNT(*) FROM contactos WHERE nombre = ?";
    private static final String VERIFICAR_APELLIDO_SQL = "SELECT COUNT(*) FROM contactos WHERE apellido = ?";
    private final String INSERTAR_CONTACTO_SQL="INSERT INTO contactos (DNI, nombre, apellido, correo, direccion, localidad) VALUES (?, ?, ?, ?, ?, ?)";
    private final String ELIMINAR_CONTACTO_SQL="DELETE FROM contactos WHERE correo = ?";
    private final String MODIFICAR_CONTACTO_SQL="UPDATE contactos SET DNI = COALESCE(?, DNI), nombre = COALESCE(?, nombre), apellido = COALESCE(?, apellido), correo = COALESCE(?, correo), direccion = COALESCE(?, direccion), localidad = COALESCE(?, localidad) WHERE correo = ?";
    private final String MOSTRAR_TODOS_CONTACTOS_SQL="SELECT * FROM contactos";
    private final String MOSTRAR_CONTACTOS_POR_CORREO_SQL = "SELECT * FROM contactos WHERE correo = ?";

    public void crearContacto(String DNI, String nombre, String apellido, String correo, String direccion, String localidad){

        Contactos contacto = new Contactos(DNI, nombre,apellido,correo, direccion,localidad);
        if (!verificarExistencia(VERIFICAR_CORREO_SQL, contacto.getCorreo())) {
            // Manejo del caso en que el correo no es válido
            System.out.println("El correo ya esta registrado");
            return;
        }
    
        if (!verificarExistencia(VERIFICAR_NOMBRE_SQL, contacto.getNombre())) {
            // Manejo del caso en que el nombre no es válido
            System.out.println("El nombre ya esta registrado");
            return;
        }
    
        if (!verificarExistencia(VERIFICAR_APELLIDO_SQL,contacto.getApellido())) {
            // Manejo del caso en que el apellido no es válido
            System.out.println("El apellido ya esta registrado");
            return;
        }
    

        try  (
            Connection conexion = BD.getConnection();
            PreparedStatement instruccion = conexion.prepareStatement(INSERTAR_CONTACTO_SQL)) {
                instruccion.setString(1, contacto.getDNI());
                instruccion.setString(2, contacto.getNombre());
                instruccion.setString(3, contacto.getApellido());
                instruccion.setString(4, contacto.getCorreo());
                instruccion.setString(5, contacto.getDireccion());
                instruccion.setString(6, contacto.getLocalidad());

                int filasInsertadas = instruccion.executeUpdate();
                if (filasInsertadas > 0){
                    System.out.println("contacto creado papa");
                }else{
                    System.out.println("algo salio mal");
                }

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

    }
    private void eliminarContactoPorCorreo(String correo){
        Contactos contacto = new Contactos();
        contacto.setCorreo(correo);
        if (verificarExistencia(VERIFICAR_CORREO_SQL, contacto.getCorreo())) {
            // Manejo del caso en que el correo no es válido
            System.out.println("No hay contacto vinculado a este correo");
            return;
        }
        try (
            Connection conexion = BD.getConnection();
            PreparedStatement instruccion = conexion.prepareStatement(ELIMINAR_CONTACTO_SQL);){
                instruccion.setString(1, correo);
                int filasAfectada = instruccion.executeUpdate();
                if (filasAfectada > 0) {
                    System.out.println("el contacto con el correo "+correo+" fue eliminado correctamente");
                } else {
                    System.out.println("no se pudo eliminar el contacto con el correo "+correo);
                }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    private void modificarContacto(String DNI, String nombre, String apellido, String correo, String direccion, String localidad){
        Contactos modificacion = new Contactos(DNI, nombre, apellido, correo, direccion, localidad);
        try (Connection conexion =  BD.getConnection();
            PreparedStatement instruccion = conexion.prepareStatement(MODIFICAR_CONTACTO_SQL)){
                instruccion.setString(1, modificacion.getDNI());
                instruccion.setString(2, modificacion.getNombre());
                instruccion.setString(3, modificacion.getApellido());
                instruccion.setString(4, modificacion.getCorreo());
                instruccion.setString(5, modificacion.getDireccion());
                instruccion.setString(6, modificacion.getLocalidad());

                int filasAfectada = instruccion.executeUpdate();
                if (filasAfectada > 0) {
                    System.out.println("el contacto con el correo "+correo+" fue actualizado correctamente");
                } else {
                    System.out.println("no se pudo actualizar el contacto con el correo "+correo);
                }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    private List<Contactos> contactoMostrarTodo(){
        List<Contactos> contactos = new ArrayList<Contactos>();
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
        } catch (Exception e) {
            // TODO: handle exception
        }
        return contactos;
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
      // Método para obtener contactos por correo
    public List<Contactos> contactoMostrarPorCorreo(String correo) {
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
}
