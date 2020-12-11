package com.hillel.java.introduction.katerynadanko.game.hero;

import com.hillel.java.introduction.katerynadanko.game.CharacteristicsHeros;
import com.hillel.java.introduction.katerynadanko.game.GameComponent;
import com.hillel.java.introduction.katerynadanko.game.GameLevel;
import com.hillel.java.introduction.katerynadanko.game.Inventory;

import java.util.List;
import java.util.Random;

@GameComponent
public abstract class Unit {
    Random random = new Random(100);
    GameLevel gameLevel = new GameLevel();

    double healthLevel = 1000;
    double healthLevelIncrease;
    double armour;
    double baseAttackDamage;
    double attackDamage;



    private List<Inventory> inventories;

    public abstract void fight(Unit unit);

    public abstract void hit(Unit unit);


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

    public double resultHealthAfterAttack(Unit enemy) {
        double damageTaken = attackDamage*(1-armour);
          return damageTaken;
    }
public void addLevelCharacteristics(){

        gameLevel.addGameLevel();
        healthLevel=+5;
        armour=+10;
}

}
