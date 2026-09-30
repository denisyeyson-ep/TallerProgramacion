package com.denisyeyson.sem08.sesion2;

import java.util.Scanner;

public class T02_ContadorAcumulador {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos números desea ingresar?: ");
        int n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("Cantidad no válida.");
        } else {
            int acumuladorSuma = 0; // Acumulador
            int contadorPares = 0;   // Contador adicional

            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                int num = entrada.nextInt();

                acumuladorSuma += num; // Incremento del acumulador

                if (num % 2 == 0) {
                    contadorPares++; // Incremento del contador adicional
                }
            }
            System.out.printf("""
                    \n
                    Resultados:
                    Suma total acumulada: %d
                    Cantidad de números pares ingresados: %d
                    """, acumuladorSuma, contadorPares);
        }
        entrada.close();
    }
}
