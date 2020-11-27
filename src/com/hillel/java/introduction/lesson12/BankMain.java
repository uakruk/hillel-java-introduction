package com.hillel.java.introduction.lesson12;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = new PrivatBank();


        try {
            bank.pay();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(getNumber());

        try {
            System.out.println("Inside try");
            throw new MyError();
        } catch (Throwable e) {
            System.out.println("Error");
        }
    }

    public static int getNumber() {
        try {
            System.out.println("Inside try block");
            if (false) {
                throw new RuntimeException();
            }
            return 5;
        } catch (Exception e) {
            System.out.println("Inside catch block");
            return 10;
        } finally {
            System.out.println("Inside finally block");
            return 15;
        }
    }
}
