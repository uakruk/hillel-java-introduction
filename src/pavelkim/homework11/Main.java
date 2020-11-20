package pavelkim.homework11;

public class Main {

    public static void main(String [] args) {
        Bank privat = new Bank(666, "PrivatBank");
        Office privateBankOffice = new Office(privat, 12, "Kiyv 1");
        CashBox cashBox = new CashBox(privateBankOffice);

        Account vasya = new Account(privat,123, 500);
        Atm atm = new Atm(1000);
        BankCashDesk bankCashDesk = new BankCashDesk(99900, privateBankOffice);



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
    }
}
