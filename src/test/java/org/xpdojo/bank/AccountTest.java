package org.xpdojo.bank;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account account = new Account();
        assertThat(account.balance, is(0));
    }

    @Test
    public void depositToEmptyAccountShouldIncreaseTheBalance() {
        Account account = new Account();
        assertThat(account.balance, is(0));

        account.deposit(100);
        assertThat(account.balance, is(100));
    }

    @Test
    public void depositToNonEmptyAccountShouldIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance, is(100));
        account.deposit(300);
        assertThat(account.balance, is(400));
    }

    @Test
    public void withdrawalShouldDecreaseTheBalance() {
        Account account = new Account();
        account.deposit(300);

        assertThat(account.balance, is(300));


        account.withdraw(100);
        assertThat(account.balance, is(200));
    }

    @Test
    public void transferShouldMoveMoneyFromOneAccountToAnother() {
        Account sender = new Account();
        Account receiver = new Account();

        sender.deposit(100);
        assertThat(sender.balance, is(100));
        assertThat(receiver.balance, is(0));

        sender.transfer(50,receiver);
        assertThat(sender.balance, is(50));
        assertThat(receiver.balance, is(50));

    }
}
