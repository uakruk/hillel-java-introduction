package com.hillel.java.introduction.lesson11.hw;

public interface MoneyWidthdrawable {

    double giveMoney(double amount, PaymentCard paymentCard) throws NotEnoughMoneyException;
}
