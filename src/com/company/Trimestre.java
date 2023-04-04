package com.company;

import java.util.Scanner;

public class Trimestre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia, mes, anno;

        System.out.println("Introduce un día");
        dia = sc.nextInt();

        System.out.println("Introduce un mes");
        mes = sc.nextInt();

        System.out.println("Introduce un año");
        anno = sc.nextInt();


        if (dia >= 1 && dia <= 31) {
            if (mes == 1 || mes == 2 || mes == 3)

                System.out.println("La fecha " + dia + " " + mes + " " + anno + " es del primer trimestre");
            else {
                System.out.println("La fecha " + dia + " " + mes + " " + anno + " no es del primer trimestre");

            }
        }
    }
}