package com.hillel.java.introduction.lesson14;

import java.util.List;

public abstract class Unit {

    protected static final double HEALTH_MULTIPLIER = 200;

    double healthLevel;

    double armor;

    double attackDamage;

    double currentLevel;

    private List<Invertory> invertoryList;

    public abstract void fight(Unit unit);

    private void checkLevel() {

    }

    public void addInvertory(Invertory invertory) {
        invertoryList.add(invertory);
    }

    public double getHealthLevel() {
        double healthIncrease = 0;
        for (Invertory invertory : invertoryList) {
            if (invertory.getCharacteristics() == Characteristics.HEALTH_LEVEL_INCREASE) {
                healthIncrease += invertory.getValue();
            }
        }
        return healthLevel + healthIncrease;
    }

    protected void increaseLevel(double howMuch) {
        double levelBefore = currentLevel;

        currentLevel += howMuch;

        double changed = currentLevel - levelBefore;

        if (changed >= 1) {
            healthLevel += (int) changed * HEALTH_MULTIPLIER;
        }

    }
}
