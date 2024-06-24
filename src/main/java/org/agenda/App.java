package org.agenda;



import javax.swing.*;

import org.agenda.vista.LoginView;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginView().setVisible(true); // Mostrar la ventana de login
        });
    }
    }

