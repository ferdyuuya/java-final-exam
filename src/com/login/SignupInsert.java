package com.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.DatabaseCon.DBcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferdy
 */
public class SignupInsert {
    public void insertDataSignUp(SignupData signupDataObj){
        try {
            //Buat query untuk insert data signup
            String query = "INSERT INTO login (fullname, username, email, password) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = DBcon.con.prepareStatement(query);
            //Set parameter ke database
            ps.setString(1, signupDataObj.getFullname()); //Dapatkan Fullname dari SignupData
            ps.setString(2, signupDataObj.getUsername()); //Dapatkan Username dari SignupData
            ps.setString(3, signupDataObj.getEmail()); //Dapatkan Email dari SignupData
            ps.setString(4, signupDataObj.getPassword()); //Dapatkan Password dari SignupData
            ps.executeUpdate(); //Execute query dan return nilai y
            JOptionPane.showMessageDialog(null, "Signup Successfully, now go to Login");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e, null, 0);
        }
    }
    
    public boolean checkLogin(String username, String password){
        boolean b = false;
        try {
            String query = "Select username, password from login where username ='"+username+"' AND password ='"+password+"'";
            Statement st = DBcon.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()){
                b = true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return b;
    }
}
