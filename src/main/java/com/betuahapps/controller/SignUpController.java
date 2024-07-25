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
import main.java.com.betuahapps.view.HomeView;
import main.java.com.betuahapps.view.SignInView;
import main.java.com.betuahapps.view.SignUpView;

/**
 *
 * @author Ocean
 */
public class SignUpController {
    
    
    // Method penambahan pada database dari textfield yang akan kita butuhkan
    public void insertDatabase(SignUpView signup) {
        
        if (!validasiForm(signup)) {
            return;
        }
        
        try {

            Connection con = Koneksi.getConnection();
            Statement st = con.createStatement();
            String simpan = "INSERT INTO user (email, username, name, password) VALUES ('"
                    + signup.getjTextFieldEmail().getText() + "', '"
                    + signup.getjTextFieldUsername().getText() + "', '"
                    + signup.getjTextFieldName().getText() + "', '"
                    + String.valueOf(signup.getjPasswordField().getPassword()) + "')";
            int SA = st.executeUpdate(simpan);
            JOptionPane.showMessageDialog(signup, "Register Berhasil");
            signup.setVisible(false);
            new SignInView().setVisible(true); // Ubah dari SignUpView ke SignInView agar user bisa login setelah register
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(signup, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(signup, "ERROR: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    // Method menampilkan peringatan email, username, name, dan password jika tidak di isi
    public boolean validasiForm(SignUpView signup) {
        boolean valid = true;

        if (signup.getjTextFieldEmail().getText().isEmpty()) {
            signup.getjLabelEmailValid().setVisible(true);
            valid = false;
        } else {
            signup.getjLabelEmailValid().setVisible(false);
        }

        if (signup.getjTextFieldUsername().getText().isEmpty()) {
            signup.getjLabelUsernameValid().setVisible(true);
            valid = false;
        } else {
            signup.getjLabelUsernameValid().setVisible(false);
        }

        if (signup.getjTextFieldName().getText().isEmpty()) {
            signup.getjLabelNameValid().setVisible(true);
            valid = false;
        } else {
            signup.getjLabelNameValid().setVisible(false);
        }

        if (signup.getjPasswordField().getPassword().length == 0) {
            signup.getjLabelPasswordValid().setVisible(true);
            valid = false;
        } else {
            signup.getjLabelPasswordValid().setVisible(false);
        }

        return valid;
    }
    
}
