package com.hillel.java.introduction.lesson14;

import java.util.List;
import java.util.Scanner;

public class TeamSelector implements InteractiveElement {

    public static double firstPlayerGold = 10000;
    public static double secondPlayerGold = 10000;

    private Scanner scanner = new Scanner(System.in);

    public final int teamNumber;
    private List<String> heroes;

    private HeroChoser heroChoser = new HeroChoser();

    private int numberOfMagicans;

    public TeamSelector(int teamNumber, List<String> heroes) {
        this.teamNumber = teamNumber;
        this.heroes = heroes;
    }

    @Override
    public void decisionLoop() {
        String read = null;
        int action = 0;

        щось:
        while ((read = scanner.nextLine()) != null && (action = Integer.parseInt(read)) != Integer.MIN_VALUE) {
            switch (action) {
                case 1:
                    System.out.println("Available heroes:");
                    printAvailableHeroes();
                    break;
                case 2:
                    System.out.println("Add a hero");
                    try {
                        heroChoser.use();
                    } catch (Exception e) {

                    }
                    break;
                case 3:
                    System.out.println("Already chosen heroes:");
                    for (String hero : heroes) {
                        System.out.println(hero);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break щось;
                default:
                    System.out.println("Please chose the correct action");
            }
            printMenu();
        }
    }

    @Override
    public void printMenu() {
        System.out.println("Select 1 to print available heroes");
        System.out.println("Select 2 to add a hero");
        System.out.println("Select 3 to print heroes");
        System.out.println("Select 4 to exit");
    }

    private void printAvailableHeroes() {
        System.out.println("Magic");
        System.out.println("Knight");
        System.out.println("Healer");
    }

    private class HeroChoser implements InteractiveElement {

        @Override
        public void decisionLoop() {
            String read = null;
            int action = 0;

            щось:
            while ((read = scanner.nextLine()) != null && (action = Integer.parseInt(read)) != Integer.MIN_VALUE) {
                switch (action) {
                    case 1:
                        System.out.println("Adding magic hero");
                   //     throw HeroLimitReachedException("Too much magicans");
                        heroes.add("Magic");
                        break;
                    case 2:
                        System.out.println("Adding knight hero");
                        heroes.add("Knight");
                        break;
                    case 3:
                        System.out.println("Adding healer hero");
                        heroes.add("Healer");
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break щось;
                    default:
                        System.out.println("Please chose the correct action");
                }
                printMenu();
            }
        }

        @Override
        public void printMenu() {
            printAvailableHeroes();
            System.out.println("Press 4 to exit");
        }
    }
}
