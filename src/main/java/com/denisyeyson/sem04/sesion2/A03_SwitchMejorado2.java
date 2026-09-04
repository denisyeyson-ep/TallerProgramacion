package com.denisyeyson.sem04.sesion2;

import java.util.Scanner;

public class A03_SwitchMejorado2 {

    private static final int SUMAR = 1;
    private static final int RESTAR = 2;
    private static final int MULTIPLICAR = 3;
    private static final int DIVIDIR = 4;
    private static final int SALIR = 5;

    /**
     * Actividad 3: Switch mejorado 2
     * Calculadora básica con switch mejorado
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2, resultado = 0;

        IO.println("""
                +------------------------------+
                |      CALCULADORA BÁSICA      |
                +------------------------------+
                1. Sumar\t\t(+)
                2. Restar\t\t(-)
                3. Multiplicar\t(*)
                4. Dividir\t\t(÷)
                5. Salir
                """);

        IO.print("Seleccione una opción: ");

        int opcion = teclado.nextInt();

        if (opcion >= SUMAR && opcion <= DIVIDIR) {

            IO.print("Ingrese el primer número: ");
            if (!teclado.hasNextDouble()) {//Válida que ingrese solo números enteros
                System.err.println("Error: Debe ingresar un número entero válido.");
                return;
            }
            numero1 = teclado.nextDouble();

            IO.print("Ingrese el segundo número: ");
            if (!teclado.hasNextDouble()) {//Válida que ingrese solo números enteros
                System.err.println("Error: Debe ingresar un número entero válido.");
                return;
            }
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
                        System.exit(0);//Al detectar el error, sale del programa
                    }
                }
                default -> IO.println("Opción no válida.");
            }

            IO.println("%s %s %s = %s".
                    formatted(formatearNumero(numero1),
                            caracterOperacion(opcion),
                            formatearNumero(numero2),
                            formatearNumero(resultado)
                    )
            );

        } else if (opcion == SALIR) {
            IO.println("Programa finalizado.");
        } else {
            System.err.println("Opción no válida, ingrese solo las opciones del menú.");
        }
        teclado.close();
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

    static String formatearNumero(double valor) {
        if (valor % 1 == 0) {
            return "%.0f".formatted(valor); // Muestra solo el entero
        } else {
            return "%.2f".formatted(valor); // Muestra con 2 decimales
        }
    }
}
