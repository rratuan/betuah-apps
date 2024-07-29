/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasBesar.pbo.kelompok1.betuahApps.controller.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import tugasBesar.pbo.kelompok1.betuahApps.Koneksi;
import tugasBesar.pbo.kelompok1.betuahApps.view.user.ForgotPasswordView;
import tugasBesar.pbo.kelompok1.betuahApps.view.user.SignInView;

/**
 *
 * @author Ocean
 */
public class ForgotPasswordController {
    
    
    // Method pengecekan email pada database dan juga membuat text field password jadi bisa di edit (true)
    public void checkDatabase(ForgotPasswordView forgot) {
        Connection con;
        String email,user=null;
        int checkEmail=0;
         
        try{
            email = forgot.getjTextFieldEmail().getText();
            con = Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM user WHERE email='"+email+"';";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                user = rs.getString("email");
                checkEmail = 1;
            }
            
            if(checkEmail == 1 && email.equals(user)){
                    
                forgot.getjLabelVerifyEmail().setVisible(true);
                forgot.getjLabelVerifyEmail().setText("*Email Ada di Database");

                if(checkPasswordMatch(forgot)) {
                    JOptionPane.showMessageDialog(forgot, "Password berhasil diperbarui");
                    updateDatabase(forgot);
                    forgot.dispose();
                    new SignInView().setVisible(true);
                }
            
            }else{
                forgot.getjLabelVerifyEmail().setVisible(true);
                forgot.getjLabelVerifyEmail().setText("*Email Tidak Ada di Database");
            }
            
        }catch(SQLException e){
            System.out.println("error"+e);
        }
    }
    
    
    // Method update database password pada database
    public void updateDatabase(ForgotPasswordView forgot) {
        Connection con;
        String email, newPassword;
        try {
            email = forgot.getjTextFieldEmail().getText();
            newPassword = forgot.getjPasswordFieldConfirm().getText();
            con = Koneksi.getConnection();
            Statement st = con.createStatement();

            String sql = "UPDATE user SET password='"+newPassword+"' WHERE email='"+email+"';";
            st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("error: " + e);
        }
    }
    
    
    // Method pengecekan password baru dan konfirmasi password sama atau tidak
    public boolean checkPasswordMatch(ForgotPasswordView forgot) {
        String newPassword = forgot.getjPasswordFieldNew().getText();
        String confirmPassword = forgot.getjPasswordFieldConfirm().getText();

        if (newPassword.equals(confirmPassword)) {
            forgot.getjLabelVerifyMisMatch().setVisible(false);
            return true;
        } else {
            forgot.getjLabelVerifyMisMatch().setVisible(true);
            return false;
        }
    }

    // Method menampilkan peringatan email newpassword dan confirmpassword jika tidak di isi
    public boolean validasiForm(ForgotPasswordView forgot) {
        boolean valid = true;

        if (forgot.getjTextFieldEmail().getText().isEmpty()) {
            forgot.getjLabelVerifyEmail().setText("*Email Tidak Boleh Kosong");
            forgot.getjLabelVerifyEmail().setVisible(true);
            valid = false;
        } else {
            forgot.getjLabelVerifyEmail().setText("*Email Tidak Ada di Database");
            forgot.getjLabelVerifyEmail().setVisible(false);
        }

        if (forgot.getjPasswordFieldNew().getPassword().length == 0) {
            forgot.getjLabelVerifyNewPassword().setVisible(true);
            valid = false;
        } else {
            forgot.getjLabelVerifyNewPassword().setVisible(false);
        }
        
        if (forgot.getjPasswordFieldConfirm().getPassword().length == 0) {
            forgot.getjLabelVerifyMisMatch().setText("*Konfirmasi Password Tidak Boleh Kosong");
            forgot.getjLabelVerifyMisMatch().setVisible(true);
            valid = false;
        } else {
            forgot.getjLabelVerifyMisMatch().setText("*Password baru dan konfirmasi password tidak sama");
            forgot.getjLabelVerifyMisMatch().setVisible(false);
        }

        return valid;
    }
    
}
