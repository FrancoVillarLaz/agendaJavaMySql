/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete.franquito;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author LENOVO
 */
public class loginGui extends javax.swing.JFrame {

    
    int xMouse, yMouse;
    /**
     * Creates new form loginGui
     */
    public loginGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreRegistrar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        correoRegistrar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        registrarFondo = new javax.swing.JPanel();
        registrarBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginFondo = new javax.swing.JPanel();
        loginBtn = new javax.swing.JLabel();
        nombreRegistrar1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        correoRegistrar1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 800));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 50));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("NDA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 77));

        nombreRegistrar.setBackground(new java.awt.Color(153, 153, 255));
        nombreRegistrar.setForeground(new java.awt.Color(204, 204, 255));
        nombreRegistrar.setText("Ingrese usuario");
        nombreRegistrar.setBorder(null);
        nombreRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(nombreRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 260, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 204, 153));
        jSeparator1.setForeground(new java.awt.Color(153, 102, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 260, 10));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("NOMBRE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 30));

        correoRegistrar.setBackground(new java.awt.Color(153, 153, 255));
        correoRegistrar.setForeground(new java.awt.Color(204, 204, 255));
        correoRegistrar.setText("Ingrese correo");
        correoRegistrar.setToolTipText("");
        correoRegistrar.setBorder(null);
        correoRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        correoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(correoRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 260, -1));

        jSeparator2.setBackground(new java.awt.Color(102, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(153, 102, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 260, 10));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("CORREO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 30));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Contraseña");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 30));

        jSeparator3.setBackground(new java.awt.Color(102, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(153, 102, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 260, 10));

        jPasswordField1.setBackground(new java.awt.Color(153, 153, 255));
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 255));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 260, -1));

        registrarFondo.setBackground(new java.awt.Color(255, 153, 204));
        registrarFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                registrarFondoMouseDragged(evt);
            }
        });
        registrarFondo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registrarFondoFocusGained(evt);
            }
        });
        registrarFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarFondoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                registrarFondoMouseReleased(evt);
            }
        });

        registrarBtn.setBackground(new java.awt.Color(255, 153, 204));
        registrarBtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        registrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarBtn.setText("REGISTRARSE");
        registrarBtn.setToolTipText("");
        registrarBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registrarBtnFocusGained(evt);
            }
        });
        registrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                registrarBtnMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout registrarFondoLayout = new javax.swing.GroupLayout(registrarFondo);
        registrarFondo.setLayout(registrarFondoLayout);
        registrarFondoLayout.setHorizontalGroup(
            registrarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        registrarFondoLayout.setVerticalGroup(
            registrarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(registrarFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 110, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("AGE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 190, 77));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INICIAR SESION");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 50));

        loginFondo.setBackground(new java.awt.Color(255, 102, 204));
        loginFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loginFondoMouseDragged(evt);
            }
        });
        loginFondo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginFondoFocusGained(evt);
            }
        });
        loginFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginFondoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginFondoMouseReleased(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(255, 102, 204));
        loginBtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("INICIAR SESION");
        loginBtn.setToolTipText("");
        loginBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginBtnFocusGained(evt);
            }
        });
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginBtnMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout loginFondoLayout = new javax.swing.GroupLayout(loginFondo);
        loginFondo.setLayout(loginFondoLayout);
        loginFondoLayout.setHorizontalGroup(
            loginFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginFondoLayout.setVerticalGroup(
            loginFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(loginFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        nombreRegistrar1.setBackground(new java.awt.Color(204, 204, 255));
        nombreRegistrar1.setForeground(new java.awt.Color(153, 153, 255));
        nombreRegistrar1.setText("Ingrese usuario");
        nombreRegistrar1.setBorder(null);
        nombreRegistrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRegistrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(nombreRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 260, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 255));
        jLabel8.setText("NOMBRE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 30));

        correoRegistrar1.setBackground(new java.awt.Color(204, 204, 255));
        correoRegistrar1.setForeground(new java.awt.Color(153, 153, 255));
        correoRegistrar1.setText("Ingrese correo");
        correoRegistrar1.setToolTipText("");
        correoRegistrar1.setBorder(null);
        correoRegistrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        correoRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoRegistrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(correoRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 260, -1));

        jSeparator5.setBackground(new java.awt.Color(102, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(153, 102, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 260, 10));

        jPasswordField2.setBackground(new java.awt.Color(204, 204, 255));
        jPasswordField2.setForeground(new java.awt.Color(153, 153, 255));
        jPasswordField2.setText("jPasswordField1");
        jPasswordField2.setBorder(null);
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 260, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 255));
        jLabel9.setText("CORREO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 30));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 255));
        jLabel10.setText("Contraseña");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 30));

        jSeparator6.setBackground(new java.awt.Color(102, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(153, 102, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 260, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 204, 153));
        jSeparator4.setForeground(new java.awt.Color(153, 102, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 260, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreRegistrarActionPerformed

    private void correoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoRegistrarActionPerformed

    private void registrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBtnMouseClicked
          // TODO add your handling code here:
    }//GEN-LAST:event_registrarBtnMouseClicked

    private void registrarBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registrarBtnFocusGained
      // TODO add your handling code here:
    }//GEN-LAST:event_registrarBtnFocusGained

    private void registrarFondoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registrarFondoFocusGained

       
    }//GEN-LAST:event_registrarFondoFocusGained

    private void registrarFondoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarFondoMouseReleased
           // TODO add your handling code here:
    }//GEN-LAST:event_registrarFondoMouseReleased

    private void registrarFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarFondoMousePressed
       // TODO add your handling code here:
    }//GEN-LAST:event_registrarFondoMousePressed

    private void registrarFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarFondoMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarFondoMouseDragged

    private void registrarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBtnMouseExited
          // TODO add your handling code here:
    }//GEN-LAST:event_registrarBtnMouseExited

    private void registrarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBtnMousePressed
    registrarFondo.setBackground(new Color(255, 102, 204));     // TODO add your handling code here:
    }//GEN-LAST:event_registrarBtnMousePressed

    private void registrarBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBtnMouseReleased
       registrarFondo.setBackground(new Color(255,153,204));      // TODO add your handling code here:
    }//GEN-LAST:event_registrarBtnMouseReleased

    private void nombreRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRegistrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreRegistrar1ActionPerformed

    private void correoRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoRegistrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoRegistrar1ActionPerformed

    private void loginBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginBtnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnFocusGained

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
          // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseClicked

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
   // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMousePressed
       loginFondo.setBackground(new Color(255,153,204));  // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMousePressed

    private void loginBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseReleased
     loginFondo.setBackground(new Color(255, 102, 204));         // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseReleased

    private void loginFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginFondoMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondoMouseDragged

    private void loginFondoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginFondoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondoFocusGained

    private void loginFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginFondoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondoMousePressed

    private void loginFondoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginFondoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondoMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField correoRegistrar;
    private javax.swing.JTextField correoRegistrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JPanel loginFondo;
    private javax.swing.JTextField nombreRegistrar;
    private javax.swing.JTextField nombreRegistrar1;
    private javax.swing.JLabel registrarBtn;
    private javax.swing.JPanel registrarFondo;
    // End of variables declaration//GEN-END:variables
}
