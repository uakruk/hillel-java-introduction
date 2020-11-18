package pavelkim.homework11;

public abstract class Bank {
    private String name;
    private String countryCode;

    public Bank(String name, String countryCode) {
        this.name = name;
        this.countryCode = countryCode;
    }
}
