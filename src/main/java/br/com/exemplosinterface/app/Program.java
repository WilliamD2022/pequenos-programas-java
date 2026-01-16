package br.com.exemplosinterface.app;

import br.com.exemplosinterface.model.entities.CarRental;
import br.com.exemplosinterface.model.entities.Vehiicle;
import br.com.exemplosinterface.model.service.BrazilTaxService;
import br.com.exemplosinterface.model.service.RentalService;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        System.out.println("Entre com dados do aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.println("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start  = LocalDateTime.parse(sc.nextLine(),fmt);

        System.out.println("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);


        CarRental cr = new CarRental(start, finish, new Vehiicle(carModel));

        System.out.println("Entre com preco por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preco por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService  rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("Fatura gerada com sucesso!");
        System.out.println("Pagamento basic: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());


        sc.close();



    }
}
