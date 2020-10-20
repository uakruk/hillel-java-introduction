package com.hillel.java.introduction.oleksiiananchenko.HW4;

import com.hillel.java.introduction.lesson3.Constants;

public class TextHomeAssignment {

    public static void main(String[] args) {
        final String text = Constants.TEXT;

        // 1. Count how many question sentences are present in the text. Print this number.
        // 2. Edit the given text according to the following rules:
        //  * Each paragraph should start with some indentation (like tabulation, '\t') and end with the newline ('\n')
        //  * Each sentence should end with the newline ('\n')
        //  * Replace all "for example" with "for INSTANCE" in the text.
        //
        // Note: you have to count how many paragraphs do you have in the text first.
        //    After that you can create an array of the desired length. After that, using the .substring(fromIndex, toIndex)
        //    method for paragraph extracting assign these paragraph string values into the array (e.g.: array[myIndex] = text.substring(fromIndex, toIndex))
        //    Next, prepend the tabulation symbol to the extracted and assigned paragraph values. Hint: you can combine assignment to the array and adding the tabulation.
        //    Then, iterating through each paragraph try to extract each sentence, append a newline symbol, and add it to the resulting text.
        //    Hint: The sentence can end with a dot '.' or a question mark '?' (and the '!' symbol, but it's not present in the text)
        //       so please consider the case when you can have both types of sentences in the same paragraph, and while iterating through the paragraph,
        //       before extracting the sentence from the paragraph, you have to take the smaller index (the closest one to the current position)
        //       and only after that extract the substring (sentence) from the paragraph.
        // One more important note: the .indexOf() mehtod returns the '-1' if no substring was found in the text.
    }
}
