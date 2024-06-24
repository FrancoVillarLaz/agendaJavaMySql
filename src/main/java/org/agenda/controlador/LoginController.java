package org.agenda.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mindrot.jbcrypt.BCrypt;

public class LoginController {
    private String correo;
    private String contraseña;

    public LoginController() {}

    public LoginController(String correo, char[] contraseña) {
        this.correo = correo;
        this.contraseña = new String(contraseña);
    }

    public LoginController(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public boolean logear() {
        Validador login = new Validador();
        String contraseñaRecuperada = login.verificarLogin(this);

        if (contraseñaRecuperada != null && BCrypt.checkpw(this.contraseña, contraseñaRecuperada)) {
            System.out.println("Se inició sesión correctamente.");

            // Obtener el ID del usuario
            int usuarioId = obtenerUsuarioId();

            // Configurar la sesión del usuario
            if (usuarioId != -1) {
                UserSession session = UserSession.getInstance();
                session.setCorreo(correo);
                session.setUsuarioId(usuarioId);
            }

            return true;
        } else {
            System.out.println("Correo o contraseña incorrectos.");
            return false;
        }
    }

    private int obtenerUsuarioId() {
        int usuarioId = -1;
        String obtenerUsuarioIdSQL = "SELECT id FROM usuarios WHERE correo = ?";

        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(obtenerUsuarioIdSQL)) {

            instruccion.setString(1, correo);
            ResultSet resultado = instruccion.executeQuery();

            if (resultado.next()) {
                usuarioId = resultado.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarioId;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}