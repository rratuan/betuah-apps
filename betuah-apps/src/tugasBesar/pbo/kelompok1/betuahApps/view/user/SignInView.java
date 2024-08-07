/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasBesar.pbo.kelompok1.betuahApps.view.user;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import tugasBesar.pbo.kelompok1.betuahApps.Koneksi;
import tugasBesar.pbo.kelompok1.betuahApps.controller.user.SignInController;

/**
 *
 * @author Ocean
 */
public class SignInView extends javax.swing.JFrame {
    Koneksi koneksi;
    SignInController signincontrol;

    /**
     * Creates new form SignInView
     */
    public SignInView() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        koneksi = new Koneksi();
        signincontrol = new SignInController();
        
        jLabelEmailUsernameValid.setVisible(false);
        jLabelPasswordValid.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        labelDescLogin = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        labelEmailUsername = new javax.swing.JLabel();
        jTextFieldEmailUsername = new javax.swing.JTextField();
        jLabelEmailUsernameValid = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelPasswordValid = new javax.swing.JLabel();
        jCheckBoxRememberMe = new javax.swing.JCheckBox();
        labelForgotPassword = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        labelDontHaveAccount = new javax.swing.JLabel();
        labelRegisterNow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(141, 73, 58));
        sidePanel.setPreferredSize(new java.awt.Dimension(650, 1080));

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        mainPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        rightPanel.setPreferredSize(new java.awt.Dimension(1270, 1080));
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formPanel.setBackground(new java.awt.Color(255, 255, 255));
        formPanel.setPreferredSize(new java.awt.Dimension(560, 700));
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDescLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelDescLogin.setText("Welcome to Warmindo Betuah");
        formPanel.add(labelDescLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 88, -1, -1));

        labelLogin.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        labelLogin.setText("LOG IN TO YOUR ACCOUNT");
        formPanel.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 112, -1, -1));

        labelEmailUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelEmailUsername.setText("Email atau Username :");
        formPanel.add(labelEmailUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 204, -1, -1));

        jTextFieldEmailUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldEmailUsername.setPreferredSize(new java.awt.Dimension(485, 40));
        jTextFieldEmailUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailUsernameActionPerformed(evt);
            }
        });
        jTextFieldEmailUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEmailUsernameKeyTyped(evt);
            }
        });
        formPanel.add(jTextFieldEmailUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 234, -1, -1));

        jLabelEmailUsernameValid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelEmailUsernameValid.setForeground(new java.awt.Color(255, 0, 0));
        jLabelEmailUsernameValid.setText("*Email atau Username tidak valid");
        formPanel.add(jLabelEmailUsernameValid, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 281, -1, -1));

        labelPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPassword.setText("Password :");
        formPanel.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 316, -1, -1));

        jPasswordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordField.setPreferredSize(new java.awt.Dimension(485, 40));
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyTyped(evt);
            }
        });
        formPanel.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 346, -1, -1));

        jLabelPasswordValid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelPasswordValid.setForeground(new java.awt.Color(255, 0, 0));
        jLabelPasswordValid.setText("*Password tidak valid");
        formPanel.add(jLabelPasswordValid, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 393, -1, -1));

        jCheckBoxRememberMe.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxRememberMe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBoxRememberMe.setText("    Remember Me");
        formPanel.add(jCheckBoxRememberMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 428, -1, -1));

        labelForgotPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelForgotPassword.setForeground(new java.awt.Color(202, 174, 171));
        labelForgotPassword.setText("Forgot password or username?");
        labelForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelForgotPasswordMouseClicked(evt);
            }
        });
        formPanel.add(labelForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 432, -1, -1));

        buttonLogin.setBackground(new java.awt.Color(202, 174, 171));
        buttonLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Login");
        buttonLogin.setPreferredSize(new java.awt.Dimension(365, 55));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        formPanel.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 487, -1, -1));

        labelDontHaveAccount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelDontHaveAccount.setText("You don't have an account?");
        formPanel.add(labelDontHaveAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 560, -1, -1));

        labelRegisterNow.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelRegisterNow.setForeground(new java.awt.Color(202, 174, 171));
        labelRegisterNow.setText("Register Now");
        labelRegisterNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegisterNowMouseClicked(evt);
            }
        });
        formPanel.add(labelRegisterNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 560, -1, -1));

        rightPanel.add(formPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        mainPanel.add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        getContentPane().add(mainPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getjLabelEmailUsernameValid() {
        return jLabelEmailUsernameValid;
    }

    public JLabel getjLabelPasswordValid() {
        return jLabelPasswordValid;
    }

    public JPasswordField getjPasswordField() {
        return jPasswordField;
    }

    public JTextField getjTextFieldEmailUsername() {
        return jTextFieldEmailUsername;
    }

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
        signincontrol.getDatabase(this);
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void labelForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelForgotPasswordMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new ForgotPasswordView().setVisible(true);
    }//GEN-LAST:event_labelForgotPasswordMouseClicked

    private void labelRegisterNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegisterNowMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new SignUpView().setVisible(true);
    }//GEN-LAST:event_labelRegisterNowMouseClicked

    private void jTextFieldEmailUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailUsernameActionPerformed

    private void jTextFieldEmailUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailUsernameKeyTyped

    private void jPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldKeyTyped

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
            java.util.logging.Logger.getLogger(SignInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JPanel formPanel;
    private javax.swing.JCheckBox jCheckBoxRememberMe;
    private javax.swing.JLabel jLabelEmailUsernameValid;
    private javax.swing.JLabel jLabelPasswordValid;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldEmailUsername;
    private javax.swing.JLabel labelDescLogin;
    private javax.swing.JLabel labelDontHaveAccount;
    private javax.swing.JLabel labelEmailUsername;
    private javax.swing.JLabel labelForgotPassword;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRegisterNow;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
