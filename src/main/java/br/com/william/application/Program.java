package br.com.william.application;

import br.com.william.entities.Account;
import br.com.william.entities.BusinessAcount;
import br.com.william.entities.SavingsAccout;

import java.util.ArrayList;
import java.util.List;

public final class Program {
    public static void main(String[] args) {

    List<Account> list = new ArrayList<>();

     SavingsAccout savingsAccout = new SavingsAccout(1001, "Alex", 500.00, 0.01);
     list.add(savingsAccout);
        BusinessAcount businessAcount = new BusinessAcount(1002, "Maria", 1000.0, 400.0);
        list.add(businessAcount);

        list.add(new SavingsAccout(1003, "Bob", 300.0, 0.01));
        list.add(new BusinessAcount(1004, "Anna", 500.0, 500.0));



        double sum = 0.0;
        for(Account a : list) {
            sum += a.getBalance();
        }
        System.out.printf("Total: %.2f%n".formatted(sum));

            for (Account a : list){
                a.deposit(10.0);
            }
            for(Account a : list){
                System.out.println("Update balance for account %d: %.2f%n".formatted(a.getNumber(), a.getBalance()));
            }
        }

    }

