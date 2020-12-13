package com.hillel.java.introduction.lesson11;

import java.util.Iterator;

public class BookLibrary implements Library, Iterable<Book> {

    private BookEntry list;

    @Override
    public void add(Book book) {
        if (list == null) {
            list = new BookEntry(book);
        } else {
            BookEntry temporary = list;

            while (temporary.next != null) {
                temporary = temporary.next;
            }

            temporary.next = new BookEntry(book);
        }
    }

    @Override
    public Book get(String title) {
        if (list == null) {
            return null;
        } else {
            BookEntry temp = list;
            Book book = null;
            boolean found = false;

            while (temp != null && !found) {
                if (temp.book.getTitile().equals(title)) {
                    book = temp.book;
                    found = true;
                }
                temp = temp.next;
            }

            return book;
        }
    }

    @Override
    public void printAuthors() {
        if (list == null) {
            System.out.println("Library is empty");
        } else {
            BookEntry temp = list;

            do {
                System.out.println(temp.book);
                temp = temp.next;
            } while (temp != null);
        }
    }

    public class BookEntry {

        private Book book;
        private BookEntry next;

        public BookEntry(Book book) {
            this.book = book;
        }

    }

    @Override
    public Iterator<Book> iterator() {
        return new Iterator<Book>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Book next() {
                return null;
            }
        };
    }

    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Book");
        bookLibrary.add(book);
        BookLibrary.BookEntry bookEntry = bookLibrary.new BookEntry(book);
        bookLibrary.printAuthors();
    }
}
