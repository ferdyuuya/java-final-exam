/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homepage;

import java.util.List;

/**
 *
 * @author ferdy
 */
public class InsertBook {
    //Deklarasi variabel
    private String id_book;
    private String titles;
    private String author;
    private String publisher;
    private int release_date;
    private String isbn;
    
    //Contructors

    public InsertBook(String id_book, String titles, String author, String publisher, int release_date, String isbn) {
        this.id_book = id_book;
        this.titles = titles;
        this.author = author;
        this.publisher = publisher;
        this.release_date = release_date;
        this.isbn = isbn;
    }

    //Getter

    public String getId_book() {
        return id_book;
    }

    public String getTitles() {
        return titles;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getRelease_date() {
        return release_date;
    }

    public String getIsbn() {
        return isbn;
    }
    
    
    
}
    //Getter dan Setter

    
    
    

