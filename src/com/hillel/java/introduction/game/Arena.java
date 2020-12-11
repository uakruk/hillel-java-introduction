package com.hillel.java.introduction.game;

import com.hillel.java.introduction.game.model.Team;
import com.hillel.java.introduction.game.model.Unit;

public class Arena {

    private String name;

    private Team team1;

    private Team team2;

    public Arena(String name, Team team1, Team team2) {
        this.name = name;
        this.team1 = team1;
        this.team2 = team2;
    }

    public void fightTillTeamIsAlive() {
        System.out.println("Ololo, team one wanna fight against team2"); // put the normal message here, plz

        boolean weHaveWinner = false;
        Team winner = null;

        while (!weHaveWinner) {
            Fight fight = new Fight(team1, team2);

            fight.fight();

            boolean firstTeamIsAlive = checkIfTeamIsAlive(team1);
            boolean secondTeamIsAlive = checkIfTeamIsAlive(team2);

            if (firstTeamIsAlive ^ secondTeamIsAlive) {
                weHaveWinner = true;
                winner = firstTeamIsAlive ? team1 : team2;
            }
        }

        System.out.println("some other messages about the teams");
    }

    private boolean checkIfTeamIsAlive(Team team) {

        for (Unit unit : team) {
            if (unit.isAlive()) {
                return true;
            }
        }
        return false;
    }
}
