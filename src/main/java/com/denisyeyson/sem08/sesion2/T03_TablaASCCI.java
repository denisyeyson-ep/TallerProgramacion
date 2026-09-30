package com.denisyeyson.sem08.sesion2;

import java.util.Scanner;

public class T03_TablaASCCI {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== REPORTE DE TABLA ASCII ===");
        System.out.print("Ingrese el código de inicio (ej. 33): ");
        int inicio = entrada.nextInt();
        System.out.print("Ingrese el código final (ej. 126): ");
        int fin = entrada.nextInt();

        if (inicio < 32 || fin > 126 || inicio > fin) {
            System.out.println("Rango fuera de los límites de caracteres imprimibles (32 - 126).");
        } else {
            System.out.println("\n---------------------------------");
            System.out.println(" CÓDIGO | CARÁCTER | TIPO ");
            System.out.println("---------------------------------");

            for (int i = inicio; i <= fin; i++) {
                char caracter = (char) i;
                String tipo;

                if (i >= 48 && i <= 57) {
                    tipo = "Número";
                } else if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
                    tipo = "Letra";
                } else {
                    tipo = "Símbolo";
                }

                System.out.printf("  %-6d |    %-5c | %s\n", i, caracter, tipo);
            }
            System.out.println("---------------------------------");
        }
        entrada.close();
    }
}