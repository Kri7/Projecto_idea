package com.company;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int valorNumero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Escribe otro número: ");
        int valorNumero2 = Integer.parseInt(consola.nextLine());
        int suma = valorNumero1 + valorNumero2;
        System.out.println("La suma es: " + suma);
    }
}
