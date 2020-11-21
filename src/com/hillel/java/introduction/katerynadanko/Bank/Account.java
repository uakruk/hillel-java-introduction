package com.hillel.java.introduction.katerynadanko.Bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    private int id;
    private double sum;
    List<PaymentCard> paymentCards;
    public Client client;

    public Account(int id, double sum) {
        this.id = id;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return client.getName();
    }
}
