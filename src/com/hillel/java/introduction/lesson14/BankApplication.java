package com.hillel.java.introduction.lesson14;

import com.hillel.java.introduction.lesson11.hw.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {

    private static List<Bank> banks = new ArrayList<>();
    private static List<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankExplorer bankExplorer = new BankExplorer();

        printBankMenu();
        String read = null;
        int action = 0;

        щось:
        while ((read = scanner.nextLine()) != null && (action = Integer.parseInt(read)) != Integer.MIN_VALUE) {
            switch (action) {
                case 1:
                    System.out.println("Select team 1");
                    break;
                case 2:
                    System.out.println("Select team 2");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break щось;
                default:
                    System.out.println("Please chose the correct action");
            }
        }
    }

    static void setup() {
        // here creating different banks, supermarkets, atms, terminals
//        Bank bank = new Bank();
//        bank.setBankAccounts(/* */);
//        bank.setCardList();
    }

    static void printBankMenu() {
        System.out.println("Press 1 to go to bank");
        System.out.println("Press 2 to go to the supermarket");
        System.out.println("Press 3 to find the ATM");
        System.out.println("Press 4 to find the Terminal");
        System.out.println("Press 5 to exit");
    }

    static void printMenu() {
        System.out.println("Press 1 to create a new account");
        System.out.println("Press 2 to get your balance on screen");
        System.out.println("Press 3 to get your");
    }

    private static class BankExplorer implements InteractiveElement {
        @Override
        public void decisionLoop() {
            printAvailableBanks();
            Scanner scanner = new Scanner(System.in);

            int bankNumber = scanner.nextInt();

            if (bankNumber < banks.size()) {
            }
        }

        @Override
        public void printMenu() {
            System.out.println("Select the bank you want to go:");
        }

        private void printAvailableBanks() {
            for (int i = 0 ; i < banks.size(); i++) {
                System.out.printf("Select %d to go to the %s bank", i, banks.get(i).getBankName());
            }
        }
    }
}
