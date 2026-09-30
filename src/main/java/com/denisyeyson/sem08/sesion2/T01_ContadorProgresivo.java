package com.denisyeyson.sem08.sesion2;

import java.util.Scanner;

public class T01_ContadorProgresivo {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el límite hasta donde contar: ");
        int limite = entrada.nextInt();

        if (limite <= 0) {
            System.out.println("El número debe ser mayor a 0.");
        } else {
            System.out.println("Iniciando conteo progresivo:");
            for (int i = 1; i <= limite; i++) {
                System.out.println("Número: " + i);
            }
        }
        entrada.close();
    }
}
