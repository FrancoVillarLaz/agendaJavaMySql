package org.agenda.vista;

import javax.swing.*;
import org.agenda.controlador.RegistrarController;
import org.agenda.modelo.Contactos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterView extends JFrame {
    private JTextField regCorreoField;
    private JPasswordField regContraseñaField;
    private JTextField regNombreField;
    private JTextField regDniField;
    private JTextField regApellidoField;
    private JTextField regDireccionField;
    private JTextField regCodigoPostalField;
    private RegistrarController registrarController;

    public RegisterView() {
        setTitle("Registro");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel registerPanel = new JPanel(new GridLayout(8, 2));
        registerPanel.add(new JLabel("DNI:"));
        regDniField = new JTextField();
        registerPanel.add(regDniField);

        registerPanel.add(new JLabel("Nombre:"));
        regNombreField = new JTextField();
        registerPanel.add(regNombreField);

        registerPanel.add(new JLabel("Apellido:"));
        regApellidoField = new JTextField();
        registerPanel.add(regApellidoField);

        registerPanel.add(new JLabel("Correo:"));
        regCorreoField = new JTextField();
        registerPanel.add(regCorreoField);

        registerPanel.add(new JLabel("Contraseña:"));
        regContraseñaField = new JPasswordField();
        registerPanel.add(regContraseñaField);

        registerPanel.add(new JLabel("Dirección:"));
        regDireccionField = new JTextField();
        registerPanel.add(regDireccionField);

        registerPanel.add(new JLabel("Código Postal:"));
        regCodigoPostalField = new JTextField();
        registerPanel.add(regCodigoPostalField);

        JButton registerButton = new JButton("Registrar");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dni = regDniField.getText();
                String nombre = regNombreField.getText();
                String apellido = regApellidoField.getText();
                String correo = regCorreoField.getText();
                char[] contraseña = regContraseñaField.getPassword();
                String direccion = regDireccionField.getText();
                String codigoPostal = regCodigoPostalField.getText();
                ArrayList<Contactos> contactos = new ArrayList<>();
                // Aquí puedes añadir la lógica para llenar la lista de contactos

                if (registrarController == null) {
                    registrarController = new RegistrarController(); // Inicialización si es nulo
                }

                if (registrarController.registrarUsuario(dni, nombre, apellido, new String(contraseña), correo, direccion, codigoPostal, contactos)) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
                    dispose(); // Cerrar ventana actual de registro
                    new LoginView().setVisible(true); // Abrir la ventana de login
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar usuario", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        registerPanel.add(registerButton);

        add(registerPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);
            }
        });
    }
}
