package pavelkim.homework11;

public class Bank {
    private int numberOfOffices;
    private Office[] offices = new Office[numberOfOffices];
    private String bankName;

    public Bank(int numberOfOffices, Office[] offices, String bankName) {
        this.numberOfOffices = numberOfOffices;
        this.offices = offices;
        this.bankName = bankName;
    }
    public String getBankName() {
        return this.bankName;
    }
}
