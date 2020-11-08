package com.hillel.java.introduction.katerynadanko.lesson4;

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

//    public static String findParagraph(String paragraphText) {
//        String paragraph;
//        int count = 0;
//        int searchFromIndex = 0;
//        int engParagraph = paragraphText.indexOf('.' | '?' | '!');
//
//        while (paragraphText.substring(searchFromIndex, engParagraph)
//                .indexOf(engParagraph) != -1) {
//            engParagraph = (paragraphText.substring(engParagraph + 1).indexOf(engParagraph));
//
//            String paragraphArray[] = new String[10];
//
//            paragraph = paragraphText.substring(searchFromIndex, engParagraph);
//            paragraphArray[count] = paragraph;
//            count++;
//            return paragraph;
//        }
//        return  ;
//    }

    public static int countSentences(String text){
        int from = 0;
        int count = 0;
        while ((from = text.indexOf('.' | '?' | '!', from)) != -1) {
            count++;
            from++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(max(2, 6));
        System.out.println(max1(2, 6));
        System.out.println(min(7, 5));
        System.out.println(min1(7, 5));
        String fromWiki =
                "\t"+ "History (from Greek ἱστορία, historia, meaning \"inquiry; knowledge acquired by investigation\") is the study of the past."
                +"\t"+"Events occurring before the invention of writing systems are considered prehistory."
                +"\t"+"\"History\" is an umbrella term that relates to past events as well as the memory, discovery, collection, organization, presentation, and interpretation of information about these events.";
//        System.out.println(findParagraph(fromWiki));
        System.out.println(countSentences(fromWiki));
}
}