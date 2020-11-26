package com.hillel.java.introduction.lesson11;

public class Book {

    private String titile;

    public Book(String title) {
        this.titile = title;
    }

    public String toString() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getTitile() {
        return titile;
    }
}
