package com.company;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        int temperatura;

        System.out.println("Indique la temperatura");
        temperatura = consola.nextInt();

        if (temperatura <= 5) {
            System.out.println("¡A esquiar!");

        } else if (temperatura >= 15 && temperatura < 25) {
            System.out.println("¡A la montaña!");

        } else if (temperatura >= 25) {
            System.out.println("¡A la playa!");

        } else {
            System.out.println("¡A descansar... Zzz!");
        }
    }
}
