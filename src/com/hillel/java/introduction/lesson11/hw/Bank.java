package com.hillel.java.introduction.lesson11.hw;

public class Bank {

    private String bankName;

    private BankAccount[] bankAccounts;

    private PaymentCardList cardList;

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public PaymentCardList getCardList() {
        return cardList;
    }

    public void setCardList(PaymentCardList cardList) {
        this.cardList = cardList;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
