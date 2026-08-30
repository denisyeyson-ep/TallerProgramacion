package com.denisyeyson.sem04.sesion2;

import java.util.Scanner;

public class E03_02_AlumnoNotaV2 {

    /**
     * Ejercicio 03.02:
     * Escribir un programa que le permita a un docente ingresar la nota de un alumno y le devuelva el mensaje,
     * aplicando pattern matching con switch
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int notaAlumno;
        String mencion;

        System.out.print("Ingrese nota del alumno: ");
        notaAlumno = entrada.nextInt();

        mencion = switch (Integer.valueOf(notaAlumno)) {
            case Integer i when (i > 18 && i <= 20) -> "excelente";
            case Integer i when (i > 15 && i <= 18) -> "bueno";
            case Integer i when (i >= 13 && i <= 15) -> "regular";
            case Integer i when (i < 13 && i >= 0) -> "deficiente";
            default -> "Nota no valida";
        };

        System.out.println(mencion.toUpperCase());
        entrada.close();
    }
}
