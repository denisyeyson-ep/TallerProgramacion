package com.denisyeyson.sem06.sesion2;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.UNICODE_CASE;

public class E01_ValidarRespuesta {

    /**
     * Ejercicio 1:<br>
     * Escribir un programa en Java que solicite al usuario un número entre 1 y 100.<br>
     * Si el número ingresado está fuera de este rango, el programa debe mostrar un mensaje de error y solicitar nuevamente el número.<br>
     * Una vez que el usuario ingrese un número válido, el programa debe preguntar si desea continuar ingresando números.<br>
     * Si la respuesta es "Sí", el programa debe repetir el proceso; si la respuesta es "No", el programa debe finalizar.<br>
     * Validar las diferentes respuestas con una expresión regular (No, no, NO, si, Si, sí, SÍ, Sí) dentro de un bucle while.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(si|sí|no)$", CASE_INSENSITIVE | UNICODE_CASE);
        String respuesta = "si";

        while (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí")) {
            System.out.print("Ingrese un número entre 1 al 100: ");
            int numero = entrada.nextInt();

            while (numero < 1 || numero > 100) {
                System.out.print("""
                        Número fuera del rango.
                        Ingrese nuevamente un número entre 1 y 100:\s""");
                numero = entrada.nextInt();
            }
            entrada.nextLine();

            System.out.printf("""
                    Número válido: %d
                    ¿Desea continuar? (Sí/No):\s""", numero);
            respuesta = entrada.nextLine();

            while (!pattern.matcher(respuesta).matches()) {
                System.out.print("""
                        Respuesta no válida.
                        Ingrese Sí o No:\s""");
                respuesta = entrada.nextLine();
            }
        }
        System.out.println("Programa finalizado.");
        entrada.close();
    }
}
