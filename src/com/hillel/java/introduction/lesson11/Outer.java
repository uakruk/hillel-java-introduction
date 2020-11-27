package com.hillel.java.introduction.lesson11;

public class Outer {

    private String name;

    private int field;

    public String getName() {
        return name;
    }

    public void printInner() {
        Inner inner = new Inner();
       // inner.name
    }

    private class Inner {
        private String name;

        public String getName() {
            System.out.println("Outer name" + Outer.this.name);
            System.out.println(field);
            return name;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.name = "Outer";

        Inner inner = outer.new Inner();
        inner.name = "Inner";

        System.out.println(outer.name);
        System.out.println(inner.name);

        System.out.println(outer.getName());
        System.out.println(inner.getName());
    }
}
