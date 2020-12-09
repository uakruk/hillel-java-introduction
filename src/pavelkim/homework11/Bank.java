package pavelkim.homework11;

public class Bank {
    private int numberOfOffices;
    private Office[] offices;
    private String bankName;

    public Bank(int numberOfOffices, String bankName) {
        this.numberOfOffices = numberOfOffices;
        this.bankName = bankName;
    }
    public String getBankName() {
        return this.bankName;
    }
}