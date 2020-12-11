package com.hillel.java.introduction.game.model;

public class Knight extends Unit {

    public Knight(double health, double level, Team friends, Team enemies) {
        // TODO: same logic like described for the 'Healer.java'
        super(2000, 2000, 1, friends, enemies);
    }

    @Override
    public void hit(Unit other) {
        // here your code
    }
}
