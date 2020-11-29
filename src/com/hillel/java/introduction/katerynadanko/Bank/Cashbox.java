package com.hillel.java.introduction.katerynadanko.Bank;

public class Cashbox implements GivebleMony, PutableMoney, MakeblePayments{

     private double availableMoney;
     private int distanceFromClient;

     @Override
     public double withdrawMoney(double sum, PrivateAccount account) throws AvalibleBankMoneyExeption {
          if (sum > availableMoney)
               throw new AvalibleBankMoneyExeption("You can`t withdraw " + sum + ", please enter the sum from 20 to" + getAvailableMoney() + "and try again!");

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

     public Cashbox() {
          this.availableMoney = availableMoney;
          this.distanceFromClient = getDistanceFromClient();
     }

}
