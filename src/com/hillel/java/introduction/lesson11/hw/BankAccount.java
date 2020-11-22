package com.hillel.java.introduction.lesson11.hw;


public class BankAccount {

    private Bank bank;

    private String number;

    private double sum;

    private Client client;

    private PaymentCardList cardList;

    public void sendMoneyByCardNumber(String cardNumber) {
        PaymentCardList cardList = bank.getCardList();
        PaymentCard paymentCardToSend = cardList.getByNumber(cardNumber);
      //  paymentCardToSend.getBankAccount().
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PaymentCard getByCardNumber() {
        return null;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
