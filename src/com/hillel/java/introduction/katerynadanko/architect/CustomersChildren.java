package com.hillel.java.introduction.katerynadanko.architect;

public class CustomersChildren extends Customer {

    int years;
    public CustomersChildren(int amountOfMoney, int amountOfChanges,
                             String required, int years) {
        super(amountOfMoney, amountOfChanges, required);
        this.years = years;

    }

    @Override
    public void dontLike() {
        super.dontLike();
    }

    @Override
    public String toString() {
        return "We are CustomersChildren " +
                "Age: " + years +
                ", amountOfMoney: " + amountOfMoney +
                ", amountOfChanges: " + amountOfChanges +
                ", We want: '" + required + '\n';
    }
}
