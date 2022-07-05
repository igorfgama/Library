package model;

import enums.TypeBook;

import java.math.BigDecimal;

public class Book {
    private String title;
    private String author;
    private int release;
    private TypeBook typeBook;

    public Book(String title, String author, int release, TypeBook typeBook){
        this.title = title;
        this.author = author;
        this.release = release;
        this.typeBook = typeBook;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getRelease() {
        return release;
    }
    public BigDecimal getTypeBook(){
        return typeBook.getBookDailyValue(typeBook);
    }
}
