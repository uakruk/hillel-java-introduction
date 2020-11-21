package com.hillel.java.introduction.katerynadanko.Bank;

import java.util.ArrayList;
import java.util.List;
         public class Test {

             public static void main(String[] args) {

                 ATM atm1 = new ATM();
                 PrivateAccount kateAccount = new PrivateAccount(345, 50_000, new PrivateClient("Kateryna Danko"));
                 PrivateAccount tomAccount = new PrivateAccount(543, 20_000, new PrivateClient("Tom Robinson"));

                     atm1.withdrawMoney(1_500, kateAccount);
                     atm1.withdrawMoney(9_000, kateAccount);

                     Terminal terminal1 = new Terminal();
                     terminal1.putMoney(1000, kateAccount);
                     terminal1.makePayments(2000, tomAccount, kateAccount);


                    BusinessAccount collinsAccount = new BusinessAccount(12,100_000_000, new BusinessClient("Collins"));
                    POSTerminal posTerminal = new POSTerminal();

                    posTerminal.makePayments(2_500, kateAccount, collinsAccount);


             }
}
