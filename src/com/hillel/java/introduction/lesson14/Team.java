package com.hillel.java.introduction.lesson14;

import java.util.List;

public class Team {

    private static final int MAXIMUM_MAGICANS = 2;

    private List<String> heroes;

    private double availableMoney = 10_000;

   // private int magicansChosen;

    public void addHero(String hero) {
        int magicansChosen = getMagicansChosen();

        if (hero.equals("Magic") && magicansChosen == MAXIMUM_MAGICANS) {
            throw new RuntimeException();
        }

        heroes.add(hero);
    }

    private int getMagicansChosen() {
        int found = 0;
        for (String hero : heroes) {
            if (hero.equals("Magic")) {
                found++;
            }
        }
        return found;
    }
}
