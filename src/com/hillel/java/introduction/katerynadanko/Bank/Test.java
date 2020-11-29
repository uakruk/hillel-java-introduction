package com.hillel.java.introduction.katerynadanko.Bank;

public class Test {

    public static void main(String[] args) throws AvailableBankMoneyException, ValidationCardException {

        ATM atm1 = new ATM();
//        atm1.setAvailableMoney(1000);
        PrivateAccount kateAccount = new PrivateAccount(345, 50_000, new PrivateClient("Kateryna Danko"));
        PrivateAccount tomAccount = new PrivateAccount(543, 20_000, new PrivateClient("Tom Robinson"));

        atm1.withdrawMoney(1_500, kateAccount);
        atm1.withdrawMoney(9_000, kateAccount);

        Terminal terminal1 = new Terminal();
        terminal1.putMoney(1000, kateAccount);

        try {
            terminal1.makePayments(200_000, tomAccount, kateAccount);
        } catch (AvailableClientMoneyException e) {
            System.out.println("Not enough money in your account! Enter the sum less then " + tomAccount.getSum());
        }


        BusinessAccount collinsAccount = new BusinessAccount(12, 100_000_000, new BusinessClient("Collins"));
        POSTerminal posTerminal = new POSTerminal();

        try {
            posTerminal.makePayments(200_500, kateAccount, collinsAccount);
        } catch (AvailableClientMoneyException e) {
            System.out.println("You don`t have such sum! Enter the sum less then " + kateAccount.getSum());
        }


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


        PaymentCardList paymentCardList = new PaymentCardList();
        System.out.println();

            paymentCardList.printAvailableCards();

        paymentCardList.addCard(tomCard1);
        paymentCardList.addCard(tomCard2);
        paymentCardList.addCard(tomCard3);
        paymentCardList.addCard(tomCard4);

        paymentCardList.addCard(kateCard1);
        paymentCardList.addCard(kateCard2);
        paymentCardList.addCard(kateCard3);
        paymentCardList.addCard(kateCard4);

        paymentCardList.addCard(card1);

        System.out.println();

        paymentCardList.printAvailableCards();


        System.out.println();

        System.out.println(paymentCardList.getByCardNumber("767JNB"));
        System.out.println(paymentCardList.getByCardNumber("378OKH"));
        System.out.println();

        paymentCardList.printAvailableCards();

    }
}
