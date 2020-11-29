package com.hillel.java.introduction.katerynadanko.Bank;

import java.util.Random;

public class ConnectionRandom {

    Random random = new Random();
    private int i = random.nextInt(100);

    public int randConnect() throws ConnectionException {

        for (int j = 0; j <= 3; j++) {
            if (i < 5) {
                throw new ConnectionException("No internet connection! Try again later!");
            }
        }
        return i;
    }
}
