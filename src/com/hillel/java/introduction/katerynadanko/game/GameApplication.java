package com.hillel.java.introduction.katerynadanko.game;

import com.hillel.java.introduction.katerynadanko.game.hero.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameApplication {
    private List<Unit> units = new ArrayList<>();
    private List<Unit> availableUnits = new ArrayList<>();
    private List<Unit> team1 = new ArrayList<>();
    private List<Unit> team2 = new ArrayList<>();



    private List<Inventory> inventories = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printTeamMenu();
        String read = null;
        int action = 0;

         List<Unit> firstTeamHeroes = new ArrayList<>();
         List<Unit> secondTeamHeroes = new ArrayList<>();
        TeamSelector firstTeamSelector = new TeamSelector(1, firstTeamHeroes);
        TeamSelector secondTeamSelector = new TeamSelector(2, secondTeamHeroes);


        lable:
        while ((read = scanner.nextLine()) != null & (action = Integer.parseInt(read)) != Integer.MIN_VALUE)
        {
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
                    System.out.println("Start Fighting");
                    new Arena (firstTeamHeroes, secondTeamHeroes);
                    break ;
                case 10:
                    System.out.println("Exiting...");
                    break lable;
                default:
                    System.out.println("Make your chose!");
                    break;
            }
//            printTeamMenu();
        }

    }

    static void printTeamMenu(){
        System.out.println("Print 1 to choose team 1");
        System.out.println("Print 2 to choose team 2");
        System.out.println("Print 3 to start fight");
        System.out.println("Print 10 to exit");
    }




}
