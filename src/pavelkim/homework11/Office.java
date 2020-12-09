package pavelkim.homework11;

public class Office {
    private Bank bank;
    private int id;
    private String address;

    public Office(Bank bank, int id, String address) {
        this.bank = bank;
        this.id = id;
        this.address = address;
    }

    protected void openOffice() {
        System.out.println(bank.getBankName() + " office is Open");
    }

    protected void closeOffice() {
        System.out.println(bank.getBankName() + " office is Close");
    }
}
