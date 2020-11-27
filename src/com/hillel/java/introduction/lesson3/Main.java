package com.hillel.java.introduction.lesson3;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
       String someString = "Black cat category";

        int cat = someString.indexOf("cat");

        System.out.println("Cat index " + cat);

        int nextCat = someString.indexOf("cat", 7);

        System.out.println("Cat index " + nextCat);

        int lastCat = someString.lastIndexOf("cat");

        System.out.println("Last cat index " + lastCat);

        String text = "The cat (Felis catus) is a domestic species of small carnivorous mammal.[1][2] It is the only domesticated species in the family Felidae and is often referred to as the domestic cat to distinguish it from the wild members of the family.[4] A cat can either be a house cat, a farm cat or a feral cat; the latter ranges freely and avoids human contact.[5] Domestic cats are valued by humans for companionship and their ability to hunt rodents. About 60 cat breeds are recognized by various cat registries.[6]\n" +
                "\n" +
                "The cat is similar in anatomy to the other felid species: it has a strong flexible body, quick reflexes, sharp teeth and retractable claws adapted to killing small prey. Its night vision and sense of smell are well developed. Cat communication includes vocalizations like meowing, purring, trilling, hissing, growling and grunting as well as cat-specific body language. A predator that is most active at dawn and dusk, the cat is a solitary hunter but a social species. It can hear sounds too faint or too high in frequency for human ears, such as those made by mice and other small mammals.[7] It secretes and perceives pheromones.[8]";

        int secondChapterIndex = text.indexOf("The cat is similar");

//        System.out.println(text);
//
//        String secondChapter = text.substring(secondChapterIndex);
//
//        System.out.println("------------------");
//        System.out.println("Second chapter only:");
//
//        System.out.println(secondChapter);
//
//        String firstSentenceOnly = secondChapter.substring(0, secondChapter.indexOf('.'));
//        System.out.println(firstSentenceOnly);
//
//        System.out.println(secondChapter.substring(3, 10));


        System.out.println("1" + (2 + 3));

        System.out.println(1 + 2 + "3" + 4);
    }
}
