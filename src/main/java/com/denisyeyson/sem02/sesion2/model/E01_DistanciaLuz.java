package com.denisyeyson.sem02.sesion2.model;

import com.denisyeyson.sem02.sesion2.DistanciaLuz;

import java.util.Scanner;

public class E01_DistanciaLuz {

    /**
     * Ejercicio 01:
     * Escribe un programa que calcule la distancia que recorre la luz en N días,
     * sabiendo que en un segundo la luz viaja a 299792458 m/s.
     * Leer el número de días utilizando la clase Scanner.
     * Crear una constante para almacenar la velocidad de la luz.
     * Muestra el resultado utilizando salida con formato.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        DistanciaLuz distanciaLuz = new DistanciaLuz();

        System.out.println("DISTANCIA EN LUGAR DE LA LUZ:");

        System.out.print("Ingrese el número de días -> ");
        distanciaLuz.setDias(teclado.nextInt());

        System.out.printf("%nLa luz recorre en %d día(s): %,d metros.%n", distanciaLuz.getDias(), distanciaLuz.calcularDistancia());

        teclado.close();
    }
}
