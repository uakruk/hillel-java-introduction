package pavelkim.homework11.actions;

import pavelkim.homework11.Account;

public class PaymentCard {

    private Account account;
    private String cardNumber;

    public PaymentCard(Account account, String cardNumber) {
        this.account = account;
        this.cardNumber = cardNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
