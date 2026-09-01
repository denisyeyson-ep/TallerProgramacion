package com.denisyeyson.sem04.sesion2;

import java.util.Scanner;

public class A03_SwitchMejorado2 {

    private static final int SUMAR = 1;
    private static final int RESTAR = 2;
    private static final int MULTIPLICAR = 3;
    private static final int DIVIDIR = 4;
    private static final int SALIR = 5;

    static void main() {
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2, resultado = 0;

        System.out.println("""
                +------------------------------+
                |      CALCULADORA BÁSICA      |
                +------------------------------+
                1. Sumar\t\t(+)
                2. Restar\t\t(-)
                3. Multiplicar\t(*)
                4. Dividir\t\t(÷)
                5. Salir
                """);

        System.out.print("Seleccione una opción: ");
        if (!teclado.hasNextInt()) {//Válida que ingrese solo números enteros
            System.err.println("Error: Debe ingresar un número entero válido.");
            return;
        }
        int opcion = teclado.nextInt();

        if (opcion >= SUMAR && opcion <= DIVIDIR) {
            System.out.print("Ingrese el primer número: ");
            numero1 = teclado.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            numero2 = teclado.nextDouble();

            switch (opcion) {
                case SUMAR -> resultado = (numero1 + numero2);
                case RESTAR -> resultado = (numero1 - numero2);
                case MULTIPLICAR -> resultado = (numero1 * numero2);
                case DIVIDIR -> {
                    if (numero2 != 0) {
                        resultado = (numero1 / numero2);
                    } else {
                        System.err.println("No se puede dividir entre cero.");
                        System.exit(0);//Al detectar el error se sale del programa
                    }
                }
                default -> System.out.println("Opción no válida.");
            }
            mostrarResultado(opcion, numero1, numero2, resultado);
        } else if (opcion == SALIR) {
            System.out.println("Programa finalizado.");
        } else {
            System.err.println("Opción no válida, ingrese solo las opciones del menú.");
        }

        teclado.close();
    }

    static void mostrarResultado(int opcion, double numero1, double numero2, double resultado) {
        System.out.printf("""
                %.2f %s %.2f = %.2f
                """, numero1, caracterOperacion(opcion), numero2, resultado);
    }

    static char caracterOperacion(int opcion) {
        return switch (opcion) {
            case SUMAR -> '+';
            case RESTAR -> '-';
            case MULTIPLICAR -> '*';
            case DIVIDIR -> '÷';
            default -> ' ';
        };
    }
}
