package org.agenda.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.agenda.modelo.Mensajes;

public class MensajesController {
    String ENVIAR_MENSAJE_SQL = "INSERT INTO mensajes (asunto, mensaje, fechaHora) VALUES (?, ?, NOW())";
    String RELACION_MENSAJE_SQL = "INSERT INTO mensajesrelacion (idMensaje, idEmisor, idReceptor) VALUES (?, ?, ?)";
    String MOSTRAR_MENSAJES_SQL = "SELECT m.id, m.asunto, m.mensaje, m.fechaHora, c.nombre AS emisor_nombre, c.apellido AS emisor_apellido " +
                                   "FROM mensajes m " +
                                   "INNER JOIN mensajesrelacion mr ON m.id = mr.idMensaje " +
                                   "INNER JOIN contactos c ON mr.idEmisor = c.id " +
                                   "INNER JOIN usuariocontacto uc ON mr.idReceptor = uc.idContacto " +
                                   "WHERE uc.idUsuario = ?";

    public List<Mensajes> mostrarMensajes(int idUsuario){
    List<Mensajes> mensajes = new ArrayList<>();
    try (
        Connection conexion = BD.getConnection();
        PreparedStatement instruccion = conexion.prepareStatement(MOSTRAR_MENSAJES_SQL)
    ){
        instruccion.setInt(1, idUsuario);
        ResultSet rs = instruccion.executeQuery();

        while (rs.next()) {
            Mensajes mensaje = new Mensajes(
                rs.getInt("id"),
                rs.getString("asunto"),
                rs.getString("mensaje"),
                rs.getDate("fechaHora"),
                rs.getString("emisor_nombre") + " " + rs.getString("emisor_apellido")
            );
            mensajes.add(mensaje);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Hubo un error para mostrar tus mensajes desde la base de datos.","Error!", JOptionPane.ERROR_MESSAGE);
    }
    return mensajes;
    }   
    
    public void enviarMensaje(String asunto, String mensaje, int idEmisor, int idReceptor){
        try (
            Connection conexion = BD.getConnection();
            PreparedStatement mensajeStmt = conexion.prepareStatement(ENVIAR_MENSAJE_SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            PreparedStatement relacionStmt = conexion.prepareStatement(RELACION_MENSAJE_SQL);
        ){
            // Insertar el mensaje
            mensajeStmt.setString(1, asunto);
            mensajeStmt.setString(2, mensaje);
            mensajeStmt.executeUpdate();

            // Obtener el ID del mensaje insertado
            int idMensaje = -1;
            ResultSet generatedKeys = mensajeStmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                idMensaje = generatedKeys.getInt(1);
            }

            // Insertar la relación del mensaje con el receptor
            if (idMensaje != -1) {
                relacionStmt.setInt(1, idMensaje);
                relacionStmt.setInt(2, idEmisor);
                relacionStmt.setInt(3, idReceptor);
                relacionStmt.executeUpdate();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al enviar el mensaje.","Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
}