package com.hillel.java.introduction.katerynadanko.game.hero;

import com.hillel.java.introduction.katerynadanko.game.CharacteristicsHeros;
import com.hillel.java.introduction.katerynadanko.game.GameComponent;
import com.hillel.java.introduction.katerynadanko.game.Inventory;

import java.util.List;

@GameComponent
public abstract class Unit {

    double healthLevel;

    double armour;

    double attackDamage;

    private List<Inventory> inventories;

    public abstract void fight(Unit unit);

    public abstract void physicalAttack(Unit unit);

    public abstract void magicalAttack(Unit unit);

    public abstract void freezeAttack(Unit unit);

    public void addInventory (Inventory inventory){
        inventories.add(inventory);
    }


    public double getHealthLevel(){
        double healthIncrease = 0;
        for (Inventory inventory : inventories) {
            if(inventory.getCharacteristics() == CharacteristicsHeros.HEALTH_LEVEL_INCREASE){
                 healthIncrease=+inventory.getValue();
            }
        }
        return healthLevel+healthIncrease;
    }

}
