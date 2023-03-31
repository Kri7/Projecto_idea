package com.company;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Inserta la base: ");

        int base = Integer.parseInt(consola.nextLine());

        System.out.println("Inserta la altura: ");

        int altura = Integer.parseInt(consola.nextLine());

        int areaTriangulo = (base * altura)/2;

        System.out.println("El área es: " + areaTriangulo);

    }

}
