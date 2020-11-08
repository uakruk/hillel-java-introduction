package com.hillel.java.introduction.katerynadanko.lesson4;

public class Constants {

    public static final String TEXT =
                    "\t" + "Thanks to the field of linguistics we know much about the development of the 5,000 plus languages in existence today. \n We can describe their grammar and pronunciation and see how their spoken and written forms have changed over time. \nFor example, we understand the origins of the Indo-European group of languages, which includes Norwegian, Hindi and English, and can trace them back to tribes in eastern Europe in about 3000 BC.\n" +
                    "\n" +
                    "\t" + "So, we have mapped out a great deal of the history of language, but there are still areas we know little about. \nExperts are beginning to look to the field of evolutionary biology to find out how the human species developed to be able to use language. \nSo far, there are far more questions and half-theories than answers.\n" +
                    "\n" +
                    "\t" + "We know that human language is far more complex than that of even our nearest and most intelligent relatives like chimpanzees. We can express complex thoughts, convey subtle emotions and communicate about abstract concepts such as past and future. \nAnd we do this following a set of structural rules, known as grammar. \nDo only humans use an innate system of rules to govern the order of words? \n Perhaps not, as some research may suggest dolphins share this capability because they are able to recognise when these rules are broken.\n" +
                    "\n" +
                    "\t" + "If we want to know where our capability for complex language came from, we need to look at how our brains are different from other animals. \nThis relates to more than just brain size; it is important what other things our brains can do and when and why they evolved that way. \nAnd for this there are very few physical clues; artefacts left by our ancestors don't tell us what speech they were capable of making. \n One thing we can see in the remains of early humans, however, is the development of the mouth, throat and tongue. \n By about 100,000 years ago, humans had evolved the ability to create complex sounds. \n Before that, evolutionary biologists can only guess whether or not early humans communicated using more basic sounds.\n" +
                    "\n" +
                    "\t" + "Another question is, what is it about human brains that allowed language to evolve in a way that it did not in other primates? \nAt some point, our brains became able to make our mouths produce vowel and consonant sounds, and we developed the capacity to invent words to name things around us. \nThese were the basic ingredients for complex language. \nThe next change would have been to put those words into sentences, similar to the 'protolanguage' children use when they first learn to speak. \nNo one knows if the next step – adding grammar to signal past, present and future, for example, or plurals and relative clauses – required a further development in the human brain or was simply a response to our increasingly civilised way of living together.\n" +
                    "\n" +
                    "\t" + "Between 100,000 and 50,000 years ago, though, we start to see the evidence of early human civilisation, through cave paintings for example; no one knows the connection between this and language. \nBrains didn't suddenly get bigger, yet humans did become more complex and more intelligent. \nWas it using language that caused their brains to develop? \nOr did their more complex brains start producing language?\n" +
                    "\n" +
                    "\t" + "More questions lie in looking at the influence of genetics on brain and language development. \nAre there genes that mutated and gave us language ability? \nResearchers have found a gene mutation that occurred between 200,000 and 100,000 years ago, which seems to have a connection with speaking and how our brains control our mouths and face. \nMonkeys have a similar gene, but it did not undergo this mutation. \n It's too early to say how much influence genes have on language, but one day the answers might be found in our DNA.";


