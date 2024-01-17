/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DatabaseCon;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * author ferdy
 */
public class DBcon {
    
    public static Connection con = null;
    
    //Metode untuk membuat koneksi ke database
    public static void loadConnection(){
        String url = "jdbc:mysql://localhost:3306/book_db";
        String root = "root";
        String pass = "";
        
        try {
            con = DriverManager.getConnection(url, root, pass);

            if (con != null) {
                JOptionPane.showMessageDialog(null, "Database has been successfully connected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static boolean isConnectionNull() {
        return con == null;
    }
}
