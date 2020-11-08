package com.hillel.java.introduction.katerynadanko.lesson5;

public class MinMax {

    public static double min(double a, double b) {
        if (a > b)
            return b;
        else
            return a;
    }

    public static double min1(double a, double b) {
        return a > b ? b : a;
    }

    public static double max(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static double max1(double a, double b) {
        return a > b ? a : b;
    }

    public static void returnEndIndex(String paragraphText){
        int endOfSentences;
        int searchFromIndex = 0;

        while ((searchFromIndex = paragraphText.indexOf('.'|'?'|'!', searchFromIndex)) != -1) {
            endOfSentences = paragraphText.indexOf('.' | '?' | '!')-1;

            searchFromIndex ++;
                System.out.println(endOfSentences);
        }
    }

public static int countSentences (String paragraph) {
    int fromSentences = 0;
    int amountOfSentences = 0;

    while ((fromSentences = paragraph.indexOf('.' | '?' | '!', fromSentences)) != -1) {
        fromSentences++;
        amountOfSentences++;
    }
    return amountOfSentences;
}

public static void extractSentences (String paragraph){
    String[] sentences = new String[50];
    String sentence = "";
    int searchFromIndex = 0;
    int endOfSentences = 0;
    int counter = 0;

    while ((searchFromIndex = paragraph.indexOf('.'|'?'|'!', searchFromIndex)) != -1) {
            sentence = paragraph.substring(searchFromIndex, endOfSentences);
        }

        sentences[counter] = sentence;
//        searchFromIndex = endOfSentences;
        counter++;

    for(String s : sentences){
        System.out.println(sentence);
    }
    }

    public static void main(String[] args) {
        System.out.println(max(2, 6));
        System.out.println(max1(2, 6));
        System.out.println(min(7, 5));
        System.out.println(min1(7, 5));
        String task = "Create a method which would return the sentence end index depending on the " +
                "searchFromIndex. (має повертати індекс (або ж по іншому позицію) закінчення речення, " +
                "враховуючи стартову позицію). It should have the next input parameters: String paragraphText, " +
                "int searchFromIndex. Remember that the sentence can end not with the dots. " +
                "only but with the question marks as well? and with exclamation marks! You need try to " +
                "search and return the closest index of the sentence end symbol, but remember to return only " +
                "the closest EXISTING position (like if you have text.indexOf? fromIndex) == -1 then you've " +
                "probably don't have any sentences with questions till the end of the paragraph, but you still " +
                "can have sentences of other types. Here you should reuse your previously written methods of " +
                "searching min() and max() values to determine the closest sentence end index. If nothing is " +
                "found then just return the.";

        System.out.println("Index of sentences ends: ");
        returnEndIndex(task);

        System.out.println("Amount of Sentences: " + countSentences(task));

//        extractSentences(task);

}
}