package org.agenda.a;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.agenda.controlador.BD;
import org.agenda.controlador.LoginController;

public class LoginModel {

    private static final String SELECCIONAR_LOGIN_SQL = "SELECT password FROM user WHERE correo = ?";

    
    public String verificarLogin(LoginController user) {
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(SELECCIONAR_LOGIN_SQL)) {
            instruccion.setString(1, user.getCorreo());
            try (ResultSet resultado = instruccion.executeQuery()) {
                if (resultado.next()) {
                    String contraseñaRecuperada = resultado.getString("password");
                    return contraseñaRecuperada;
                } else {
                    System.out.println("Usuario no encontrado.");
                    String contraseñaRecuperada=null;
                    return contraseñaRecuperada;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            String error="error";
            return error;
        }
    }
}