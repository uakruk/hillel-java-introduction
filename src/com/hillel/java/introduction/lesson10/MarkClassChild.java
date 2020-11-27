package com.hillel.java.introduction.lesson10;

import java.io.Serializable;

public class MarkClassChild implements MarkClass, Serializable {

    public static long serialVersionUID = 112415L;

    public static void main(String[] args) {
        MarkClassChild markClassChild = new MarkClassChild();

        if (markClassChild instanceof MarkClass) {

        }

    }

    public static void process(DatabaseProcessor[] array) {
        for (DatabaseProcessor entity : array) {
            if (entity instanceof MarkClass) {
                System.out.println("Catch!");
            }
        }
    }
}
