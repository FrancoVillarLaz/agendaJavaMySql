package org.agenda.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mindrot.jbcrypt.BCrypt;

public class Validador {
  private static final String VERIFICAR_LOGIN_SQL = "SELECT contraseña FROM usuarios WHERE correo = ?";

    public String verificarLogin(LoginController loginController) {
        String correo = loginController.getCorreo();
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(VERIFICAR_LOGIN_SQL)) {
            instruccion.setString(1, correo);
            ResultSet resultado = instruccion.executeQuery();
            if (resultado.next()) {
                return resultado.getString("contraseña");
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "error";
        }
    }
    public boolean contraseñaValidacion(String password) {
        String regex = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean correoValidacion(String correo) {
        String regex = "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
    
    public String passwordHash(String password) {return BCrypt.hashpw(password, BCrypt.gensalt());}
}