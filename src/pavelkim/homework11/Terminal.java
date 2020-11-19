package pavelkim.homework11;

import pavelkim.homework11.abs.MoneyPoint;

public class Terminal extends MoneyPoint {

    public Terminal() {
        super();
    }

    @Override
    public void putMoney(double sum) {
        System.out.println("can't put money on Bank account in ATM");
    }
}
