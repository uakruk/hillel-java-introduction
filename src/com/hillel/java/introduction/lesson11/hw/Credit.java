package com.hillel.java.introduction.lesson11.hw;

import java.time.LocalDate;

public class Credit {

    private double totalSum;

    private double debtSum;

    private double interestRate;

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    public double getDebtSum() {
        return debtSum;
    }

    public void setDebtSum(double debtSum) {
        this.debtSum = debtSum;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
