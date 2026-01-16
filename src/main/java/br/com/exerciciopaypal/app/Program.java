package br.com.exerciciopaypal.app;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


         System.out.println("Enter the amount to be paid: ");

         System.out.print("Numero: ");
         double number = sc.nextDouble();
         sc.nextLine();

         System.out.print("Data dd/MM/yyyy : ");
         String data = sc.nextLine();
         sc.nextLine();

         System.out.print("Valor do contrato: ");
         double valor = sc.nextDouble();
         sc.nextLine();

         System.out.print("Entre com o numero de parcelas: ");
         int parcelas = sc.nextInt();

         System.out.println("Parcelas");
         for (int i = 1; i <= parcelas; i++) {
             System.out.printf("%d - R$ %.2f%n", i, valor / parcelas);
             valor += valor / parcelas;

         }












            sc.close();
    }
}
