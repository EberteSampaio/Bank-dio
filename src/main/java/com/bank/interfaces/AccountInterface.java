package com.bank.interfaces;

import com.bank.entities.Account;

public interface AccountInterface {

    public void transfer(Double value, Account account);
    public void deposit(Double value);
    public void withdraw(Double value);
}
