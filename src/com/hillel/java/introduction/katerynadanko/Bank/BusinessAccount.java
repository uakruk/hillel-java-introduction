package com.hillel.java.introduction.katerynadanko.Bank;

public class BusinessAccount extends BankAccount {
//    int id;
//    double sum;
    private BusinessClient businessClient;

    public BusinessAccount(int id, double sum, BusinessClient businessClient) {
        super(id, sum);
        this.businessClient = businessClient;
    }

    public BusinessClient getBusinessClient() {
        return businessClient;
    }

    public void setBusinessClient(BusinessClient businessClient) {
        this.businessClient = businessClient;
    }

    @Override
    public String toString() {
        return "businessClient: " + businessClient.getName();
    }
}
