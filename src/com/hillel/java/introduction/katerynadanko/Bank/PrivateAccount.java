package com.hillel.java.introduction.katerynadanko.Bank;

public class PrivateAccount extends BankAccount {
//    int id;
//    double sum;
    private PrivateClient privateClient;
    public PrivateAccount(int id, double sum, PrivateClient privateClient) {
        super(id, sum);
       this.privateClient = privateClient;
    }

    public PrivateClient getPrivateClient() {
        return privateClient;
    }

    public void setPrivateClient(PrivateClient privateClient) {
        this.privateClient = privateClient;
    }

    @Override
    public String toString() {
        return "privateClient: " + privateClient.getName();
    }
}
