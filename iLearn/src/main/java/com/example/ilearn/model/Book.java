package com.example.ilearn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @Column
    private int ISBN ;
    @Column(name ="bookName")
    private String bookName;
    @Column(name ="autori")
    private String autori;


    public Book() {
    }

    public Book(int ISBN, String bookName, String autori) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.autori = autori;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutori() {
        return autori;
    }

    public void setAutori(String autori) {
        this.autori = autori;
    }
}
