package com.hillel.java.introduction.lesson14;

import com.hillel.java.introduction.lesson11.hw.Atm;
import com.hillel.java.introduction.lesson11.hw.Bank;
import com.hillel.java.introduction.lesson11.hw.Terminal;

public interface PersonActivity {

    void buyGoods();

    void getMoneyFromAtm(Atm atm);

    void fillBalance(Terminal terminal);

    void getCredit(Bank bank);
}
