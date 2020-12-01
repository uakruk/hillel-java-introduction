package com.hillel.java.introduction.katerynadanko.Bank;

public class Test {

    public static void main(String[] args) throws AvailableBankMoneyException, ValidationCardException {

        ATM atm1 = new ATM();
//        atm1.setAvailableMoney(1000);
        PrivateAccount kateAccount = new PrivateAccount(345, 50_000, new PrivateClient("Kateryna Danko"));
        PrivateAccount  tomAccount = new PrivateAccount(543, 20_000, new PrivateClient("Tom Robinson"));

        PaymentCard tomCard1 = new PaymentCard(tomAccount, "434YUJ", true);
        PaymentCard tomCard2 = new PaymentCard(tomAccount, "587KOI", true);
        PaymentCard tomCard3 = new PaymentCard(tomAccount, "687TFD", true);
        PaymentCard tomCard4 = new PaymentCard(tomAccount, "767JNB", false);
        PaymentCard kateCard1 = new PaymentCard(kateAccount, "167HSL", true);
        PaymentCard kateCard2 = new PaymentCard(kateAccount, "278CVB", true);
        PaymentCard kateCard3 = new PaymentCard(kateAccount, "378OKH", true);
        PaymentCard kateCard4 = new PaymentCard(kateAccount, "410ANV", true);
        PaymentCard card1 = new PaymentCard(new PrivateAccount(2, 30_000,
                new PrivateClient("Mick Jagger")), "445KJH", true);


        PaymentCardList paymentCardListKate = new PaymentCardList();
        PaymentCardList paymentCardListTom = new PaymentCardList();
        PaymentCardList paymentCardList1 = new PaymentCardList();

        paymentCardListTom.addCard(tomCard1);
        paymentCardListTom.addCard(tomCard2);
        paymentCardListTom.addCard(tomCard3);
        paymentCardListTom.addCard(tomCard4);

        paymentCardListKate.addCard(kateCard1);
        paymentCardListKate.addCard(kateCard2);
        paymentCardListKate.addCard(kateCard3);
        paymentCardListKate.addCard(kateCard4);

        paymentCardList1.addCard(card1);

        System.out.println(paymentCardListTom.getByCardNumber("767JNB"));
        System.out.println(paymentCardListKate.getByCardNumber("378OKH"));
        System.out.println();

        paymentCardListTom.printAvailableCards();
        paymentCardListKate.printAvailableCards();
        paymentCardList1.printAvailableCards();

        atm1.withdrawMoney(1_500, kateAccount, kateCard1);
        try {
            atm1.withdrawMoney(9_000, kateAccount, tomCard4);
        }
        catch (ValidationCardException e){
            System.out.println("Card is nooooo available!");
        }

        Terminal terminal1 = new Terminal();
        terminal1.putMoney(1000, kateAccount, kateCard1);

        try {
            terminal1.makePayments(200_000, tomAccount, kateAccount, tomCard4);
        } catch (AvailableClientMoneyException e) {
            System.out.println("Not enough money in your account! Enter the sum less then " + tomAccount.getSum());
        }


        BusinessAccount collinsAccount = new BusinessAccount(12, 100_000_000, new BusinessClient("Collins"));
        POSTerminal posTerminal = new POSTerminal();

        try {
            posTerminal.makePayments(200_500, kateAccount, collinsAccount, kateCard3);
        } catch (AvailableClientMoneyException e) {
            System.out.println("You don`t have such sum! Enter the sum less then " + kateAccount.getSum());
        }

    }
}
