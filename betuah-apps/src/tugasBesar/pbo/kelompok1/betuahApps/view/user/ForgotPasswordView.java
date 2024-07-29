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
import tugasBesar.pbo.kelompok1.betuahApps.controller.user.ForgotPasswordController;

/**
 *
 * @author Ocean
 */
public class ForgotPasswordView extends javax.swing.JFrame {
    Koneksi koneksi;
    ForgotPasswordController forgotcontroller;

    /**
     * Creates new form ForgotPasswordView
     */
    public ForgotPasswordView() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        koneksi = new Koneksi();
        forgotcontroller = new ForgotPasswordController();
        
        jLabelVerifyEmail.setVisible(false);
        jLabelVerifyNewPassword.setVisible(false);
        jLabelVerifyMisMatch.setVisible(false);
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
        labelLogin = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelVerifyEmail = new javax.swing.JLabel();
        labelPasswordNew = new javax.swing.JLabel();
        jPasswordFieldNew = new javax.swing.JPasswordField();
        jLabelVerifyNewPassword = new javax.swing.JLabel();
        buttonReset = new javax.swing.JButton();
        labelPasswordConfirm = new javax.swing.JLabel();
        jPasswordFieldConfirm = new javax.swing.JPasswordField();
        jLabelVerifyMisMatch = new javax.swing.JLabel();

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

        formPanel.setBackground(new java.awt.Color(255, 255, 255));
        formPanel.setPreferredSize(new java.awt.Dimension(560, 700));
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogin.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        labelLogin.setText("Reset Password");
        formPanel.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 62, -1, -1));

        labelEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelEmail.setText("Email :");
        formPanel.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 154, -1, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(400, 40));
        formPanel.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabelVerifyEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelVerifyEmail.setForeground(new java.awt.Color(255, 102, 102));
        jLabelVerifyEmail.setText("*Email Tidak Ada di Database");
        formPanel.add(jLabelVerifyEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 225, -1, -1));

        labelPasswordNew.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPasswordNew.setText("New Password :");
        formPanel.add(labelPasswordNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 271, -1, -1));

        jPasswordFieldNew.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordFieldNew.setPreferredSize(new java.awt.Dimension(485, 40));
        formPanel.add(jPasswordFieldNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 301, -1, -1));

        jLabelVerifyNewPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelVerifyNewPassword.setForeground(new java.awt.Color(255, 102, 102));
        jLabelVerifyNewPassword.setText("*Password Baru Tidak Boleh Kosong");
        formPanel.add(jLabelVerifyNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        buttonReset.setBackground(new java.awt.Color(202, 174, 171));
        buttonReset.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonReset.setForeground(new java.awt.Color(255, 255, 255));
        buttonReset.setText("Reset Password");
        buttonReset.setPreferredSize(new java.awt.Dimension(365, 55));
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });
        formPanel.add(buttonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 547, -1, -1));

        labelPasswordConfirm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPasswordConfirm.setText("Confirm New Password :");
        formPanel.add(labelPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jPasswordFieldConfirm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordFieldConfirm.setPreferredSize(new java.awt.Dimension(485, 40));
        formPanel.add(jPasswordFieldConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabelVerifyMisMatch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelVerifyMisMatch.setForeground(new java.awt.Color(255, 102, 102));
        jLabelVerifyMisMatch.setText("*Password baru dan konfirmasi password tidak sama");
        formPanel.add(jLabelVerifyMisMatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }
    
    public JLabel getjLabelVerifyEmail() {
        return jLabelVerifyEmail;
    }
    
    public JPasswordField getjPasswordFieldConfirm() {
        return jPasswordFieldConfirm;
    }

    public JPasswordField getjPasswordFieldNew() {
        return jPasswordFieldNew;
    }

    public JLabel getjLabelVerifyNewPassword() {
        return jLabelVerifyNewPassword;
    }

    public JLabel getjLabelVerifyMisMatch() {
        return jLabelVerifyMisMatch;
    }

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // TODO add your handling code here:
        
        if (forgotcontroller.validasiForm(this)) {
            
            forgotcontroller.checkDatabase(this);
        }
//        if (forgotcontroller.checkPasswordMatch(this)) {
//            forgotcontroller.checkDatabase(this);
//        }
    }//GEN-LAST:event_buttonResetActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonReset;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel jLabelVerifyEmail;
    private javax.swing.JLabel jLabelVerifyMisMatch;
    private javax.swing.JLabel jLabelVerifyNewPassword;
    private javax.swing.JPasswordField jPasswordFieldConfirm;
    private javax.swing.JPasswordField jPasswordFieldNew;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPasswordConfirm;
    private javax.swing.JLabel labelPasswordNew;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
