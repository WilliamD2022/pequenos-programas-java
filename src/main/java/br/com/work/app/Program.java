package br.com.work.app;

import br.com.work.entities.Company;
import br.com.work.entities.Individual;
import br.com.work.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();
        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Taxpayer #" + (i + 1) + ":");
            System.out.print("Individual or Company (i/c)? ");
            char type = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                Individual individual = new Individual(name, anualIncome, healthExpenditures);
                list.add(individual);

            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double sum = 0.0;
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: %.2f%n", sum);
        sc.close();
    }
}
