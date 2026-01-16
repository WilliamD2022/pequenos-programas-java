package br.com.TratamentoExececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();

        System.out.println("Fim do programa");

    }

    public static void method1() {
        System.out.println("Início do método 1");
        method2();
        System.out.println("fim do metodo 1");
    }

    public static void method2() {

        System.out.println("Início do método 2");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();
            sc.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("Valor invalido");


        }
    }
}
