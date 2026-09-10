package com.denisyeyson.sem05.sesion2;

import java.util.Scanner;

public class PC_Ejercicio02 {

    /**
     * <b><i>Practica 01: Ejercicio 02</i></b><br>
     * Una empresa de atención al cliente otorga mensualmente un bono económico a sus trabajadores de
     * acuerdo con el puntaje de desempeño obtenido. Desarrolle un programa en Java que solicite al
     * usuario el puntaje del trabajador utilizando la clase Scanner y determine el bono que le corresponde
     * según las siguientes condiciones:
     * <ul>
     *     <li>Si el puntaje se encuentra entre 0 y 50, el trabajador no recibe bono.</li>
     *     <li>Si el puntaje es mayor a 50 y menor o igual a 70, recibe un bono de S/ 80.00.</li>
     *     <li>Si el puntaje es mayor a 70 y menor o igual a 90, recibe un bono de S/ 150.00.</li>
     *     <li>Si el puntaje es mayor a 90 y menor o igual a 100, recibe un bono de S/ 250.00.</li>
     *     <li>Si el puntaje es menor que 0 o mayor que 100, mostrar: “PUNTAJE NO VÁLIDO” y no deberá calcular ningún bono.</li>
     * </ul>
     * Se deberá mostrar el puntaje ingresado y el monto del bono correspondiente.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);

        IO.print("Ingrese el puntaje del trabajador: ");

        if (!entrada.hasNextInt()) {
            System.err.println("Error: Debe ingresar un número entero.");
            entrada.close();
            return;
        }
        int puntaje = entrada.nextInt();

        //Forma 1
        IO.println("Puntaje ingresado: " + puntaje);
        String mensaje=switch (Integer.valueOf(puntaje)) {
            case Integer p when (p >= 0 && p <= 50) -> "El trabajador no recibe bono.";
            case Integer p when (p > 50 && p <= 70) -> "El trabajador recibe un bono de S/ 80.00.";
            case Integer p when (p > 70 && p <= 90) -> "El trabajador recibe un bono de S/ 150.00.";
            case Integer p when (p > 90 && p <= 100) -> "El trabajador recibe un bono de S/ 250.00.";
            default -> "PUNTAJE NO VÁLIDO";
        };
        IO.println(mensaje);

//        //Forma 2
//        double bono = switch (Integer.valueOf(puntaje)) {
//            case Integer p when (p >= 0 && p <= 50) -> 0.0;
//            case Integer p when (p > 50 && p <= 70) -> 80.0;
//            case Integer p when (p > 70 && p <= 90) -> 150.0;
//            case Integer p when (p > 90 && p <= 100) -> 250.0;
//            default -> {
//                System.err.println("PUNTAJE NO VÁLIDO");
//                System.exit(0);
//                yield -1.0;
//            }
//        };
//
//        IO.println("""
//                Puntaje ingresado   : %d
//                Bono                : S/.%.2f
//                """.formatted(puntaje, bono));
        entrada.close();
    }
}
