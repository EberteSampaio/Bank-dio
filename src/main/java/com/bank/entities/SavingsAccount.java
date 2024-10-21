package com.bank.entities;

public class SavingsAccount extends Account{
    private final static Double WITHDRAWAL_FEE = 0.5;


    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void transfer(Double value, Account account){

        this.withdraw(value - (value * WITHDRAWAL_FEE));
        account.deposit(value);
    }

    @Override
    public void showAccountDetails(){;
        super.showAccountDetails();
        System.out.println("Taxa: "+WITHDRAWAL_FEE);
    }
}
