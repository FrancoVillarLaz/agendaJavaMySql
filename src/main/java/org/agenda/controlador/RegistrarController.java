package org.agenda.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.agenda.modelo.Contactos;
import org.agenda.modelo.Usuarios;

public class RegistrarController {

    private String INSERTAR_USER_SQL = "INSERT INTO usuarios ( nombre, contraseña, correo) VALUES (?, ?, ?)";

    
    public boolean registrarUsuario(String dni, String nombre, String apellido, String contraseña, String correo, String direccion,
            String codigoPostal, List<Contactos> contactos) {
                
        Boolean registrado = false;
        Usuarios usuario = new Usuarios(nombre, contraseña, correo);
        Validador validacion = new Validador();
        if (!validacion.contraseñaValidacion(usuario.getContraseña())) {
            JOptionPane.showMessageDialog(null, "Formato de contraseña inválido. Debe contener al menos un dígito, una letra mayúscula y tener entre 8 y 16 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!validacion.correoValidacion(usuario.getCorreo())) {
            JOptionPane.showMessageDialog(null, "Formato de correo invalido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String passwordHash = validacion.passwordHash(usuario.getContraseña());
        usuario.setContraseña(passwordHash);
        try (Connection conexion = BD.getConnection()) {
            try (PreparedStatement instruccion = conexion.prepareStatement(INSERTAR_USER_SQL)) {

                instruccion.setString(1, usuario.getNombre());
                instruccion.setString(2, usuario.getContraseña());
                instruccion.setString(3, usuario.getCorreo());

                instruccion.executeUpdate();
                registrado = true;
            } catch (SQLException e) {

                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    
        return registrado;
    }
  
}
    