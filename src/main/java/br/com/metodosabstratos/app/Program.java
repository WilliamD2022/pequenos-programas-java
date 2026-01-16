package br.com.metodosabstratos.app;

import br.com.metodosabstratos.entities.Circle;
import br.com.metodosabstratos.entities.Color;
import br.com.metodosabstratos.entities.Rectangle;
import br.com.metodosabstratos.entities.Shape;

import javax.naming.ldap.PagedResultsResponseControl;
import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1;  i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            Character ch = sc.next().charAt(0);
            System.out.print("Color (Black, Blue,RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());
            if(ch == 'r') {
                System.out.println("with: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
                System.out.println("Area: " + list.get(i-1).area());
            }

            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
            System.out.println();
            System.out.println("SHAPE AREAS:");
            for (Shape shape : list) {
                System.out.printf("%.2f%n", shape.area());








        }

    }
        sc.close();
    }
    }