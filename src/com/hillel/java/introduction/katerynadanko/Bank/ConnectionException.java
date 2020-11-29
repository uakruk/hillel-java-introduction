package com.hillel.java.introduction.katerynadanko.Bank;

public class ConnectionException extends RuntimeException{

    public ConnectionException() {
    }

    public ConnectionException(String message) {
        super(message);
    }
}
