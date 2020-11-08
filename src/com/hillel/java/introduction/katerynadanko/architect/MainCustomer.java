package com.hillel.java.introduction.katerynadanko.architect;

public class MainCustomer extends Customer{
    public MainCustomer(int amountOfMoney, int amountOfChanges, String required) {
        super(amountOfMoney, amountOfChanges, required);
    }

    @Override
    public void task() {
        super.task();
    }

    @Override
    public String toString() {
        return "I`m a MainCustomer " +
                "amountOfMoney=" + amountOfMoney +
                ", amountOfChanges=" + amountOfChanges +
                ", required='" + required + '\n';
    }
}
