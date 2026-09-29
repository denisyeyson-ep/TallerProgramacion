package com.denisyeyson.sem08.sesion1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class E01_ProgresionAritmetica {
    static Scanner entrada = new Scanner(System.in);

    static void main() {
        String menuOpciones = """
                \n
                Tipo progresión:
                    1. Progresión Aritmética
                    2. Progresión Geométrica
                Escoja un tipo:\s""";
        int tipoProgresion = validarEntero(menuOpciones, "\nIngresar solo las opciones del menú, no se aceptan caracteres!\n", "[1,2]");
        double primerTermino = validarDecimal("\nIngrese el primer término: ", "\nError: ingrese un número válido.\n", "^-?\\d+(\\.\\d+)?$");
        double razon = validarDecimal("\nIngrese la razón: ", "\nError: ingrese un número válido.\n", "^-?\\d+(\\.\\d+)?$");
        int numeroTerminos = validarEntero("\nIngrese el número de términos: ", "\nError: Ingresar solo números enteros mayores que cero!\n", "^[1-9]\\d*$");

        switch (tipoProgresion) {
            case 1 -> calcularProgresionAritmetica(primerTermino, razon, numeroTerminos);
            case 2 -> calcularProgresionGeometrica(primerTermino, razon, numeroTerminos);
            default -> System.out.println("Error: Opción no valida");
        }
        entrada.close();
    }

    static void calcularProgresionAritmetica(double primerNumero, double razon, int numeroTerminos) {
        StringBuilder resultadoAritmetica = new StringBuilder();
        double valor = primerNumero;
        for (double i = 0; i < numeroTerminos; i++) {
            resultadoAritmetica.append(formatearNumero(valor)).append(", ");
            valor += razon;
        }
        System.out.printf("\nProgresión Aritmética:[%s\b\b]", resultadoAritmetica);
    }

    static void calcularProgresionGeometrica(double primerNumero, double razon, int numeroTerminos) {
        StringBuilder resultadoGeometrico = new StringBuilder();
        double valor = primerNumero;
        for (double i = 0; i < numeroTerminos; i++) {
            resultadoGeometrico.append(formatearNumero(valor)).append(", ");
            valor *= razon;
        }
        System.out.printf("\nProgresión Geométrica:[%s\b\b]", resultadoGeometrico);
    }

    static int validarEntero(String mensaje, String mensajeError, String patron) {
        Pattern patronOpcionDecimal = Pattern.compile(patron);
        while (true) {
            System.out.print(mensaje);
            String valorEntero = entrada.next();
            if (patronOpcionDecimal.matcher(valorEntero).matches())
                return Integer.parseInt(valorEntero);
            else
                entrada.nextLine();
            System.err.println(mensajeError);
        }
    }

    static double validarDecimal(String mensaje, String mensajeError, String patron) {
        Pattern patronOpcionDecimal = Pattern.compile(patron);
        while (true) {
            System.out.print(mensaje);
            String valorEntero = entrada.next();
            if (patronOpcionDecimal.matcher(valorEntero).matches())
                return Double.parseDouble(valorEntero);
            else
                entrada.nextLine();
            System.err.println(mensajeError);
        }
    }

    static String formatearNumero(double valor) {
        return (valor % 1 == 0) ? "%.0f".formatted(valor) : "%.2f".formatted(valor);
    }
}
