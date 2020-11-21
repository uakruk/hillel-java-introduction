package com.hillel.java.introduction.katerynadanko.Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private int bankMFO;
    private String bankAddress;
    private int bankCoordinates;

    private List<Client> clients;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBankMFO() {
        return bankMFO;
    }

    public void setBankMFO(int bankMFO) {
        this.bankMFO = bankMFO;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public int getBankCoordinates() {
        return bankCoordinates;
    }

    public void setBankCoordinates(int bankCoordinates) {
        this.bankCoordinates = bankCoordinates;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                '}';
    }
}