    public static final String TEXT_OLD =
             "Thanks to the field of linguistics we know much about the development of the 5,000 plus languages in existence today. We can describe their grammar and pronunciation and see how their spoken and written forms have changed over time. For example, we understand the origins of the Indo-European group of languages, which includes Norwegian, Hindi and English, and can trace them back to tribes in eastern Europe in about 3000 BC." +
                    "\n" +
                     "So, we have mapped out a great deal of the history of language, but there are still areas we know little about. Experts are beginning to look to the field of evolutionary biology to find out how the human species developed to be able to use language. So far, there are far more questions and half-theories than answers." +
                    "\n" +
                     "We know that human language is far more complex than that of even our nearest and most intelligent relatives like chimpanzees. We can express complex thoughts, convey subtle emotions and communicate about abstract concepts such as past and future. And we do this following a set of structural rules, known as grammar. Do only humans use an innate system of rules to govern the order of words? Perhaps not, as some research may suggest dolphins share this capability because they are able to recognise when these rules are broken." +
                    "\n" +
                    "If we want to know where our capability for complex language came from, we need to look at how our brains are different from other animals. This relates to more than just brain size; it is important what other things our brains can do and when and why they evolved that way. And for this there are very few physical clues; artefacts left by our ancestors don't tell us what speech they were capable of making. One thing we can see in the remains of early humans, however, is the development of the mouth, throat and tongue. By about 100,000 years ago, humans had evolved the ability to create complex sounds. Before that, evolutionary biologists can only guess whether or not early humans communicated using more basic sounds." +
                    "\n" +
                    "Another question is, what is it about human brains that allowed language to evolve in a way that it did not in other primates? At some point, our brains became able to make our mouths produce vowel and consonant sounds, and we developed the capacity to invent words to name things around us. These were the basic ingredients for complex language. The next change would have been to put those words into sentences, similar to the 'protolanguage' children use when they first learn to speak. No one knows if the next step – adding grammar to signal past, present and future, for example, or plurals and relative clauses – required a further development in the human brain or was simply a response to our increasingly civilised way of living together." +
                    "\n" +
                    "Between 100,000 and 50,000 years ago, though, we start to see the evidence of early human civilisation, through cave paintings for example; no one knows the connection between this and language. Brains didn't suddenly get bigger, yet humans did become more complex and more intelligent. Was it using language that caused their brains to develop? Or did their more complex brains start producing language?" +
                    "\n" +
                    "More questions lie in looking at the influence of genetics on brain and language development. Are there genes that mutated and gave us language ability? Researchers have found a gene mutation that occurred between 200,000 and 100,000 years ago, which seems to have a connection with speaking and how our brains control our mouths and face. Monkeys have a similar gene, but it did not undergo this mutation. It's too early to say how much influence genes have on language, but one day the answers might be found in our DNA.";

    public static void main(String[] args) {
        int from = 0;
        int countQuestion = 0;
        while ((from = TEXT.indexOf('?', from)) != -1) {
            countQuestion++;
            from++;
        }
        String TEXT2 = TEXT.replaceAll("for example", "for INSTANCE");
        int paragraphsCount = 0;
        int fromParagraphs = 0;
        while ((fromParagraphs = TEXT.indexOf('\n', fromParagraphs)) != -1) {
            paragraphsCount++;
            fromParagraphs++;
        }

        int fromParagraph = 0;
        int fromSentences = 0;
        int counter = 0;
        int startParagraph = 0;
        String paragraph;
        String paragraphsArray[] = new String[10];

//        String sentencesArray [] = new String[50];
//        String sentences;
//        int sentencesCount = 0;

        while ((fromParagraph = TEXT_OLD.indexOf('\n', fromParagraph)) != -1) {
            fromParagraph++;


            if (fromParagraph != -1) {
                paragraph = TEXT_OLD.substring(startParagraph, fromParagraph);
            } else {
                paragraph = TEXT_OLD.substring(startParagraph);
            }
            paragraphsArray[counter] = paragraph;
            startParagraph = fromParagraph;

            counter++;
            System.out.println("Paragraph " + counter + ": " + paragraph);

//            while ((fromSentences = paragraph.indexOf('.' | '?', fromSentences)) != -1) {
//                fromSentences++;
//                sentences = paragraph.substring(startParagraph, '.' | '?');
//                sentencesArray [sentencesCount] = sentences;
//                startParagraph = ('.' | '?');
//                sentencesCount++;
//                System.out.println(sentences);
//            }

    }

        System.out.println("Text with \"for INSTANCE\": ");
        System.out.println(TEXT2);
        System.out.println();
        System.out.println("Number of question mark: " + countQuestion);
        System.out.println("Number of paragraphs: " + paragraphsCount);
    }

}




    //PolicyUtils.Text

