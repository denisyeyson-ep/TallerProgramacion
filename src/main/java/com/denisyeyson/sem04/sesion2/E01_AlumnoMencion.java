package com.denisyeyson.sem04.sesion2;

import java.util.Scanner;

public class E01_AlumnoMencion {

    /**
     * Ejercicio 01:
     * Escribir un programa que le permita a un docente ingresar la nota de un alumno y le devuelva el mensaje
     * “Usted obtuvo la mención de #mencion#”, reemplazando la expresión #mencion# por
     * el valor correspondiente (String.replace), según el cuadro mostrado:
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int notaAlumno;
        String mencion;

        System.out.print("Ingrese nota del alumno: ");
        notaAlumno = entrada.nextInt();

        mencion = switch(Integer.valueOf(notaAlumno)){
          case Integer i when (i>18 && i<=20) -> "Excelente";
          case Integer i when (i>15 && i<=18) -> "Bueno";
          case Integer i when (i>=13 && i<=15) -> "Regular";
          case Integer i when (i<13 && i>=0) -> "Deficiente";
          default -> "Opción no valida";
        };

        System.out.println("Usted obtuvo la mención de \"#mencion#\"".replace("#mencion#", mencion));
        entrada.close();
    }
}
