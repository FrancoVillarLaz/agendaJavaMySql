package org.agenda.controlador;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class BD {

    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                String url = "jdbc:mysql://localhost:3306/agenda";
                String username = "root";
                String password = "";
                connection = DriverManager.getConnection(url, username, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

