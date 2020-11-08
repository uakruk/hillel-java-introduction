package com.hillel.java.introduction.katerynadanko.architect;

public class CustomersWife extends Customer{

    public CustomersWife(int amountOfMoney, int amountOfChanges, String required) {
        super(amountOfMoney, amountOfChanges, required);
    }

    @Override
    public void dontLike() {
        System.out.println("I don`t like anything!!!");
    }

    @Override
    public String toString() {
        return "I`m a CustomersWife " +
                "amountOfMoney=" + amountOfMoney +
                ", amountOfChanges=" + amountOfChanges +
                ", required='" + required + '\n';
    }
}
