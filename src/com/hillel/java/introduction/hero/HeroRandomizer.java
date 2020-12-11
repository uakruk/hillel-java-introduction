package com.hillel.java.introduction.hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeroRandomizer {

    public static List<Unit> randomizeUnits(List<Unit> team1, List<Unit> team2) {
        List<Unit> teams = new ArrayList<>();
        teams.addAll(team1);
        teams.addAll(team2);

        Collections.shuffle(teams);

        return teams;
    }
}
