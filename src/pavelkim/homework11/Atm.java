package pavelkim.homework11;

import pavelkim.homework11.abs.MoneyPoint;

public class Atm extends MoneyPoint {


    public Atm(double cashAmount) {
        super(cashAmount);
    }

    @Override
    public void putMoney(double sum) {
        System.out.println("can't put money on Bank account in ATM");
    }
}
