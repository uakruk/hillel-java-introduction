package pavelkim.homework11;

import pavelkim.homework11.abs.MoneyPoint;

public class Account {
    private int id;
    private double balance;
    private Bank bank;

    public Account(Bank bank, int id, double balance) {
        this.bank=bank;
        this.id = id;
        this.balance = balance;
    }

    public void getMoneyFormMoneyPoint(double sum, MoneyPoint moneyPoint) {
        moneyPoint.takeMoney(sum);
        this.balance = this.balance - sum;
    }

    public void putMoneyInMoneyPoint(double sum, MoneyPoint moneyPoint) {
        moneyPoint.putMoney(sum);
        this.balance = this.balance +sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "bank : " + bank.getBankName() +
                ", id : " + id +
                ", balance : " + balance +
                '}';
    }
}
