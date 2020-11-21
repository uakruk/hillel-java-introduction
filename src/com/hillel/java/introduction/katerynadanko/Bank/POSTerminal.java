package com.hillel.java.introduction.katerynadanko.Bank;

public class POSTerminal {
     double makePayments (double sum, PrivateAccount accountFrom, BusinessAccount accountTo) {

        double sumAccountFrom = accountFrom.getSum() - sum;
        double sumAccountTo = accountTo.getSum() + sum;
        System.out.println("You transferred the amount: " + sum + " from your account " + accountFrom + " to " + accountTo);
        System.out.println("Now on your account " + sumAccountFrom + " dollars");
        return sumAccountFrom;
    }
}
