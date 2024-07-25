/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.betuahapps.view;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import main.java.com.betuahapps.Koneksi;
import main.java.com.betuahapps.controller.SignUpController;

/**
 *
 * @author Ocean
 */
public class SignUpView extends javax.swing.JFrame {
    Koneksi koneksi;
    SignUpController signupcontroller;

    /**
     * Creates new form SignUpView
     */
    public SignUpView() {
        initComponents();
        koneksi = new Koneksi();
        signupcontroller = new SignUpController();
        
        jLabelEmailValid.setVisible(false);
        jLabelUsernameValid.setVisible(false);
        jLabelNameValid.setVisible(false);
        jLabelPasswordValid.setVisible(false);
    }

    public JPasswordField getjPasswordField() {
        return jPasswordField;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public JTextField getjTextFieldName() {
        return jTextFieldName;
    }

    public JTextField getjTextFieldUsername() {
        return jTextFieldUsername;
    }

    public JLabel getjLabelEmailValid() {
        return jLabelEmailValid;
    }

    public JLabel getjLabelNameValid() {
        return jLabelNameValid;
    }

    public JLabel getjLabelPasswordValid() {
        return jLabelPasswordValid;
    }

    public JLabel getjLabelUsernameValid() {
        return jLabelUsernameValid;
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
        labelRegister = new javax.swing.JLabel();
        labelDescRegister = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jCheckBoxRememberMe = new javax.swing.JCheckBox();
        buttonRegister = new javax.swing.JButton();
        jLabelDescLogin = new javax.swing.JLabel();
        jLabelLoginHere = new javax.swing.JLabel();
        jLabelEmailValid = new javax.swing.JLabel();
        jLabelUsernameValid = new javax.swing.JLabel();
        jLabelNameValid = new javax.swing.JLabel();
        jLabelPasswordValid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(202, 174, 171));
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

        formPanel.setBackground(new java.awt.Color(255, 255, 255));
        formPanel.setPreferredSize(new java.awt.Dimension(560, 700));

        labelRegister.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        labelRegister.setText("REGISTER");

        labelDescRegister.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelDescRegister.setText("Please register to login in this app");

        labelEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelEmail.setText("Email :");

        jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldEmail.setText("Insert Your Email");
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(482, 40));
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusGained(evt);
            }
        });

        labelUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelUsername.setText("Username :");

        jTextFieldUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldUsername.setText("Insert Your Username");
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(482, 40));
        jTextFieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsernameFocusGained(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelName.setText("Name :");

        jTextFieldName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldName.setText("Insert Your Name");
        jTextFieldName.setPreferredSize(new java.awt.Dimension(482, 40));
        jTextFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNameFocusGained(evt);
            }
        });

        labelPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPassword.setText("Password :");

        jPasswordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordField.setText("Insert Your Password");
        jPasswordField.setPreferredSize(new java.awt.Dimension(485, 40));
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
        });

        jCheckBoxRememberMe.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxRememberMe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBoxRememberMe.setText("    Remember Me");

        buttonRegister.setBackground(new java.awt.Color(202, 174, 171));
        buttonRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonRegister.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegister.setText("Register");
        buttonRegister.setPreferredSize(new java.awt.Dimension(365, 55));
        buttonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegisterMouseClicked(evt);
            }
        });
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

        jLabelDescLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDescLogin.setText("If you already have an account register. You can.");

        jLabelLoginHere.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelLoginHere.setText("Login Here!");
        jLabelLoginHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginHereMouseClicked(evt);
            }
        });

        jLabelEmailValid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelEmailValid.setForeground(new java.awt.Color(255, 0, 0));
        jLabelEmailValid.setText("*Email tidak valid");

        jLabelUsernameValid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelUsernameValid.setForeground(new java.awt.Color(255, 0, 0));
        jLabelUsernameValid.setText("*Username tidak valid");

        jLabelNameValid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNameValid.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNameValid.setText("*Name tidak valid");

        jLabelPasswordValid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelPasswordValid.setForeground(new java.awt.Color(255, 0, 0));
        jLabelPasswordValid.setText("*Password tidak valid");

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxRememberMe)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail)
                            .addComponent(labelDescRegister)
                            .addComponent(labelRegister)
                            .addComponent(labelUsername)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelName)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword)
                            .addComponent(jLabelEmailValid)
                            .addComponent(jLabelUsernameValid)
                            .addComponent(jLabelNameValid)
                            .addComponent(jLabelPasswordValid)))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabelDescLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelLoginHere)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescRegister)
                .addGap(18, 18, 18)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmailValid)
                .addGap(18, 18, 18)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsernameValid)
                .addGap(18, 18, 18)
                .addComponent(labelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNameValid)
                .addGap(18, 18, 18)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPasswordValid)
                .addGap(10, 10, 10)
                .addComponent(jCheckBoxRememberMe)
                .addGap(18, 18, 18)
                .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescLogin)
                    .addComponent(jLabelLoginHere))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        mainPanel.add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        getContentPane().add(mainPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        // TODO add your handling code here:
        Koneksi.getConnection();
        signupcontroller.insertDatabase(this);
    }//GEN-LAST:event_buttonRegisterActionPerformed

    private void buttonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterMouseClicked
        // TODO add your handling code here:
