package pavelkim.homework11;

import pavelkim.homework11.actions.PaymentCard;

public class PaymentCardList {

    private PaymentCardEntry list;

    protected void addCard(PaymentCard paymentCard) {
        if(list == null) {
            list = new PaymentCardEntry(paymentCard, null);
        } else {

        }
    }

    protected PaymentCard getByCardNumber(String cardNumber) {
        return null;
    }

    protected void printAvailableCards() {

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
