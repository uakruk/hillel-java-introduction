package com.hillel.java.introduction.lesson11.hw;

public class Atm implements MoneyWidthdrawable {

    public double availableMoney;

    @Override
    public double giveMoney(double amount, PaymentCard paymentCard) throws NotEnoughMoneyException {

        if (!paymentCard.isActive()) {
            throw new NotActiveCardException();
        }
        BankAccount bankAccount = paymentCard.getBankAccount();
        double sumAvailable = bankAccount.getSum();

        if (amount > sumAvailable) {
            throw new NotEnoughMoneyException(amount, sumAvailable);
        } else {
            return amount;
        }

    }


}
