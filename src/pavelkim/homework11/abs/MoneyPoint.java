package pavelkim.homework11.abs;

import pavelkim.homework11.actions.TakeMoney;
import pavelkim.homework11.actions.PutMoney;

public abstract class MoneyPoint implements TakeMoney, PutMoney {

    protected double cashAmount;

    public MoneyPoint(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public MoneyPoint() {
    }

    @Override
    public void takeMoney(double sum) {
        this.cashAmount = this.cashAmount -sum;
    }

    @Override
    public void putMoney(double sum) {
        this.cashAmount =this.cashAmount +sum;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "cashAmount=" + cashAmount +
                '}';
    }
}
