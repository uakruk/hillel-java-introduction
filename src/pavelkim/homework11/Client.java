package pavelkim.homework11;

import pavelkim.homework11.abs.MoneyPoint;

public class Client {
    private int id;
    private double balance;

    public Client(int id, double balance) {
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
        return "Client{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
