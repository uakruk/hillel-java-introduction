package com.hillel.java.introduction.katerynadanko.game.hero;

import com.hillel.java.introduction.katerynadanko.game.CharacteristicsHeros;
import com.hillel.java.introduction.katerynadanko.game.hero.Unit;

public class Healer extends Unit {

    @Override
    public void fight(Unit unit) {

    }

    @Override
    public void hit(Unit unit) {

    }
    public void heal(Unit player){
        double increaseHealth = 100;
//        player.healthLevel=+healthLevel*increaseHealth*(healthLevel/ CharacteristicsHeros.HEALTH_LEVEL_INCREASE);
    }


}
