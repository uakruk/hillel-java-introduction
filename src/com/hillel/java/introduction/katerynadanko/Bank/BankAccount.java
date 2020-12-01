package com.hillel.java.introduction.katerynadanko.Bank;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {

    private int id;
    private double sum;
    private PaymentCardList paymentCardList;
    private PaymentCard paymentCard;
    public Client client;

    public BankAccount(int id, double sum) {
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

    public Client getClient() {
        return client;
    }

    public void setPaymentCardList(PaymentCardList paymentCardList) {
        this.paymentCardList = paymentCardList;
    }

    public PaymentCard getPaymentCard() {
        return paymentCard;
    }

    @Override
    public String toString() {
        return client.getName();
    }
}
