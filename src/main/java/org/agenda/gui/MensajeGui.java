/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete.franquito;

/**
 *
 * @author LENOVO
 */
public class MensajeGui extends javax.swing.JFrame {

    /**
     * Creates new form MensajeGui
     */
    public MensajeGui() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        mensajeText = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        loginFondo13 = new javax.swing.JPanel();
        loginFondo14 = new javax.swing.JPanel();
        loginBtn6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensajeText.setBackground(new java.awt.Color(153, 153, 255));
        jScrollPane2.setViewportView(mensajeText);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 460, 290));

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 255));
        jTextField1.setText("Correo");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 460, 20));

        jTextField2.setBackground(new java.awt.Color(204, 204, 255));
        jTextField2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 255));
        jTextField2.setText("Asunto");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 460, 20));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("ASUNTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 450, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("PARA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 450, -1));

        loginFondo13.setBackground(new java.awt.Color(255, 102, 204));
        loginFondo13.setMinimumSize(new java.awt.Dimension(50, 50));
        loginFondo13.setPreferredSize(new java.awt.Dimension(50, 50));
        loginFondo13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loginFondo13MouseDragged(evt);
            }
        });
        loginFondo13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginFondo13FocusGained(evt);
            }
        });
        loginFondo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginFondo13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginFondo13MouseReleased(evt);
            }
        });
        loginFondo13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginFondo14.setBackground(new java.awt.Color(255, 102, 204));
        loginFondo14.setMinimumSize(new java.awt.Dimension(50, 50));
        loginFondo14.setPreferredSize(new java.awt.Dimension(50, 50));
        loginFondo14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loginFondo14MouseDragged(evt);
            }
        });
        loginFondo14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginFondo14FocusGained(evt);
            }
        });
        loginFondo14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginFondo14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginFondo14MouseReleased(evt);
            }
        });
        loginFondo14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        loginFondo13.add(loginFondo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 60, 60));

        loginBtn6.setBackground(new java.awt.Color(255, 102, 204));
        loginBtn6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        loginBtn6.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn6.setText("▶");
        loginBtn6.setToolTipText("");
        loginBtn6.setPreferredSize(new java.awt.Dimension(50, 50));
        loginBtn6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginBtn6FocusGained(evt);
            }
        });
        loginBtn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtn6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtn6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginBtn6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginBtn6MouseReleased(evt);
            }
        });
        loginFondo13.add(loginBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        jPanel1.add(loginFondo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void loginFondo14MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginFondo14MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondo14MouseDragged

    private void loginFondo14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginFondo14FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondo14FocusGained

    private void loginFondo14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginFondo14MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondo14MousePressed

    private void loginFondo14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginFondo14MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondo14MouseReleased

    private void loginBtn6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginBtn6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn6FocusGained

    private void loginBtn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtn6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn6MouseClicked

    private void loginBtn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtn6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn6MouseExited

    private void loginBtn6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtn6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn6MousePressed

    private void loginBtn6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtn6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtn6MouseReleased

    private void loginFondo13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginFondo13MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondo13MouseDragged

    private void loginFondo13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginFondo13FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondo13FocusGained

    private void loginFondo13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginFondo13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondo13MousePressed

    private void loginFondo13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginFondo13MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFondo13MouseReleased

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
            java.util.logging.Logger.getLogger(MensajeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MensajeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MensajeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MensajeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MensajeGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel loginBtn6;
    private javax.swing.JPanel loginFondo13;
    private javax.swing.JPanel loginFondo14;
    private javax.swing.JTextPane mensajeText;
    // End of variables declaration//GEN-END:variables
}