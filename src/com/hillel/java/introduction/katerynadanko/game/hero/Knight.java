package com.hillel.java.introduction.katerynadanko.game.hero;

import com.hillel.java.introduction.katerynadanko.game.CharacteristicsHeros;
import com.hillel.java.introduction.katerynadanko.game.hero.Unit;

import java.util.Random;

public class Knight extends Unit {


    double block = 20;
    double armour = 5;
    Random rand = new Random();

//    double attackDamage;
    double c = 1.3;
//    CharacteristicsHeros.CRITICAL_DAMAGE_CHANSE
    double criticalDamage= baseAttackDamage*(random.nextInt(100)<20?c:1);



    @Override
    public void fight(Unit unit) {

    }

    @Override
    public void hit (Unit unit) {

    }

    @Override
    public double resultHealthAfterAttack(Unit enemy) {
        double damageTaken = (attackDamage - rand.nextInt(2)*block)*(1-armour);

        return damageTaken;

    }
}
