package com.hillel.java.introduction.lesson3;

import java.time.LocalDateTime;
import java.util.Random;

public class TestMain {

    static Integer resultInteger = 0;

    public static void main(String[] args) {
        String text = "Hello world and other worlds!";

//        int from = 0;
//        while((from = text.indexOf("world", from)) != -1) {
//            System.out.println("Endless loop");
//        }


        printHello("Hello");

        System.out.println("Add: " + add(2, 7));

        int result = 0;

        addNumber(2, 7, result);

        System.out.println("Result after method call: " + result);

        add(1, 2);
        add(1, 2, 3, 4);

    }
//
//    public static int add(int a, int b) {
//        return a + b;
//    }

    public static String[] extractSentence(String paragraph) {
        int currentIndex = 0;
        int prevIndex = 0;

        String[] sentences = new String[10];
        int sentenceIndex = 0;

        boolean hasMoreSentences = true;

        while(hasMoreSentences) {
            int nextDotIndex = paragraph.indexOf('.', currentIndex);
            int nextQuestionIndex = paragraph.indexOf('?', currentIndex);

            if (nextDotIndex == -1 && nextQuestionIndex == -1) {
                hasMoreSentences = false;
            } else {
                currentIndex = nextDotIndex != -1 && nextQuestionIndex != -1 ? Math.min(nextDotIndex, nextQuestionIndex) : Math.max(nextDotIndex, nextQuestionIndex);

                sentences[sentenceIndex++] = paragraph.substring(prevIndex, currentIndex + 1) + '\n';
                prevIndex = ++currentIndex;
                System.out.println(currentIndex);
            }
        }

        return sentences;
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

     static int add(int... args) {
        int result = 0;

        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }

        return result;
    }

    public static int add(int a, double b) {
        if (a < b) {
            return a * 10;
        }
        return (int) b;
    }

    public static void addNumber(int a, int b, int result) {
        result = a + b;
        System.out.println("Result inside method call: " + result);
    }

    public static void printHello(String whatToSay) {
        System.out.println(whatToSay);

        if (LocalDateTime.now().isBefore(LocalDateTime.MAX)) {

        } else {
            System.out.println("We are in the future");
        }
    }

    public int getRandom() {
        return new Random().nextInt(100);
    }
}
