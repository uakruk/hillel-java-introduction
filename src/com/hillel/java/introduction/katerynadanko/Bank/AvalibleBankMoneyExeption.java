package com.hillel.java.introduction.katerynadanko.Bank;

public class AvalibleBankMoneyExeption extends Exception {

    public AvalibleBankMoneyExeption() {
//        System.out.println("You can`t withdraw this sum, please enter the sum from 20 to " + this.getAvailableMoney()
//                + " and try again");
    }

    public AvalibleBankMoneyExeption(String message) {
        super(message);
    }
}
