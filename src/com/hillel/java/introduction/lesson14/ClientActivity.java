package com.hillel.java.introduction.lesson14;

import com.hillel.java.introduction.lesson11.hw.Atm;
import com.hillel.java.introduction.lesson11.hw.Bank;
import com.hillel.java.introduction.lesson11.hw.BankAccount;
import com.hillel.java.introduction.lesson11.hw.MoneyAccpetable;
import com.hillel.java.introduction.lesson11.hw.MoneyWidthdrawable;
import com.hillel.java.introduction.lesson11.hw.Terminal;

public interface ClientActivity {

    void buyGoods();

    void getCash(MoneyWidthdrawable moneyWidthdrawable);

    void fillBalance(MoneyAccpetable terminal);

    void getCredit(Bank bank);

    void sendTransfer(BankAccount to);
}
