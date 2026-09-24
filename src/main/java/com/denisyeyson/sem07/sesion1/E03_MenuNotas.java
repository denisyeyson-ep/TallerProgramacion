package com.denisyeyson.sem07.sesion1;

import java.util.Scanner;

public class E03_MenuNotas {

    static void main() {
        Scanner entrada = new Scanner(System.in);
        byte opc;
        int contNotas = 0;
        double nota, sumNotas = 0, promedio;

        do {
            System.out.print("""
                    \n
                    *************************
                    *    MENÚ DE NOTAS      *
                    *************************
                    * [1] Ingresar notas     *
                    * [2] Mostrar promedio   *
                    * [3] Salir              *
                    *************************
                    Ingrese una opción:\s""");

            opc = entrada.nextByte();
            entrada.nextLine();

            switch (opc) {
                case 1 -> {
                    do {
                        System.out.printf("Ingrese la nota N°%d (0-20): ", contNotas + 1);
                        nota = entrada.nextDouble();
                        if (nota < 0 || nota > 20)
                            System.err.println("Error: La nota debe estar entre 0 y 20.");
                    } while (nota < 0 || nota > 20);
                    sumNotas += nota;
                    contNotas++;
                }
                case 2 -> {
                    if (contNotas > 0) {
                        promedio = sumNotas / contNotas;
                        System.out.printf("\nEl promedio es: %.2f\n", promedio);
                    } else {
                        System.out.println("\nNo se han ingresado notas.");
                    }
                }
                case 3 -> System.out.println("\nSaliendo del programa...");
                default -> System.err.println("\nOpción no válida.");
            }
        } while (opc != 3);

        entrada.close();
    }
}
