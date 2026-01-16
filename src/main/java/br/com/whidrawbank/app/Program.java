package br.com.whidrawbank.app;

import br.com.whidrawbank.model.entities.Pessoa;
import br.com.whidrawbank.model.entities.Withdraw;
import br.com.whidrawbank.model.exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account data :");

        System.out.print("Number: ");
        long number = sc.nextLong();

        System.out.print("Holder: ");
        sc.nextLine();
        String nameHolder = sc.nextLine();

        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Limit: ");
        double limit = sc.nextDouble();

        System.out.print("Enter amount for withdrawal: ");
        double withdrawal = sc.nextDouble();

        try {
            Pessoa holder = new Pessoa(number, nameHolder);
            Withdraw account = new Withdraw(balance, limit);
            account.withdraw(withdrawal);
            System.out.printf("New Balance: %.2f%n", account.getBalance());
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }
}
}
