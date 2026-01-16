package br.com.whidrawbank2.model.entities;


import br.com.whidrawbank2.model.exception.DomainException;
public class Account {

    private int number;
    private String holder;
    private double balance;
    private double whithdrawLimit;

    public Account() {
    }

    public Account(int number, String holder, double balance, double whithdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.whithdrawLimit = whithdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWhithdrawLimit(){
        return whithdrawLimit;
    }

    public void setWhithdrawLimit(double whithdrawLimit) {
        this.whithdrawLimit = whithdrawLimit;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", whithdrawLimit=" + whithdrawLimit +
                '}';
    }


    public void deposit (double amount) {
         if (amount <= 0){
         throw new DomainException("Amount must be greater than zero");
         }
         balance += amount;
         System.out.println("Deposit success");
    }

    public void withdraw (double amount) {
        if (amount > whithdrawLimit) {
            throw new DomainException(DomainException.ERROR_LIMIT);
        } else if (amount > balance) {
            throw new DomainException(DomainException.ERROR_BALANCE);
        }
        balance -= amount;
        System.out.println("Withdraw success");
    }


    }


