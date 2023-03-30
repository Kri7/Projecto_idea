package com.company;

import java.util.Scanner;

public class ServicioEcoNombre {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);


        System.out.println("Escribe tu nombre: ");

//Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
        String nombre = consola.nextLine(); //nextLine lee una linea completa // Guarda en una variable lo leido por el scaner

// Imprime el mensaje introducido por el usuario
        System.out.println("Escribe tus apellidos: ");

        String apellidos = consola.nextLine();

        System.out.println("Tu nombre es: " + nombre);

        System.out.println("Tus apellidos son: " + apellidos);

        System.out.println("Tu nombre completo es: " + nombre +" "+ apellidos);
    }
}




