package com.denisyeyson.sem06.sesion2;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.UNICODE_CASE;

public class E02_EvaluarPromedio {

    /**
     * Ejercicio 2:<br>
     * Escribir un programa en Java que solicite al usuario las calificaciones de los estudiantes de un curso.<br>
     * El programa termina cuando el usuario ya no desea ingresar más notas o cuando ingresa una nota igual a -1.<br>
     * Al terminar, deberá mostrar el promedio global, así como el número de estudiantes aprobados y desaprobados.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(si|sí|no)$", CASE_INSENSITIVE | UNICODE_CASE);
        final double NOTA_APROBATORIA = 12;
        int contNotas = 0, cantEstAprobados = 0, cantEstDesaprobados = 0;
        double sumNotas = 0, notaIndividual;
        String respuesta = "si";

        while (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("sí")) {

            System.out.printf("Ingrese la nota del estudiante N°%d (-1 para terminar): ", contNotas + 1);
            notaIndividual = entrada.nextDouble();

            if (notaIndividual == -1) {
                break;
            }

            if (notaIndividual >= 0 && notaIndividual <= 20) {
                sumNotas += notaIndividual;
                if (notaIndividual >= NOTA_APROBATORIA) {
                    cantEstAprobados++;
                } else {
                    cantEstDesaprobados++;
                }
                contNotas++;
                entrada.nextLine();

                System.out.print("¿Desea continuar ingresando notas? (Sí/No): ");
                respuesta = entrada.nextLine();
                while (!pattern.matcher(respuesta).matches()) {
                    System.out.print("""
                        Respuesta no válida.
                        Ingrese Sí o No:\s""");
                    respuesta = entrada.nextLine();
                }
            } else {
                System.out.println("Nota inválida.");
            }
        }

        if (contNotas > 0) {
            double promedio = sumNotas / contNotas;
            System.out.printf("""
                    \nResultados finales:
                    Promedio Global de estudiantes      : %.2f
                    Cantidad de estudiantes aprobados   : %d
                    Cantidad de estudiantes desaprobados: %d
                    """, promedio, cantEstAprobados, cantEstDesaprobados);
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}
