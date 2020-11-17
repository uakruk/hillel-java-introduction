package com.hillel.java.introduction.lesson3;

public class TextHomeAssignment {

    public static void main(String[] args) {
        final String text = Constants.TEXT;

        int counter = 0;
        for(int i = 0; i < text.length(); i++) {
            Character letter = text.toCharArray()[i];
            if( letter.toString().equals("?") ) {
                counter ++; }
        }
        System.out.println(counter);

        int questionMarks = 0;
        for(Character letter : text.toCharArray()) {
            if(letter.toString().equals("?")) {
                questionMarks ++;
            }
        }
        System.out.println("Question marks count : " + questionMarks);

        int from = 0;
        int count = 0;
        while (text.indexOf("?", from) != -1) {
            count ++;
            from = text.indexOf("?", from) + 1;
        }
        System.out.println("count : " + count);


        int fromIndex = 0;
        String newText = "";
        int paragraphs = ParagraphsNumber(text,"\n" + "\n");

        String [] Array = new String[paragraphs];
        for (int i = 0; i<paragraphs; i++) {
            if(text.indexOf("\n" + "\n", fromIndex)!=-1) {
                Array[i] = "\t" + text.substring(fromIndex, text.indexOf("\n" + "\n", fromIndex));
                Array[i] = LineBreakAfterDotAndQuestionMark(Array[i]);
                fromIndex = text.indexOf("\n" + "\n", fromIndex)+2;
            } else {
                Array[i] = LineBreakAfterDotAndQuestionMark("\t" + text.substring(fromIndex, text.length()));
            }
            newText = newText + Array[i];
        }
        System.out.println(newText);

    }
    public static int ParagraphsNumber(String text, String paragraphBorder) {
        int indexFrom = 0;
        int counter = 1;
        while (text.indexOf(paragraphBorder, indexFrom) != -1) {
            counter++;
            indexFrom = text.indexOf(paragraphBorder, indexFrom) +1;
        }
        return counter;
    }
    public static String LineBreakAfterDotAndQuestionMark(String text) {
        return text.replace(".", ". \n").replace("?", "? \n");
    }
    public static int MinUsingTernary (int firstValue, int secondValue) {
        return (firstValue < secondValue ) ? firstValue : secondValue;
    }

    public static int maxUsingTernary (int firstValue, int secondValue) {
        return (firstValue > secondValue ) ? firstValue : secondValue;
    }
}



