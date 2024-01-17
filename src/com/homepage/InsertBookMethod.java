/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homepage;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import com.DatabaseCon.DBcon;

/**
 *
 * @author ferdy
 */
public class InsertBookMethod {

    //Method Insert Buku untuk memasukkan ke DB
    public void insert(InsertBook insertBook){
        try{
            String query = "INSERT INTO book_tb (titles, author, publisher, release_date, isbn) VALUES (?, ?, ?, ?, ?)"; // Modified query with correct number of placeholders
            PreparedStatement ps = DBcon.con.prepareStatement(query);
            ps.setString(1, insertBook.getTitles());
            ps.setString(2, insertBook.getAuthor());
            ps.setString(3, insertBook.getPublisher());
            ps.setInt(4, insertBook.getRelease_date());
            ps.setString(5, insertBook.getIsbn());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data successfully inserted");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Method Update buku untuk update record di database
    public void update(InsertBook insertBook){
        try{
            String query = "UPDATE book_tb SET titles = ?, author = ?, publisher = ?, release_date = ?, isbn = ? WHERE id_book = ?"; // Modified query with correct number of placeholders
            PreparedStatement ps = DBcon.con.prepareStatement(query);
            ps.setString(6, insertBook.getId_book());
            ps.setString(1, insertBook.getTitles());
            ps.setString(2, insertBook.getAuthor());
            ps.setString(3, insertBook.getPublisher());
            ps.setInt(4, insertBook.getRelease_date());
            ps.setString(5, insertBook.getIsbn());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data successfully updated");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void delete(InsertBook insertBook){
        try{
            //Method delete
            String query = "DELETE FROM book_tb WHERE id_book = ?";
            PreparedStatement ps = DBcon.con.prepareStatement(query);
            ps.setString(1, insertBook.getId_book());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data successfully deleted");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
