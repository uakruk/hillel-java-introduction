package com.hillel.java.introduction.lesson11;

public interface Library {

    void add(Book book);

    Book get(String author);

    void printAuthors();
}
