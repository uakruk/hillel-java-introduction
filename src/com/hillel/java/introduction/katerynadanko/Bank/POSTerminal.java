package com.hillel.java.introduction.katerynadanko.Bank;

public class POSTerminal {
     double makePayments (double sum, PrivateAccount accountFrom, BusinessAccount accountTo)
             throws AvailableClientMoneyException{
         double persent = (sum/100) * 2;
         double sumWhithPersent = sum + persent;
         double availableClientMoney = accountFrom.getSum()-sumWhithPersent;

         if (sumWhithPersent > accountFrom.getSum()){
             throw new AvailableClientMoneyException ("You can`t withdraw " +
                     sum + ", please enter the sum lower then" + availableClientMoney + "and try again!");
         }

        double sumAccountFrom = accountFrom.getSum() - sum;
        double sumAccountTo = accountTo.getSum() + sum;
        System.out.println("You transferred the amount: " + sum + " from your account " + accountFrom + " to " + accountTo);
        System.out.println("Now on your account " + sumAccountFrom + " dollars");
        return sumAccountFrom;
    }
}
