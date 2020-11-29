package com.hillel.java.introduction.katerynadanko.Bank;

import java.util.ArrayList;
import java.util.List;

public class PaymentCardList {
private PaymentCardEntry paymentCardEntry;



    void addCard(PaymentCard paymentCard) {

        if (paymentCardEntry == null){
            paymentCardEntry = new PaymentCardEntry(paymentCard);
        }

        else {
            PaymentCardEntry temp = paymentCardEntry;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new PaymentCardEntry(paymentCard);

        }
    }
    PaymentCard getByCardNumber(String cardNumber) {

        if (cardNumber == null) {
            return null;
        } else {
            PaymentCardEntry temp = paymentCardEntry;
            PaymentCard paymentCard = null;
            boolean active = false;

            while (temp != null && !active) {
                if (temp.paymentCard.getCartNumber().equals(cardNumber)) {
                    paymentCard = temp.paymentCard;
                    active = true;
                }
                temp = temp.next;
            }
        return paymentCard;
    }
    }
    void printAvailableCards(){
        if (paymentCardEntry == null) {
            System.out.println("No available cards");
        }
        else {

            PaymentCardEntry temp = paymentCardEntry;
            do  {
                System.out.println(temp.paymentCard);
                temp = temp.next;
            }
            while (temp != null);
        }

    }
    public class PaymentCardEntry {

        private PaymentCard paymentCard;
        private PaymentCardEntry next;

        public PaymentCardEntry(PaymentCard paymentCard) {
            this.paymentCard = paymentCard;
        }
    }
}
