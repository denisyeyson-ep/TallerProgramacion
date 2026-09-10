package com.denisyeyson.sem05.sesion2;

import java.util.Scanner;

public class PC_Ejercicio01 {

    /**
     * <b><i>Practica 01: Ejercicio 01</i></b><br>
     * Una empresa farmacéutica necesita supervisar la temperatura de conservación de sus productos.<br>
     * Desarrolle un programa en Java que solicite al usuario una temperatura expresada en grados Celsius utilizando la clase Scanner y determine su clasificación de acuerdo con las siguientes condiciones:
     * <ul>
     *     <li>Si la temperatura es menor a 2 °C, mostrar: “Temperatura baja”.</li>
     *     <li>Si la temperatura se encuentra entre 2 °C y 8 °C, mostrar: “Temperatura adecuada”.</li>
     *     <li>Si la temperatura es mayor a 8 °C, mostrar: “Temperatura alta”.</li>
     * </ul>
     * El programa deberá evaluar la temperatura.<br>
     * Finalmente, deberá mostrar la temperatura ingresada y el mensaje correspondiente.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);

        IO.print("Ingrese la temperatura expresada en Celsius: ");
        if (!entrada.hasNextDouble()) {
            System.err.println("Error: Debe ingresar un número.");
            entrada.close();
            return;
        }
        double gradosCentigrados = entrada.nextDouble();

        //Forma 1
        IO.println("Temperatura ingresada: " + gradosCentigrados + " °C\n" + ((gradosCentigrados < 2) ? "Temperatura baja." : (gradosCentigrados >= 2 && gradosCentigrados <= 8) ? "Temperatura adecuada." : "Temperatura alta."));


//        //Forma 2
//        IO.println("Temperatura ingresada: %.2f °C".formatted(gradosCentigrados));
//        if (gradosCentigrados < 2) {
//            IO.println("Temperatura baja.");
//        } else if (gradosCentigrados >= 2 && gradosCentigrados <= 8) {
//            IO.println("Temperatura adecuada.");
//        } else {
//            IO.println("Temperatura alta.");
//        }


//        //Forma 3
//        String mensaje = switch (Double.valueOf(gradosCentigrados)) {
//            case Double c when (c < 2) -> "Temperatura baja.";
//            case Double c when (c >= 2 && c <= 8) -> "Temperatura adecuada.";
//            default -> "Temperatura alta.";
//        };
//
//        IO.print("""
//                Temperatura ingresada: %.2f °C
//                %s
//                """.formatted(gradosCentigrados, mensaje));


        entrada.close();
    }
}
