package com.hillel.java.introduction.katerynadanko.architect;

abstract public class Customer {

    int amountOfMoney;
    int amountOfChanges;
    String required;

    public Customer(int amountOfMoney, int amountOfChanges, String required) {
        this.amountOfMoney = amountOfMoney;
        this.amountOfChanges = amountOfChanges;
        this.required = required;
    }

    public void dontLike() {
        System.out.println("I don`t like it");
    }
    public void task(){
        System.out.println("Architect should make the project");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "amountOfMoney=" + amountOfMoney +
                ", amountOfChanges=" + amountOfChanges +
                ", required='" + required + '\'' +
                '}';
    }
}
