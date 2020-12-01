package com.hillel.java.introduction.katerynadanko.Bank;

import java.util.Random;

public class Terminal implements PutableMoney{

    ConnectionRandom connectionRandom = new ConnectionRandom();

    public double makePayments(double sum, PrivateAccount accountFrom, PrivateAccount accountTo, PaymentCard paymentCard)
            throws AvailableClientMoneyException, ConnectionException, ValidationCardException {
        double persent = (sum/100) * 2;
        double sumWhithPersent = sum + persent;
        double availableClientMoney = accountFrom.getSum()-sumWhithPersent;

        connectionRandom.randConnect();

        if (paymentCard.isActive() == false){
                throw new ValidationCardException();
        }

        if (sumWhithPersent > accountFrom.getSum()){
            throw new AvailableClientMoneyException ("You can`t withdraw " +
                    sum + ", please enter the sum lower then" + availableClientMoney + "and try again!");
        }
        double sumAccountFrom = accountFrom.getSum() - sum - persent;
        double sumAccountTo = accountTo.getSum() + sum;
        System.out.println("You transferred the amount: " + sum + " from " + accountFrom + " to " + accountTo);
        System.out.println("Now on your account " + sumAccountFrom + " dollars");
        return sumAccountFrom;
    }
}
