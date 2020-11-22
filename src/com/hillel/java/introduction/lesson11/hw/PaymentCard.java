package com.hillel.java.introduction.lesson11.hw;

public class PaymentCard {

    private BankAccount bankAccount;

    private String cardNumber;

    private boolean active;

    public void increaseBalance(double amount) {
        bankAccount.setSum(bankAccount.getSum() + amount);
    }

    public void decreaseBalance(double amount) {
        //bankAccount.set
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
