package com.hillel.java.introduction.game.model;

public class Magic extends Unit {

    public Magic(double healthMax, Team friends, Team enemies) {
        // TODO: same logic like described for the 'Healer.java'
        super(healthMax, healthMax, 1, friends, enemies);
    }

    @Override
    public void hit(Unit other) {

    }
}
