package org.agenda.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.agenda.modelo.Contactos;
import org.agenda.modelo.Usuarios;

public class RegistrarController {

    private String INSERTAR_USER_SQL = "INSERT INTO user ( DNI, nombre, apellido, contraseña, correo, direccion, codigoPostal) VALUES (?, ?, ?, ?, ?, ?, ?)";

    
    public boolean registrarUsuario(String dni, String nombre, String apellido, String contraseña, String correo, String direccion,
            String codigoPostal, List<Contactos> contactos) {
                
        Boolean registrado = false;
        Usuarios usuario = new Usuarios(dni,nombre,apellido,contraseña, correo,direccion,codigoPostal,contactos);
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
        try (
            Connection conexion = BD.getConnection();
            PreparedStatement instruccion = conexion.prepareStatement(INSERTAR_USER_SQL)) {
            instruccion.setString(1, usuario.getDni());
            instruccion.setString(2, usuario.getNombre());
            instruccion.setString(3, usuario.getApellido());
            instruccion.setString(4, usuario.getContraseña());
            instruccion.setString(5, usuario.getCorreo());
            instruccion.setString(6, usuario.getDireccion());
            instruccion.setString(7, usuario.getCodigoPostal());
            instruccion.executeUpdate();
            registrado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        if (registrado) {
            JOptionPane.showMessageDialog(null, "Registrado.", "Completado correctamente", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Registro fallido. Por favor intentelo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        return registrado;
    }
  
}
    