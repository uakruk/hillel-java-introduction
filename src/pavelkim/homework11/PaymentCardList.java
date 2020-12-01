package pavelkim.homework11;

import pavelkim.homework11.actions.PaymentCard;

public class PaymentCardList {

    private PaymentCardEntry next;

    protected void addCard(PaymentCard paymentCard) {
        if(this.next == null) {
            this.next = new PaymentCardEntry(paymentCard, null);
        } else {
            PaymentCardEntry temp = this.next;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new PaymentCardEntry(paymentCard, null);
        }
    }

    protected PaymentCard getByCardNumber(String cardNumber) {
        if (this.next == null) {
            System.out.println("PaymentCardList is empty");
        } else {
            PaymentCardEntry temp = this.next;
            do {
                if (temp.next.paymentCard.getCardNumber().equals(cardNumber)) {
                    return temp.next.paymentCard;
                } else {
                    temp = temp.next;
                }
            } while (temp != null);
        }
        return null;
    }

    protected void printAvailableCards() {
        if (this.next == null) {
            System.out.println("PaymentCardList is empty");
        } else {
            PaymentCardEntry temp = this.next;
            do {
                System.out.println(temp.paymentCard.toString());
                temp = temp.next;
            }
            while (temp!=null);
        }
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
