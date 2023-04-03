package com.company;

public class Temperatura {
    public static void main(String[] args) {
        int temperatura = 16;
        if (temperatura < 5) {
            System.out.println("¡A esquiar!");
        } else if (temperatura > 15 && temperatura < 25) {
            System.out.println("¡A la montaña!");
        } else if (temperatura > 25) {
            System.out.println("¡A la playa!");
        } else {
            System.out.println("¡A descansar... Zzz!");
        }
    }
}
