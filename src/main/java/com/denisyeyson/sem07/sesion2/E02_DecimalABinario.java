package com.denisyeyson.sem07.sesion2;

import java.util.Scanner;

public class E02_DecimalABinario {
    static void main() {
        try (Scanner lector = new Scanner(System.in)) {
            System.out.print("Ingrese un número entero no negativo: ");

            if (!lector.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                return;
            }

            int numero = lector.nextInt();

            if (numero < 0) {
                System.out.println("Error: Por favor ingrese un número mayor o igual a cero.");
                return;
            }

            String binario = convertirABinario(numero);

            System.out.println("Número decimal: " + numero);
            System.out.println("Número binario: " + binario);
        }
    }

    static String convertirABinario(int numero) {
        if (numero == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        int cociente = numero;

        while (cociente > 0) {
            int residuo = cociente % 2;
            sb.append(residuo);
            cociente /= 2;
        }

        return sb.reverse().toString();
    }
}
