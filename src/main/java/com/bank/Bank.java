package com.bank;

import com.bank.entities.Account;
import com.bank.entities.CheckingAccount;
import com.bank.entities.Client;
import com.bank.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        Client client1 = new Client("Robson Caetâno","robscaetano@mail.com","999754032");
        Client client2 = new Client("Joyce Santa","robscaitano@mail.com","999754032");

        Account account1 = new SavingsAccount(client1);
        account1.deposit(1000.00);

        Account account2 = new CheckingAccount(client2, 500);
        account2.deposit(500.00);




        account2.transfer(100.00, account1);

        account1.withdraw(50.00);

        account2.transfer(200.00,account1);

        accountList.add(account1);
        accountList.add(account2);

        accountList.forEach(account -> {

            account.showAccountDetails();
            System.out.println("#############################################################");
        });
    }
}