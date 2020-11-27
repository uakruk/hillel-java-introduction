package com.hillel.java.introduction.lesson11.hw;

public class Cassa implements MoneyWidthdrawable {

    @Override
    public double giveMoney(double amount, PaymentCard paymentCard) {

        BankAccount bankAccount = paymentCard.getBankAccount();
        double sumAvailable = bankAccount.getSum();

        if (amount > sumAvailable) {
            System.out.println("Касирша каже йди подалі");
            return 0;
        } else {
            bankAccount.setSum(bankAccount.getSum() - amount);
            return amount;
        }
    }
}
