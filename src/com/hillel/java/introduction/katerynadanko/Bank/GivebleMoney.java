package com.hillel.java.introduction.katerynadanko.Bank;

public interface GivebleMoney {
     default double withdrawMoney (double sum, PrivateAccount account, PaymentCard paymentCard)
             throws AvailableBankMoneyException, ValidationCardException {

          double sumRest = account.getSum() - sum;
               System.out.printf("You withdraw %f dollars" + "\n" + "Now you account balance is %f dollars." + "\n",
                       sum, sumRest);

          return sumRest;
     }
}
