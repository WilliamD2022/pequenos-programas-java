package br.com.williampolimorfismo.app;

import br.com.williampolimorfismo.entities.ImportProduct;
import br.com.williampolimorfismo.entities.Product;
import br.com.williampolimorfismo.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Datos do produto #" + i + ":");
            System.out.print("Comum, usado, importado (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preco: ");
            double price = sc.nextDouble();

            if (type == 'c') {
                list.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Data de Fabricacao (DD/MM/YYYY): ");
                sc.nextLine();
                LocalDate manufactureDate = LocalDate.parse(
                        sc.nextLine(),
                        DateTimeFormatter.ofPattern("dd/MM/yyyy")
                );
                list.add(new UsedProduct(name, price, manufactureDate));
            } else {
                System.out.print("Taxa da importacao: ");
                double customFee = sc.nextDouble();
                list.add(new ImportProduct(name, price, customFee));
            }
        }

        System.out.println("Produtos:");
        System.out.println("Etiqueta de preco");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}
