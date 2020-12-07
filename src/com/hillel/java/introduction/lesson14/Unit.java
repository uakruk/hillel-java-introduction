package com.hillel.java.introduction.lesson14;

import java.util.List;

public abstract class Unit {

    double healthLevel;

    double armor;

    double attackDamage;

    private List<Invertory> invertoryList;

    public abstract void fight(Unit unit);

    public abstract void physicalAttack(Unit unit);

    public abstract void magicalAttack(Unit unit);

    public abstract void freezeAttack(Unit unit);

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
}
