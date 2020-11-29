package com.hillel.java.introduction.katerynadanko.Bank;

public class PaymentCard {
    private BankAccount bankAccount;

    private String cartNumber;

    boolean active;

    public PaymentCard(BankAccount bankAccount, String cartNumber, boolean active) {
        this.bankAccount = bankAccount;
        this.cartNumber = cartNumber;
        this.active = active;
    }

    @Override
    public String toString() {
        return "PaymentCard{" +
                "bankAccount=" + bankAccount +
                ", cartNumber='" + cartNumber + '\'' +
                '}';
    }

    public String getCartNumber() {
        return cartNumber;
    }
}
