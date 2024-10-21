package com.bank.entities;

import com.bank.interfaces.AccountInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
public abstract class Account implements AccountInterface {

    protected static Integer ID_ACCOUNT = 0;
    private Integer numberAccount;
    protected Integer agency;
    protected Double money;
    private Client client;

    public Account(Client client){
        this.agency = 1;
        this.money = 0.0;
        this.numberAccount = ID_ACCOUNT + 1;
        this.client = client;
    }

    public void transfer(Double value, Account account){
        this.withdraw(value);
        account.deposit(value);
    }

    public void withdraw(Double value){
        this.money -= value;
    }
    public void deposit(Double value){
        this.money += value;
    }

    public void showAccountDetails(){;
        this.client.showDetails();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberAccount=" + numberAccount +
                ", agency=" + agency +
                ", money=" + money +
                ", client=" + client +
                '}';
    }
}
