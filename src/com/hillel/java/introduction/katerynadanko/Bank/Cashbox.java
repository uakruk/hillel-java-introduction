package com.hillel.java.introduction.katerynadanko.Bank;

import java.util.Random;

public class Cashbox extends Bank implements GivebleMoney, PutableMoney, MakeblePayments {

     ConnectionRandom connectionRandom = new ConnectionRandom();
     private double availableMoney;
     private int distanceFromClient;

     @Override
     public double makePayments(double sum, PrivateAccount accountFrom,
                                PrivateAccount accountTo, PaymentCard paymentCardFrom)
             throws AvailableClientMoneyException, ConnectionException, ValidationCardException {

          connectionRandom.randConnect();

          double persent = (sum/100) * 2;
          double sumWhithPersent = sum + persent;
          double availableClientMoney = accountFrom.getSum()-sumWhithPersent;

          if (paymentCardFrom.isActive() == false){
               throw new ValidationCardException ("Card is no available!");
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

         @Override
     public double withdrawMoney(double sum, PrivateAccount account, PaymentCard paymentCard)
             throws AvailableBankMoneyException, ConnectionException, ValidationCardException {

          connectionRandom.randConnect();

          if (paymentCard.isActive() == false){
               throw new ValidationCardException ("Card is no available!");
          }

          if (sum > availableMoney)
               throw new AvailableBankMoneyException("You can`t withdraw " +
                       sum + ", please enter the sum from 20 to" + getAvailableMoney() + "and try again!");

               double sumRest = account.getSum() - sum;
               System.out.printf("You withdraw %f dollars" + "\n" + "Now you account balance is %f dollars." + "\n",
                       sum, sumRest);
               return sumRest;
     }

     public double getAvailableMoney() {
          return availableMoney;
     }

     public void setAvailableMoney(double availableMoney) {
          this.availableMoney = availableMoney;
     }

     public int getDistanceFromClient() {
          return distanceFromClient;
     }

     public void setDistanceFromClient(int distanceFromClient) {
          this.distanceFromClient = distanceFromClient;
     }

     public Cashbox(double availableMoney) {
          this.availableMoney = availableMoney;

     }

}
