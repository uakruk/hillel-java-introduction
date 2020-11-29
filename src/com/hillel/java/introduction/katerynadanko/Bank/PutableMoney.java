package com.hillel.java.introduction.katerynadanko.Bank;

public interface PutableMoney {
    default double putMoney (double sum, PrivateAccount account) {
        double newSum = account.getSum() + sum;
        System.out.printf("You put on your account %f dollars" + "\n" + "Now you account balance is %f dollars." + "\n",
                sum, newSum);
        return newSum;
    }
}
