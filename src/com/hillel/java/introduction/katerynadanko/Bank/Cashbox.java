package com.hillel.java.introduction.katerynadanko.Bank;

public class Cashbox implements GivebleMony, PutableMoney, MakeblePayments{

     private double availableMoney;
     private int distanceFromClient;

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
