package com.hillel.java.introduction.katerynadanko.lesson9.lection.oop;

public class Room {

    public static void animalsConflict1(Animal... animal){
        /*alternative method*/
        for(int i = 0; i<animal.length; i++) {
            if (animal[i] instanceof Cat){
                if (animal[i+1] instanceof Dog) {
                System.out.println("Animals conflict");
            }
            else {
             System.out.println("Animals got friends");
            }
            i++;
        }
    }
    }

    public static void animalsConflict(Animal... animal){
        for(int i = 0; i<animal.length-1; i++) {
            if ((animal[i] instanceof Cat) ||
                 (animal[i+1] instanceof Dog)) {
                    System.out.println("Animals conflict");
                }
                else {
                    System.out.println("Animals got friends");
                }
            }
    }

    public static void main(String[] args) {

        Animal sphinksCat = new SphinksCat("soft");
        Animal siberianCat = new SiberianCat("very soft", 25);
        Animal mainCun = new MainCun();

        Animal labrador = new Labrador("Black", 2);
        Animal ovcharka = new Ovcharka();
        Animal dog = new Dog();

        animalsConflict(siberianCat, sphinksCat, mainCun, labrador, dog);
        animalsConflict(labrador, ovcharka, dog);
        animalsConflict(labrador, siberianCat, sphinksCat);
    }
}
