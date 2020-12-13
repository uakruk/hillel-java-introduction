package com.hillel.java.introduction.lesson14;

import java.util.List;
import java.util.Random;

public class Knight extends Unit {

//    private List<Unit> enemies;
//    private List<Unit> players;

    @Override
    public void fight(Unit unit) {

    }

//    public void hit() {
//        Random random = new Random();
//        Unit enemyToHit = enemies.get(random.nextInt(enemies.size()));
//
//        double attackDamage = getAttackDamage(enemyToHit);
//
//        if (enemyToHit.getHealthLevel() < attackDamage) {
//            enemyToHit.setStatus(PlayerStatus.DEAD);
//            increaseLevel(3);
//
//            for (Unit unit : players) {
//                unit.increaseLevel(0.5);
//            }
//        }
//    }

    private double getAttackDamage(Unit init) {
        return 100;
    }
}
