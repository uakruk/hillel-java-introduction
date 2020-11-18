package com.hillel.java.introduction.katerynadanko.lesson9.lection.oop;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.eat();
        System.out.println(cat.boss);
        System.out.println(cat);

        Cat sphinksCat = new SphinksCat("Soft");
        Cat siberianCat = new SiberianCat();
        Cat mainCun = new MainCun("Hard", 2);

        Dog labrador = new Labrador("White", 5);
        Dog ovcharka = new Ovcharka();
        Dog dog = new Dog();

        Dog jeckRassel = new JeckRassel();
        Dog jeckRassel2 = new JeckRassel(2,4, "Sharik");

        System.out.println(jeckRassel);
        System.out.println(jeckRassel2);
        jeckRassel.eatShoes();
        jeckRassel2.eatShoes();

        siberianCat.sound();
        labrador.sound();

        System.out.println(labrador);







        
    }
}
