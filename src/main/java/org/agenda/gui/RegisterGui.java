// package org.agenda.gui;

// import javax.swing.*;

// import org.agenda.controlador.RegistrarController;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class RegisterGui extends JFrame {

//     private JTextField usernameField;
//     private JPasswordField passwordField;
//     private JTextField emailField;

//     public RegisterGui() {
//         setTitle("Register");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(300, 200);
//         setLocationRelativeTo(null);

//         JPanel mainPanel = new JPanel();
//         mainPanel.setLayout(new GridLayout(4, 2, 10, 10));

//         JLabel usernameLabel = new JLabel("Username:");
//         usernameField = new JTextField();
//         JLabel passwordLabel = new JLabel("Password:");
//         passwordField = new JPasswordField();
//         JLabel emailLabel = new JLabel("Email:");
//         emailField = new JTextField();

//         JButton registerButton = new JButton("Register");
//         registerButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 String username = usernameField.getText();
//                 char[] password = passwordField.getPassword();
//                 String email = emailField.getText();

//                 RegistrarController registrar = new RegistrarController(username, password, email);
//                 if (registrar.registrarUsuario()) {
//                     dispose();
//                     LoginGui loginVentana = new LoginGui();
//                     loginVentana.setVisible(true);
//                 }
//             }
//         });

//         mainPanel.add(usernameLabel);
//         mainPanel.add(usernameField);
//         mainPanel.add(passwordLabel);
//         mainPanel.add(passwordField);
//         mainPanel.add(emailLabel);
//         mainPanel.add(emailField);
//         mainPanel.add(new JLabel());
//         mainPanel.add(registerButton);

//         add(mainPanel);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new RegisterGui().setVisible(true);
//             }
//         });
//     }
// }
