package com.hillel.java.introduction.lesson11;

public class BookLibraryTest {

    public static void main(String[] args) {
        Library bookLibrary = new BookLibrary();
        bookLibrary.add(new Book("Jonson"));
        bookLibrary.add(new Book("Trump"));

        bookLibrary.printAuthors();
    }
}
