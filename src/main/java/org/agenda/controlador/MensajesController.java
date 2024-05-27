package org.agenda.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class MensajesController {
    private final String ENVIAR_MENSAJE_SQL = "INSERT INTO mensajes (asunto, mensaje) VALUES (?,?)";

    public void enviarMensaje (String asunto, String mensaje){
        try (
            Connection conexion = BD.getConnection();
            PreparedStatement instruccion = conexion.prepareStatement(ENVIAR_MENSAJE_SQL);) {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
