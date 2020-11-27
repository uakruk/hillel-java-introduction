package com.hillel.java.introduction.lesson11.hw;

public class PaymentCardList {

    private PaymentCardEntry root;

    public void add(PaymentCard paymentCard) {

    }

    public PaymentCard getByNumber(String number) {
        return null;
    }

    public void printAvailableCards() {

    }

    private class PaymentCardEntry {
        PaymentCard paymentCard;

        PaymentCardEntry next;

        public PaymentCardEntry(PaymentCard paymentCard, PaymentCardEntry next) {
            this.paymentCard = paymentCard;
            this.next = next;
        }
    }
}
