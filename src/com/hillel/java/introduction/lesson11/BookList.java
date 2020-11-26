package com.hillel.java.introduction.lesson11;

public class BookList {

    private BookNode list;

    public void add(Book book) {
        BookNode bookNode = new BookNode(book);

        class A {
            class B{
                class C {
                    class D{
                        private String field;
                    }
                }
            }
        };

        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        A.B.C.D d = c.new D();

        if (list == null) {
            list = bookNode;
        } else {
            BookNode tempNode = list;

            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
        }
    }

    private class BookNode {
        private Book book;
        private BookNode next;;

        public BookNode(Book book) {
            this.book = book;
        }

    }

    private static class BookNodeStatic {
        Book book;
        BookNode bookNode;

        public BookNodeStatic() {
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello books");
    }
}
