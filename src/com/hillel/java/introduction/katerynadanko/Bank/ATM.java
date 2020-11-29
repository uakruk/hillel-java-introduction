package com.hillel.java.introduction.katerynadanko.Bank;

import java.util.Random;

public class ATM implements GivebleMoney {
    ConnectionRandom connectionRandom = new ConnectionRandom();

    @Override
    public double withdrawMoney(double sum, PrivateAccount account)
            throws AvailableBankMoneyException, ValidationCardException {

        connectionRandom.randConnect();
//        if (PaymentCard ){
//
//        }

        if (sum > availableMoney) {

            throw new AvailableBankMoneyException("You can`t withdraw " + sum + ", please enter the sum from 20 to" + getAvailableMoney() + "and try again!");

        }

            double sumRest = account.getSum() - sum;
        System.out.printf("You withdraw %f dollars" + "\n" + "Now you account balance is %f dollars." + "\n",
                sum, sumRest);
        return sumRest;
    }


    private double availableMoney = 10_000;


    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }
}
