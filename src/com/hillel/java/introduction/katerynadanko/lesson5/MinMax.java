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

    public static int returnEndIndex(String paragraphText, int searchFromIndex){
        int endOfSentences1 = paragraphText.indexOf('.', searchFromIndex)-1;
        int endOfSentences2 = paragraphText.indexOf('!', searchFromIndex)-1;
        int endOfSentences3 = paragraphText.indexOf('?', searchFromIndex)-1;

        if ((endOfSentences1 < endOfSentences2) | (endOfSentences1 < endOfSentences3))
            return endOfSentences1;
        else if ((endOfSentences2 < endOfSentences1) | (endOfSentences2 < endOfSentences3))
            return endOfSentences2;
        else if ((endOfSentences3 < endOfSentences1) | (endOfSentences3 < endOfSentences2))
            return endOfSentences2;
        else
            return -1;
    }

public static int countSentences (String paragraph, String serchEndOfSentences) {
    int beginningOfParagraph = 0;
    int amountOfSentences = 0;

    while ((beginningOfParagraph = paragraph.indexOf(serchEndOfSentences, beginningOfParagraph)) != -1) {
        beginningOfParagraph++;
        amountOfSentences++;
    }
    return amountOfSentences;
}


    public static void extractSentences (String paragraph) {

        int searchFromIndex = 0;
        int endOfSentences1 = 0;
        int endOfSentences2 = 0;
        int endOfSentences3 = 0;

//        int endOfSentences2 = paragraph.indexOf('!', searchFromIndex);
//        int endOfSentences3 = paragraph.indexOf('?', searchFromIndex);

        String[] sentences = new String[10];
        String sentence;


    int endOfSentences = 0;
        int counter = 0;

        while ((searchFromIndex = paragraph.indexOf(endOfSentences1, searchFromIndex)) != -1) {

            endOfSentences1 = paragraph.indexOf('.', searchFromIndex);
            endOfSentences2 = paragraph.indexOf('?', searchFromIndex);
            endOfSentences3 = paragraph.indexOf('!', searchFromIndex);

            if (endOfSentences1 != -1) {
                sentence = paragraph.substring(searchFromIndex, endOfSentences1);
            } else {
                sentence = paragraph.substring(searchFromIndex);
            }

            sentences[counter] = sentence;
            searchFromIndex = endOfSentences;
            counter++;
            System.out.println("sentence " + counter + " " + sentence);

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

        String task2 = "Create a method which would return the sentence end index depending on the";

        System.out.println("Index of sentences ends: " + returnEndIndex(task, 12));
        System.out.println("Index of sentences ends: " + returnEndIndex(task2, 1));

        System.out.println("Amount of Sentences: " + countSentences(task, "."));

        extractSentences(task);

}
}