//        if (jTextFieldEmail.getText().equals("")) {
//                jLabelEmailValid.setVisible(true);
//                return; // Hentikan eksekusi jika email kosong
//            }
//            if (jTextFieldUsername.getText().equals("")) {
//                jLabelUsernameValid.setVisible(true);
//                return; // Hentikan eksekusi jika username kosong
//            }
//            if (jTextFieldName.getText().equals("")) {
//                jLabelNameValid.setVisible(true);
//                return; // Hentikan eksekusi jika name kosong
//            }
//            if (jPasswordField.getPassword().length == 0) {
//                jLabelPasswordValid.setVisible(true);
//                return; // Hentikan eksekusi jika password kosong
//            } else {
//                jLabelEmailValid.setVisible(false);
//                jLabelUsernameValid.setVisible(false);
//                jLabelNameValid.setVisible(false);
//                jLabelPasswordValid.setVisible(false);
//            }
    }//GEN-LAST:event_buttonRegisterMouseClicked

    private void jLabelLoginHereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginHereMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new SignInView().setVisible(true);
    }//GEN-LAST:event_jLabelLoginHereMouseClicked

    private void jTextFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusGained
        // TODO add your handling code here:
        String email = jTextFieldEmail.getText();
        
        if(email.equals("Insert Your Email")){
            jTextFieldEmail.setText("");
        }
    }//GEN-LAST:event_jTextFieldEmailFocusGained

    private void jTextFieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsernameFocusGained
        // TODO add your handling code here:
        String username = jTextFieldUsername.getText();
        
        if(username.equals("Insert Your Username")){
            jTextFieldUsername.setText("");
        }
    }//GEN-LAST:event_jTextFieldUsernameFocusGained

    private void jTextFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNameFocusGained
        // TODO add your handling code here:
        String name = jTextFieldName.getText();
        
        if(name.equals("Insert Your Name")){
            jTextFieldName.setText("");
        }
    }//GEN-LAST:event_jTextFieldNameFocusGained

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        // TODO add your handling code here:
        String password = jPasswordField.getText();
        
        if(password.equals("Insert Your Password")){
            jPasswordField.setText("");
        }
    }//GEN-LAST:event_jPasswordFieldFocusGained

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
            java.util.logging.Logger.getLogger(SignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegister;
    private javax.swing.JPanel formPanel;
    private javax.swing.JCheckBox jCheckBoxRememberMe;
    private javax.swing.JLabel jLabelDescLogin;
    private javax.swing.JLabel jLabelEmailValid;
    private javax.swing.JLabel jLabelLoginHere;
    private javax.swing.JLabel jLabelNameValid;
    private javax.swing.JLabel jLabelPasswordValid;
    private javax.swing.JLabel jLabelUsernameValid;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JLabel labelDescRegister;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRegister;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables

}
