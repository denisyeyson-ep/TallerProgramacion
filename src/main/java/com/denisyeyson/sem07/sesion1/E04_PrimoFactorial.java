package com.denisyeyson.sem07.sesion1;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.UNICODE_CASE;

public class E04_PrimoFactorial {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(si|sí|no)$", CASE_INSENSITIVE | UNICODE_CASE);
        Pattern patronPrimo = Pattern.compile("^P+(\\d+)$", CASE_INSENSITIVE | UNICODE_CASE);
        Pattern patronFactorial = Pattern.compile("^(\\d+)!$", CASE_INSENSITIVE | UNICODE_CASE);

        String respuesta;
        boolean continuar;

        do {
            System.out.println("\nIngrese numero para calcular si es primo y su factorial: ");
            var valor = entrada.nextLine();

            if (patronPrimo.matcher(valor).matches()) {
                int numero = Integer.parseInt(valor.substring(1));
                validarPrimo(numero);
            } else if (patronFactorial.matcher(valor).matches()) {
                int numero = Integer.parseInt(valor.substring(0, valor.length() - 1));
                calcularFactorial(numero);
            } else {
                System.err.println("\nFormato no válido.\nIngrese un número primo con 'P' o un número para calcular su factorial con '!'.");
            }

            System.out.print("\n¿Desea continuar? (Sí/No): ");
            respuesta = entrada.nextLine();

            while (!pattern.matcher(respuesta).matches()) {
                System.out.print("""
                        Respuesta no válida.
                        Ingrese Sí o No:\s""");
                respuesta = entrada.nextLine();
            }

            continuar = respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí");

        } while (continuar);

        entrada.close();
    }

    static void validarPrimo(int numero) {
        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        System.out.println("El número " + numero + (esPrimo ? " es primo." : " no es primo."));
    }

    static void calcularFactorial(int numero) {
        long factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
