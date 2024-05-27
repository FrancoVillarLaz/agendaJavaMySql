package org.agenda.a;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.agenda.controlador.BD;
import org.agenda.controlador.RegistrarController;

public class RegistrarModel {
    private static final String INSERTAR_USER_SQL = "INSERT INTO user ( DNI, nombre, apellido, contraseña, correo, direccion, codigoPostal) VALUES (?, ?, ?, ?, ?, ?, ?)";

    public boolean registrar(RegistrarController user) {
        boolean registrado = false;
        try (Connection conexion = BD.getConnection();
             PreparedStatement instruccion = conexion.prepareStatement(INSERTAR_USER_SQL)) {
            instruccion.setString(1, user.getDNI());
            instruccion.setString(2, user.getNombre());
            instruccion.setString(3, user.getApellido());
            instruccion.setString(4, user.getContraseña());
            instruccion.setString(5, user.getCorreo());
            instruccion.setString(6, user.getDireccion());
            instruccion.setString(7, user.getCodigoPostal());
            instruccion.executeUpdate();
            registrado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrado;
    }
}
