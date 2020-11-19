package pavelkim.homework11;

public class Main {

    public static void main(String [] args) {
        Client vasya = new Client(123, 500);
        Atm atm = new Atm(1000);
        BankCashDesk bankCashDesk = new BankCashDesk(99900);

        System.out.println(vasya.toString());
        System.out.println(atm.toString());

        vasya.getMoneyFormMoneyPoint(100, atm);
        atm.putMoney(500);

        System.out.println(vasya.toString());
        System.out.println(atm.toString());
        vasya.putMoneyInMoneyPoint(103, bankCashDesk);
        System.out.println(vasya.toString());
        System.out.println(bankCashDesk.toString());
    }
}
