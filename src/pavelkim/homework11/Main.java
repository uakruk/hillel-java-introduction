package pavelkim.homework11;
import pavelkim.homework11.actions.PaymentCard;

public class Main {

    public static void main(String [] args) {
        Bank privat = new Bank(666, "PrivatBank");
        Office privateBankOffice = new Office(privat, 12, "Kiyv 1");
        CashBox cashBox = new CashBox(privateBankOffice);
        PaymentCardList paymentCardList = new PaymentCardList();

        Account vasya = new Account(privat,123, 500);
        Account katya = new Account(privat, 111, 5000);
        Atm atm = new Atm(1000);
        BankCashDesk bankCashDesk = new BankCashDesk(99900, privateBankOffice);

        PaymentCard vasyaPaymentCard1 = new PaymentCard(vasya, "1111 2222 3333 4444");
        PaymentCard vasyaPaymentCard2 = new PaymentCard(vasya, "2222 2222 2222 2222");
        PaymentCard katyaPaymentCard1 = new PaymentCard(katya, "1111 1111 1111 1111");
        PaymentCard katyaPaymentCard2 = new PaymentCard(katya, "0000 0000 0000 0000");

        System.out.println(katyaPaymentCard1.toString());

        System.out.println(privat.getBankName());
        privateBankOffice.closeOffice();
        privateBankOffice.openOffice();

        System.out.println("### Check Account and ATM");
        System.out.println(vasya.toString());
        System.out.println(atm.toString());
        System.out.println("### Get 100 form ATM");
        vasya.getMoneyFormMoneyPoint(100, atm);
        System.out.println("### Try PUT money inATM");
        atm.putMoney(500);
        System.out.println("### Check ATM and Account");
        System.out.println(vasya.toString());
        System.out.println(atm.toString());
        System.out.println("### Vasya put 103 in bankCashDesk");
        vasya.putMoneyInMoneyPoint(103, bankCashDesk);
        System.out.println("### Check Vasya and Bank cash desk");
        System.out.println(vasya.toString());
        System.out.println(bankCashDesk.toString());
        System.out.println("### Check Vasya take 207 in Cash box");
        vasya.getMoneyFormMoneyPoint(203, cashBox);
        System.out.println(vasya.toString());

        paymentCardList.addCard(vasyaPaymentCard1);
        paymentCardList.addCard(vasyaPaymentCard2);
        paymentCardList.addCard(katyaPaymentCard1);
        paymentCardList.addCard(katyaPaymentCard2);

        System.out.println(paymentCardList.getByCardNumber("0000 0000 0000 0000").toString());
        System.out.println("2222 2222 2222 2222 NUMBER" + paymentCardList.getByCardNumber("2222 2222 2222 2222").toString());


        System.out.println("#############################################################################################");
        paymentCardList.printAvailableCards();
//        paymentCardList.printAvailableCards();
    }
}
