package main.java.com.betuahapps;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import main.java.com.betuahapps.view.HomeView;
import main.java.com.betuahapps.view.SignInView;
import main.java.com.betuahapps.view.SignUpView;

public class Koneksi {
    
    static Connection con;
    Statement st = null;
    
    public static Connection getConnection(){
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            
            data.setDatabaseName("betuah");
            data.setServerName("localhost");
            data.setPortNumber(3306);
            data.setUser("root");
            data.setPassword("");
            
            try{
                con = data.getConnection();
                System.out.println("koneksi berhasil");
            }catch(SQLException e){
                System.out.println("tidak konek");
            }
        }
        return con;
    }
    
//    public void getDatabase(SignInView signin) {
//        Connection con;
//         String username,password,pass=null,user=null;
//         int notFound=0;
//         try{
//            username = signin.getjTextFieldUsername().getText();
//            password = signin.getjPasswordField().getText();
//            con = Koneksi.getConnection();
//            Statement st = con.createStatement();
//            String sql = "SELECT * FROM user WHERE username='"+username+"';";
//            ResultSet rs = st.executeQuery(sql);
//            
//            while(rs.next()){
//                pass = rs.getString("password");
//                user = rs.getString("username");
//                notFound = 1;
//            }
//            if(notFound == 1 && password.equals(pass)){
//                HomeView HomeView = new HomeView();
//                HomeView.setVisible(true);
//                signin.dispose();
//            }else{
//               JOptionPane.showMessageDialog(signin, "Incorrect email or password", "Error",
//                        JOptionPane.ERROR_MESSAGE);
//            }
//            
//        }catch(SQLException e){
//            System.out.println("error"+e);
//        }
//    }
//    
//    public void insertDatabase(SignUpView signup) {
//        
//        if (!validasiForm(signup)) {
//            return;
//        }
//        
//        try {
//
//            Connection con = Koneksi.getConnection();
//            Statement st = con.createStatement();
//            String simpan = "INSERT INTO user (email, username, name, password) VALUES ('"
//                    + signup.getjTextFieldEmail().getText() + "', '"
//                    + signup.getjTextFieldUsername().getText() + "', '"
//                    + signup.getjTextFieldName().getText() + "', '"
//                    + String.valueOf(signup.getjPasswordField().getPassword()) + "')";
//            int SA = st.executeUpdate(simpan);
//            JOptionPane.showMessageDialog(signup, "Register Berhasil");
//            signup.setVisible(false);
//            new SignInView().setVisible(true); // Ubah dari SignUpView ke SignInView agar user bisa login setelah register
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(signup, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(signup, "ERROR: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//    
//    public boolean validasiForm(SignUpView signup) {
//        boolean valid = true;
//
//        if (signup.getjTextFieldEmail().getText().isEmpty()) {
//            signup.getjLabelEmailValid().setVisible(true);
//            valid = false;
//        } else {
//            signup.getjLabelEmailValid().setVisible(false);
//        }
//
//        if (signup.getjTextFieldUsername().getText().isEmpty()) {
//            signup.getjLabelUsernameValid().setVisible(true);
//            valid = false;
//        } else {
//            signup.getjLabelUsernameValid().setVisible(false);
//        }
//
//        if (signup.getjTextFieldName().getText().isEmpty()) {
//            signup.getjLabelNameValid().setVisible(true);
//            valid = false;
//        } else {
//            signup.getjLabelNameValid().setVisible(false);
//        }
//
//        if (signup.getjPasswordField().getPassword().length == 0) {
//            signup.getjLabelPasswordValid().setVisible(true);
//            valid = false;
//        } else {
//            signup.getjLabelPasswordValid().setVisible(false);
//        }
//
//        return valid;
//    }
}
