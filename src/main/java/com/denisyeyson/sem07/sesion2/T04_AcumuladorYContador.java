package com.denisyeyson.sem07.sesion2;

import java.util.Scanner;

public class T04_AcumuladorYContador {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        double sumaNotas = 0; // Acumulador
        int contadorNotas = 0; // Contador
        double nota;

        System.out.println("Sistema de Notas (Ingrese -1 para finalizar): ");
        do {
            System.out.print("Ingrese una nota: ");
            nota = scanner.nextDouble();

            if (nota != -1) {
                sumaNotas += nota;  // Acumula la nota
                contadorNotas++;    // Cuenta la cantidad de notas
            }
        } while (nota != -1);

        if (contadorNotas > 0) {
            double promedio = sumaNotas / contadorNotas;
            System.out.println("Total de notas ingresadas: " + contadorNotas);
            System.out.println("Promedio final: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }

        scanner.close();
    }
}
