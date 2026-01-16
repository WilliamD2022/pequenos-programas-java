package br.com.whidrawbank.model.entities;

import br.com.whidrawbank.model.exception.DomainException;

public class Withdraw {
    private double balance;
    private double limit;

    public Withdraw(double balance, double limit) {
        this.balance = balance;
        this.limit = limit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void withdraw(double amount){
       if (amount > limit){
           throw new DomainException(DomainException.ERROR_LIMIT);
        }
       if (amount > balance){
           throw new DomainException(DomainException.ERROR_BALANCE);
       }
       balance -= amount;
       System.out.println("Withdraw success");
    }
}
