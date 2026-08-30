package com.denisyeyson.sem04.sesion2;

import java.util.Scanner;

public class E03_01_AlumnoNotaV1 {

    /**
     * Ejercicio 03.01:
     * Escribir un programa que le permita a un docente ingresar la nota de un alumno y le devuelva el mensaje,
     * aplicando solamente operador ternario
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int notaAlumno;
        String mencion;

        System.out.print("Ingrese nota del alumno entre 0 y 20: ");
        notaAlumno = entrada.nextInt();

        if (notaAlumno >= 0 && notaAlumno <= 20) {
            mencion = (notaAlumno > 18) ? "Excelente" : (notaAlumno > 15)?"Bueno":(notaAlumno >= 13 ?"Regular":"Deficiente");
            System.out.println(mencion);
        }else{
            System.out.println("Nota no valida");
        }
    }
}
