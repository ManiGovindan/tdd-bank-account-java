package org.xpdojo.bank;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    @Test
    public void startingBalanceIsZero() {
        Account account = new Account();
        assertThat(account.balance, is(0));
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);

        assertThat(account.balance, is(100));
    }

    @Test
    public void depositingMultipleAmounts() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(300);
        assertThat(account.balance, is(400));
    }

    @Test
    public void withdrawAmounts() {
        Account account = new Account();
        account.deposit(300);

        assertThat(account.balance, is(300));


        account.withdraw(100);
        assertThat(account.balance, is(200));
    }
}
