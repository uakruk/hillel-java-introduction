package pavelkim.homework11;

import pavelkim.homework11.abs.MoneyPoint;

public class BankCashDesk extends MoneyPoint {

    Office office;

    public BankCashDesk(double cashAmount, Office office) {
        super(cashAmount);
        this.office = office;
    }
}
