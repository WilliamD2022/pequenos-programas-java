package br.com.TratamentoExececoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("c:\\temp\\in.txt");
        Scanner sc = null;


        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
