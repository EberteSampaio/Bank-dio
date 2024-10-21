package com.bank.entities;

import com.bank.interfaces.ClientInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client implements ClientInterface {

    private String name;
    private String email;
    private String number;

    @Override
    public void showDetails() {
        System.out.println("Nome: "+ this.name+"\nEmail: "+this.email+"\nNúmero: "+this.name);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
