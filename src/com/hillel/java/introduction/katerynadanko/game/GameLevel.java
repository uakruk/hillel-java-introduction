package com.hillel.java.introduction.katerynadanko.game;

import com.hillel.java.introduction.katerynadanko.game.hero.Unit;

public class GameLevel {
    static int gameLevelCounter = 0;

    public int addGameLevel(){
        for (int i = 0; i<30; i++){
            gameLevelCounter++;
        }
        return gameLevelCounter;
    }

}
