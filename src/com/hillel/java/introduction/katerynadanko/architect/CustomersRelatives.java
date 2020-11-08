package com.hillel.java.introduction.katerynadanko.architect;

public class CustomersRelatives extends Customer{

    public CustomersRelatives(int amountOfMoney, int amountOfChanges, String required) {
        super(amountOfMoney, amountOfChanges, required);
    }

    @Override
    public void task() {
        System.out.println("We want to make some changes");
    }

    @Override
    public String toString() {
        return "We are CustomersRelatives " +
                "amountOfMoney=" + amountOfMoney +
                ", amountOfChanges=" + amountOfChanges +
                ", required='" + required + '\n';
    }
}
