package com.company;

import java.util.Scanner;

public class Rango {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la edad del usuario");

        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 120) {
            System.out.println("La edad esta dentro del rango");
        } else {
            System.out.println("La edad no es correcta");
        }
    }
}