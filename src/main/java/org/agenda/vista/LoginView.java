package org.agenda.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.agenda.controlador.LoginController;
import org.agenda.controlador.UserSession;

public class LoginView extends JFrame {
    private JTextField loginCorreoField;
    private JPasswordField loginContraseñaField;
    private LoginController loginController;

    public LoginView() {
        setTitle("Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        

        JPanel loginPanel = new JPanel(new GridLayout(3, 2));
        loginPanel.add(new JLabel("Correo:"));
        loginCorreoField = new JTextField();
        loginPanel.add(loginCorreoField);

        loginPanel.add(new JLabel("Contraseña:"));
        loginContraseñaField = new JPasswordField();
        loginPanel.add(loginContraseñaField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String correo = loginCorreoField.getText();
                String contraseña = new String(loginContraseñaField.getPassword());
                loginController = new LoginController(correo, contraseña);
                if (loginController.logear()) {
                    JOptionPane.showMessageDialog(LoginView.this, "Login exitoso!");
                    UserSession session = UserSession.getInstance();
                    
                    new AgendaInterfaz(session.getUsuarioId()).setVisible(true); // Abre la vista de contactos
                    dispose(); // Cierra la vista de login
                } else {
                    JOptionPane.showMessageDialog(LoginView.this, "Correo o contraseña incorrectos.");
                }
            }
        });

        loginPanel.add(loginButton);
        add(loginPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
}
