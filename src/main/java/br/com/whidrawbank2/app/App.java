package br.com.whidrawbank2.app;

import br.com.whidrawbank2.model.exception.DomainException;
import br.com.whidrawbank2.model.entities.Account;

import java.lang.reflect.AccessFlag;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




        System.out.println("Informe os dados da conta: ");
        System.out.print("Número: ");
        long number = sc.nextLong();
        sc.nextLine();
        System.out.print("Titular: ");
        String holder = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double whithdrawalLimit = sc.nextDouble();

        Account acc = new Account((int) number,holder,balance,whithdrawalLimit);

        System.out.println();
        System.out.print("Informe o valor para saque: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());


        }catch (DomainException e) {
            System.out.println(e.getMessage());

        }
        System.out.println();


        sc.close();

    }

}
