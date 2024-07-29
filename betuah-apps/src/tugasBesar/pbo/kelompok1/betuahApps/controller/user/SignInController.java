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
import tugasBesar.pbo.kelompok1.betuahApps.view.home.MainView;
import tugasBesar.pbo.kelompok1.betuahApps.view.user.SignInView;

/**
 *
 * @author Ocean
 */
public class SignInController {
    
    // Method pengecekan email dan password pada saat login
    public void getDatabase(SignInView signin) {
        Connection con;
         String username,password,pass=null,user=null;
         int notFound=0;
         
         if (!validasiForm(signin)) {
            return;
        }
         
         try{
            username = signin.getjTextFieldEmailUsername().getText();
            password = signin.getjPasswordField().getText();
            con = Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM user WHERE username='"+username+"';";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                pass = rs.getString("password");
                user = rs.getString("username");
                notFound = 1;
            }
            if(notFound == 1 && password.equals(pass)){
                MainView HomeView = new MainView();
                HomeView.setVisible(true);
                signin.dispose();
            }else{
               JOptionPane.showMessageDialog(signin, "Incorrect email or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(SQLException e){
            System.out.println("error"+e);
        }
    }
    
    // Method menampilkan peringatan email/username dan password jika tidak di isi
    public boolean validasiForm(SignInView signin) {
        boolean valid = true;

        if (signin.getjTextFieldEmailUsername().getText().isEmpty()) {
            signin.getjLabelEmailUsernameValid().setVisible(true);
            valid = false;
        } else {
            signin.getjLabelEmailUsernameValid().setVisible(false);
        }

        if (signin.getjPasswordField().getPassword().length == 0) {
            signin.getjLabelPasswordValid().setVisible(true);
            valid = false;
        } else {
            signin.getjLabelPasswordValid().setVisible(false);
        }

        return valid;
    }
    
}
