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

    public boolean validationCard () throws ValidationCardException {
        if (active == false) {
            throw new ValidationCardException();
        }
        return false;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public boolean isActive() {
        return active;
    }
    public String getCartNumber() {
        return cartNumber;
    }


    @Override
    public String toString() {
        return "PaymentCard{" +
                "bankAccount=" + bankAccount +
                ", cartNumber='" + cartNumber + '\'' +
                '}';
    }


}
