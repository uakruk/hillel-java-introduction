package com.hillel.java.introduction.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String read = null;
        int action = 0;

        List<String> firstTeamHeroes = new ArrayList<>();
        List<String> secondTeamHeroes = new ArrayList<>();

        TeamSelector firstTeamSelector = new TeamSelector(1, firstTeamHeroes);
        TeamSelector secondTeamSelector = new TeamSelector(2, secondTeamHeroes);

        System.out.println("Press 1 to select team 1");
        System.out.println("Press 2 to select team 2");
        System.out.println("Press 3 to start fight");
        System.out.println("Press 4 to exit");

        щось:
        while ((read = scanner.nextLine()) != null && (action = Integer.parseInt(read)) != Integer.MIN_VALUE) {
            switch (action) {
                case 1:
                    System.out.println("Select team 1");
                    firstTeamSelector.use();
                    break;
                case 2:
                    System.out.println("Select team 2");
                    secondTeamSelector.use();
                    break;
                case 3:
                    System.out.println("Start fighting");
                 //   new Arena(firstTeamHeroes, secondTeamHeroes)
                case 4:
                    System.out.println("Exiting...");
                    break щось;
                default:
                    System.out.println("Please chose the correct action");
            }
        }
    }
}
