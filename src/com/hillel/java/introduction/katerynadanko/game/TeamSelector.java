package com.hillel.java.introduction.katerynadanko.game;

import com.hillel.java.introduction.katerynadanko.game.hero.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@GameComponent
public class TeamSelector implements IntractiveElement{
    public static double firstTeamPlayerGold = 10_000;
    public static double secondTeamPlayerGold = 10_000;

    Unit archer = new Archer();
    Unit healer = new Healer();
    Unit knight = new Knight();
    Unit magician = new Magician();
    List<MagicThings> magicThings = new ArrayList<>();


    Scanner scanner = new Scanner(System.in);
    public final int teamNumber;
    List<Unit>heroes;
    private  HeroChouser heroChouser = new HeroChouser();
    ObjectSelector archerObjectSelector = new ObjectSelector(archer, magicThings);
    ObjectSelector healerObjectSelector = new ObjectSelector(healer, magicThings);
    ObjectSelector knightObjectSelector = new ObjectSelector(knight, magicThings);
    ObjectSelector magicianObjectSelector = new ObjectSelector(magician, magicThings);



    public TeamSelector(int teamNumber, List<Unit> heroes){
        this.teamNumber = teamNumber;
        this.heroes = heroes;
    }

            @Override
    public void decisionLoop() {
        String read = null;
        int action = 0;

                lable:
                while ((read = scanner.nextLine()) != null & (action = Integer.parseInt(read)) != Integer.MIN_VALUE)
                {
                    switch (action) {
                        case 1:
                            System.out.println("Available heroes: ");
                            printAvailableHeroes();
                            break;
                        case 2:
                            System.out.println("Add a hero");
                            heroChouser.use();
                            break;
                        case 3:
                            System.out.println("Already chosen heroes: ");
                            for (Unit hero : heroes) {
                                System.out.println(hero);
                            }
                            break;
                        case 4:
                            System.out.println("Selected a hero archer");
                            archerObjectSelector.use();
                            break;
                        case 5:
                            System.out.println("Selected a hero healer");
                            healerObjectSelector.use();
                            break;
                        case 6:
                            System.out.println("Selected a hero knight");
                            knightObjectSelector.use();
                            break;
                        case 7:
                            System.out.println("Selected a hero magician");
                            magicianObjectSelector.use();
                            break;
                        case 10:
                            System.out.println("Exiting to previous menu");
                            break lable;
                        default:
                            System.out.println("Make your chose!");
                            break;
                    }
                    printMenu();
                }
    }

    @Override
    public void printMenu() {
        System.out.println("Print 1 to see available heroes");
        System.out.println("Print 2 to add a hero");
        System.out.println("Print 3 to print already chosen heroes");
        System.out.println("Print 4 to choose archer");
        System.out.println("Print 5 to choose healer");
        System.out.println("Print 6 to choose knight");
        System.out.println("Print 7 to choose magician");
        System.out.println("Print 10 to go back to previous menu");
    }
    private void printAvailableHeroes() {
        System.out.println("Print 1 to choose Magician");
        System.out.println("Print 2 to choose Knight");
        System.out.println("Print 3 to choose Healer");
        System.out.println("Print 4 to choose Archer");
        System.out.println("Print 10 to go back to previous menu");
    }

    public class HeroChouser implements IntractiveElement {
        Magician magician = new Magician();
        Knight knight = new Knight();
        Healer healer = new Healer();
        Archer archer = new Archer();


        @Override
        public void decisionLoop() {
            String read = null;
            int action = 0;

            lable:
            while ((read = scanner.nextLine()) != null & (action = Integer.parseInt(read)) != Integer.MIN_VALUE) {
                switch (action) {
                    case 1:

                        if(heroes.size()>5){
                            System.out.println("Your team is staffed!");
                        }
//                        for (String hero : heroes) {
//                        if(hero.equals("Magician")&&hero.equals("Magician")) {
//                            System.out.println("You can`t add Magician! You have already 2!");
//                        }
//                    }
                    System.out.println("You add Magician to your team");
                        heroes.add(magician);
                        break;
                    case 2:
                        if(heroes.size()>5){
                            System.out.println("Your team is staffed!");
                        }
                        System.out.println("You add Knight to your team");
                        heroes.add(knight);
                        break;
                    case 3:
                        if(heroes.size()>5){
                            System.out.println("Your team is staffed!");
                        }
                        for (Unit hero : heroes) {
                        if(hero.equals("Healer")) {
                            System.out.println("You can`t add Healer! You already have it!");
                        }
                }
                        System.out.println("You add Healer to your team");
                        heroes.add(healer);
                        break;
                    case 4:
                        if(heroes.size()>5){
                            System.out.println("Your team is staffed!");
                        }
                        System.out.println("You add Archer to your team");
                        heroes.add(archer);
                        break;
                    case 10:
                        System.out.println("Exiting to previous menu");
                        break lable;
                    default:
                        System.out.println("Select a hero from list!");
                        break;
                }
               printMenu();
            }


//            printAvailableHero();
//            Scanner scanner = new Scanner (System.in);
//            int unitNumber = scanner.nextInt();
//            if(unitNumber<availableUnits.size()){
//            }

        }

        @Override
        public void printMenu() {
            printAvailableHeroes();
            System.out.println("Print 10 to exit");
        }
    }
}
