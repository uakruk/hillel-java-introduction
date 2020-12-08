package com.hillel.java.introduction.katerynadanko.game.hero;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HeroRandomizer {
    static List<Unit> randomizeUnit (List <Unit> team1, List <Unit> team2){
        List <Unit> teams = new ArrayList<>();
        teams.addAll(team1);
        teams.addAll(team2);

        Collections.shuffle(teams);
return teams;
    }
}
