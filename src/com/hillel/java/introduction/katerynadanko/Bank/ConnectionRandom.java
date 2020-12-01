package com.hillel.java.introduction.katerynadanko.Bank;

import java.util.Random;

public class ConnectionRandom {
    private Random r = new Random();

    public int randConnect() throws ConnectionException {

        for (int i = 0; i <= 3; i++) {
            if (r.nextInt(100) < 5) {
                throw new ConnectionException("No internet connection! Try again later!");
            }
        }
        return r.nextInt(100);
    }
}
