package com.hillel.java.introduction.katerynadanko.game;

import com.hillel.java.introduction.katerynadanko.game.hero.Unit;

import java.util.List;
import java.util.Random;

public class Fight {
    private Unit player;
    private Unit enemy;
    private List<Unit>teamPlayer;
    private List<Unit>enemyPlayer;

    private Random random = new Random();

    public void attack(){
        //1. physical attack;
        //2. magical
        //3. freeze

//        if (player.isHealer){
//
//            Optional<Unit> optionalUnit = teamPlayer.stream().min(unit -> unit.getHealthLevel());
//            if(optionalUnit.ifPresent()){
//                player.heal(optionalUnit.get());
//            }
//        }

        boolean playerPerformedAction = false;
        while (playerPerformedAction ){
            int attackType = random.nextInt(3);

            switch (attackType) {
                case 1:
//                if (player.canPhysicalAttack)
                    player.physicalAttack(enemy);

                case 2:
                    player.magicalAttack(enemy);

                case 3:
                    player.freezeAttack(enemy);
            }

        }

    }
}
