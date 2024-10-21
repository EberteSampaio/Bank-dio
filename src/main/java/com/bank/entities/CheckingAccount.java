package com.bank.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccount extends Account {
    private double limit;

    public CheckingAccount(Client client, double limit) {
        super(client);
        this.limit = limit;
    }

    @Override
    public void withdraw(Double value) {
        if (super.money + this.limit >= value) {
            super.withdraw(value);
        } else {
            System.out.println("Saldo e limite insuficientes.");
        }
    }

    @Override
    public void showAccountDetails() {
        super.showAccountDetails();
        System.out.println("\nLimite da conta: " + this.limit);
    }
}