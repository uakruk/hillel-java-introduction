package com.hillel.java.introduction.lesson13;

import com.hillel.java.introduction.lesson11.Book;
import com.hillel.java.introduction.lesson11.BookLibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExample {

    static class Key {

        private int number;

        public Key(int number) {
            this.number = number;
        }

        @Override
        public int hashCode() {
            return 31 * number;
        }

        @Override
        public boolean equals(Object obj) {
            return number == Integer.valueOf(obj.toString());
        }
    }

    public static void main(String[] args) {
        Map<String, String> keyMap = new HashMap<>();
        keyMap.put("2", "cats");
        keyMap.put("1", "dogs");
        keyMap.put("3", "birds");

        keyMap.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("2", "cats");
        linkedHashMap.put("1", "dogs");
        linkedHashMap.put("3", "birds");

        linkedHashMap.forEach((key, value) -> System.out.println(key + " " + value));

        List<String> strings = new ArrayList<>();
        boolean stop = false;

//        new ArrayList<>().add;
//        new LinkedList<>().pop()

        strings.add("Hello");
        strings.get(0);
        Iterator<String> iterator = strings.iterator();

        BookLibrary library = new BookLibrary();


    }
}
