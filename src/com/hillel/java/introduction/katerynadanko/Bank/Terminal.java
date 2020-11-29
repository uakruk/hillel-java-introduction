package com.hillel.java.introduction.katerynadanko.Bank;

public class Terminal implements PutableMoney, MakeblePayments{
    @Override
    public double makePayments(double sum, PrivateAccount accountFrom, PrivateAccount accountTo) throws AvailableClientMoneyException {
        double persent = (sum/100) * 2;
        double sumWhithPersent = sum + persent;
        double availableClientMoney = accountFrom.getSum()-sumWhithPersent;

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
