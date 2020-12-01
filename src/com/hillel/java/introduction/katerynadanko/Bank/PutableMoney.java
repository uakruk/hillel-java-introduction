package com.hillel.java.introduction.katerynadanko.Bank;

public interface PutableMoney {
    default double putMoney (double sum, PrivateAccount account, PaymentCard paymentCard) {

        if (paymentCard.isActive() == false){
            try {
                throw new ValidationCardException ();
            } catch (ValidationCardException e) {
                System.out.println(("Card is no available!"));
            }
        }

        double newSum = account.getSum() + sum;
        System.out.printf("You put on your account %f dollars" + "\n" + "Now you account balance is %f dollars." + "\n",
                sum, newSum);
        return newSum;
    }
}
