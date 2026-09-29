package com.denisyeyson.sem08.sesion2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class E02_SerieFibonacci {

    static Scanner entrada = new Scanner(System.in);

    static void main() {
        int cantidad = validarEntero("Ingrese la cantidad de números de la serie de Fibonacci a mostrar: ", "\nError: Ingrese un número entero válido.\n", "[1-9]\\d*");
        StringBuilder serieFibonacci = new StringBuilder();
        int j = 0, k = 1;
        for (int i = 0; i < cantidad; i++) {
            serieFibonacci.append(k).append(", ");
            int h = k;
            k = j + k;
            j = h;
        }
        System.out.printf("Serie Fibonacci: [%s\b\b]",serieFibonacci);
        entrada.close();
    }

    static int validarEntero(String mensaje, String mensajeError, String patron) {
        Pattern patronValidacion = Pattern.compile(patron);
        while (true) {
            System.out.print(mensaje);
            String valorEntero = entrada.nextLine();
            if (patronValidacion.matcher(valorEntero).matches())
                return Integer.parseInt(valorEntero);
            System.out.println(mensajeError);
        }
    }
}
