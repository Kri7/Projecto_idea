package com.company;

        import java.util.Scanner;

public class Almacen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double descuento = 0;
        double total;

        System.out.println("Introduce el precio del articulo: ");
        double precio= scan.nextDouble();

        if (precio > 100) {
            descuento = precio * 0.8;
        } else if (precio == 100) {
            descuento = precio * 0.25;
        } else if (precio < 100) {
            descuento = precio *0.05;
        }
      total = (precio-descuento);

        System.out.println("El precio del articulo es: " + precio);
        System.out.println("El descuento aplicado es: " + descuento);
        System.out.println("El precio total con el descuento es: " + total);

    }
}