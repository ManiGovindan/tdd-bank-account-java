package org.xpdojo.bank;

public class Account {
    public int balance;

    public void deposit(int i) {
        balance +=  i;
    }

    public void withdraw(int i) {
        balance -= i;
    }

    public void transfer(int i, Account receiver) {
        this.withdraw(i);
        receiver.deposit(i);
    }
}
