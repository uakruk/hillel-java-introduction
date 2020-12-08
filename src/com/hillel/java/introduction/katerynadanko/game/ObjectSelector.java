package com.hillel.java.introduction.katerynadanko.game;

import com.hillel.java.introduction.katerynadanko.game.hero.Unit;

import java.util.List;
import java.util.Scanner;

public class ObjectSelector implements IntractiveElement{

//    public static double firstTeamPlayerGold = 10_000 - sum;
//    public static double secondTeamPlayerGold = 10_000 - sum;

    Scanner scanner = new Scanner(System.in);
    public Unit unit;

    List<Unit> heroes;
    List<MagicThings> magicObjects;


    private ObjectChouser objectChouser = new ObjectChouser();


    public ObjectSelector(Unit unit, List<MagicThings> magicObjects){
        this.unit = unit;
        this.magicObjects = magicObjects;
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
                    System.out.println("Available magic objects: ");
                    printAvailableObjects();
                    break;
                case 2:
                    System.out.println("Add a magic objects");
                    objectChouser.use();
                    break;
                case 3:
                    System.out.println("Already chosen magic objects: ");
                    for (MagicThings magicThing : magicObjects) {
                        System.out.println(magicThing);
                    }
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
        System.out.println("Print 1 to see available magic objects");
        System.out.println("Print 2 to add a magic objects");
        System.out.println("Print 3 to print already chosen magic objects");
        System.out.println("Print 10 to go back to previous menu");
    }
    private void printAvailableObjects(){
        System.out.println("Print 1 to choose INCREASE_HEALTH");
        System.out.println("Print 2 to choose INCREASE_ARMOR");
        System.out.println("Print 3 to choose ALLOW_MAKE_MISTAKE");
        System.out.println("Print 4 to choose INCREASE_BLOW");
        System.out.println("Print 5 to choose INCREASE_CHANCE_OF_CRITICAL_HIT");
        System.out.println("Print 6 to choose INFLICT_MAGIC_DAMAGE");
        System.out.println("Print 7 to choose FENCE_USE_OBJECTS_2_MOVES");
        System.out.println("Print 8 to choose FENCE_USE_MAGIC_NEXT_OFFENSIVE");
        System.out.println("Print 9 to choose FENCE_PHYSICALLY_ATTACK");
        System.out.println("Print 10 to go back to previous menu");
    }

    public class ObjectChouser implements IntractiveElement {

        @Override
        public void decisionLoop() {
            String read = null;
            int action = 0;

            lable:
            while ((read = scanner.nextLine()) != null & (action = Integer.parseInt(read)) != Integer.MIN_VALUE) {
                switch (action) {
                    case 1:
                        System.out.println("You add INCREASE HEALTH to your hero");
                        magicObjects.add(MagicThings.INCREASE_HEALTH);
                        break;
                    case 2:
                        System.out.println("You add INCREASE ARMOR to your team");
                        magicObjects.add(MagicThings.INCREASE_ARMOR);
                        break;
                    case 3:
                        System.out.println("You add Healer to your team");
                        magicObjects.add(MagicThings.ALLOW_MAKE_MISTAKE);
                        break;
                    case 4:
                        System.out.println("You add Archer to your team");
                        magicObjects.add(MagicThings.INCREASE_BLOW);
                        break;
                    case 5:
                        System.out.println("You add INCREASE HEALTH to your hero");
                        magicObjects.add(MagicThings.INCREASE_CHANCE_OF_CRITICAL_HIT);
                        break;
                    case 6:
                        System.out.println("You add INCREASE HEALTH to your hero");
                        magicObjects.add(MagicThings.INFLICT_MAGIC_DAMAGE);
                        break;
                    case 7:
                        System.out.println("You add INCREASE HEALTH to your hero");
                        magicObjects.add(MagicThings.FENCE_USE_OBJECTS_2_MOVES);
                        break;
                    case 8:
                        System.out.println("You add INCREASE HEALTH to your hero");
                        magicObjects.add(MagicThings.FENCE_USE_MAGIC_NEXT_OFFENSIVE);
                        break;
                    case 9:
                        System.out.println("You add INCREASE HEALTH to your hero");
                        magicObjects.add(MagicThings.FENCE_PHYSICALLY_ATTACK);
                        break;
                    case 10:
                        System.out.println("Exiting to previous menu");
                        break lable;
                    default:
                        System.out.println("Select an object from list!");
                        break;
                }
                printMenu();
            }

        }

        @Override
        public void printMenu() {
            printAvailableObjects();
            System.out.println("Print 10 to exit");
        }
    }
}
