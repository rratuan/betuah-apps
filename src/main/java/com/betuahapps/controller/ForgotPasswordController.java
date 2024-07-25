/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.betuahapps.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import main.java.com.betuahapps.Koneksi;
import main.java.com.betuahapps.view.ForgotPasswordView;
import main.java.com.betuahapps.view.HomeView;

/**
 *
 * @author Ocean
 */
public class ForgotPasswordController {
    
    
    // Method pengecekan email pada database dan juga membuat text field password jadi bisa di edit (true)
    public void getDatabase(ForgotPasswordView forgot) {
        Connection con;
         String email,user=null;
         int notFound=0;
         
         try{
            email = forgot.getjTextFieldEmail().getText();
            con = Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM user WHERE email='"+email+"';";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                user = rs.getString("email");
                notFound = 1;
            }
            if(notFound == 1 && email.equals(user)){
                forgot.getjLabelVerifyEmail().setVisible(true);
                forgot.getjLabelVerifyEmail().setText("*Email Ada di Database");
                forgot.getjPasswordFieldNew().setEditable(true);
                forgot.getjPasswordFieldConfirm().setEditable(true);
            }else{
                forgot.getjLabelVerifyEmail().setVisible(true);
                forgot.getjLabelVerifyEmail().setText("*Email Tidak Ada di Database");
                forgot.getjPasswordFieldNew().setEditable(false);
                forgot.getjPasswordFieldConfirm().setEditable(false);
            }
            
        }catch(SQLException e){
            System.out.println("error"+e);
        }
    }
    
}
