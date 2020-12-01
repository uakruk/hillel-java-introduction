package com.hillel.java.introduction.katerynadanko.Bank;

public interface MakeblePayments {
    default double makePayments (double sum, PrivateAccount accountFrom, PrivateAccount accountTo)
            throws AvailableClientMoneyException, ValidationCardException {
        int persent = (int) (sum/100) * 2;
        double sumAccountFrom = accountFrom.getSum() - sum - persent;
        double sumAccountTo = accountTo.getSum() + sum;
        System.out.println("You transferred the amount: " + sum + " from " + accountFrom + " to " + accountTo);
        System.out.println("Now on your account " + sumAccountFrom + " dollars");
        return sumAccountFrom;
    }
}
