package com.denisyeyson.sem07.sesion2;

import java.util.Scanner;

public class T03_AcumuladorProgresivo {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Hasta qué número deseas sumar?: ");
        int limite = scanner.nextInt();

        int i = 1;
        int suma = 0;

        do {
            suma += i;
            i++;
        } while (i <= limite);

        System.out.println("La suma total de 1 a " + limite + " es: " + suma);
        scanner.close();
    }
}
