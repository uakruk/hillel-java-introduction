package com.hillel.java.introduction.lesson11.hw;

public class BankMain {

    public static void main(String[] args) {
        Atm atm = new Atm();
        PaymentCard paymentCard = new PaymentCard();

        try {
            atm.giveMoney(10000000000d, paymentCard);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (NotActiveCardException e) {
            System.out.println("Card not active, aborting");
        }
    }
}
