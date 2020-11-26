package com.hillel.java.introduction.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextHomeAssignmentCompleted {

    public static void main(String[] args) {
        String text = Constants.TEXT;

        int questionMarksCount = 0;
        int dotsCount = 0;

        int currentFoundIndex = 0;

        while ((currentFoundIndex = text.indexOf('?', currentFoundIndex)) != -1) {
            questionMarksCount++;
            currentFoundIndex++;
        }

        System.out.println("Question sentences = " + questionMarksCount);

        currentFoundIndex = 0;
        int previousIndex = 0;

        List<String> chapters = new ArrayList<>();

        int chaptersFound = countChapters(text, "\n");

        while ((currentFoundIndex = text.indexOf('\n', currentFoundIndex)) != -1) {
         //   chapters.add("\t" + text.substring(previousIndex, currentFoundIndex));
            currentFoundIndex++;
            chaptersFound++;
            previousIndex = currentFoundIndex;
        }

        String[] chapterArray = new String[chaptersFound];

        int chapterIndex = 0;
        currentFoundIndex = 0;
        previousIndex = 0;

        while ((currentFoundIndex = text.indexOf('\n', currentFoundIndex)) != -1) {
            chapterArray[chapterIndex++] = ("\t" + text.substring(previousIndex, currentFoundIndex));
            currentFoundIndex++;
            previousIndex = currentFoundIndex;
        }

        String resultText = "";
        for (int i = 0; i < chapterArray.length; i++) {
            int currentIndex = 0;
            int prevIndex = 0;

            boolean hasMoreSentences = true;

            while(hasMoreSentences) {
                int nextDotIndex = chapterArray[i].indexOf('.', currentIndex);
                int nextQuestionIndex = chapterArray[i].indexOf('?', currentIndex);

                if (nextDotIndex == -1 && nextQuestionIndex == -1) {
                    hasMoreSentences = false;
                } else {
                    currentIndex = nextDotIndex != -1 && nextQuestionIndex != -1 ? Math.min(nextDotIndex, nextQuestionIndex) : Math.max(nextDotIndex, nextQuestionIndex);

                    resultText += chapterArray[i].substring(prevIndex, currentIndex + 1) + '\n';
                    prevIndex = ++currentIndex;
                    System.out.println(currentIndex);
                }
            }
//            do {
//                int nextDotIndex = chapterArray[i].indexOf('.', currentIndex);
//                int nextQuestionIndex = chapterArray[i].indexOf('?', currentIndex);
//
//
//            }
//            while ((currentIndex = chapterArray[i].indexOf('.', currentIndex)) != -1) {
//                currentIndex = chapterArray[i].indexOf('?')
//                resultText += chapterArray[i].substring(prevIndex, currentIndex + 1) + '\n';
//                prevIndex = ++currentIndex;
//            }
            resultText += '\n';
        }

        resultText = resultText.replace("ololo", "trololo");
      //  resultText = resultText.replaceAll("[Oo]lolo", "trololo")
        System.out.println(resultText);

  //      String resultTest = chapters.stream().collect(Collectors.joining("\n"));

    //    System.out.println(resultTest);
    }

    public static int countChapters(String text, String searchCharacter) {
        int chaptersFound = 0;
        int currentFoundIndex = 0;
        int previousIndex = 0;

        while ((currentFoundIndex = text.indexOf(searchCharacter, currentFoundIndex)) != -1) {
            //   chapters.add("\t" + text.substring(previousIndex, currentFoundIndex));
            currentFoundIndex++;
            chaptersFound++;
            previousIndex = currentFoundIndex;
        }
        return chaptersFound;
    }
}
