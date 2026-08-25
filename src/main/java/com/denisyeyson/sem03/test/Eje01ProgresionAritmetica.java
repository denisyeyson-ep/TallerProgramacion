package com.denisyeyson.sem03.test;

import com.denisyeyson.sem03.ProgresionAritmetica;

import java.util.Scanner;

public class Eje01ProgresionAritmetica {

    /**
     * Ejercicio 01:
     * Se requiere saber si 3 números enteros ingresados se encuentran o no
     * en progresión aritmética. Las variables leídas son: n1, n2 y n3.
     */

    static void main() {
        Scanner teclado = new Scanner(System.in);
        ProgresionAritmetica progresionAritmetica = new ProgresionAritmetica();

        System.out.println("PROGRESIÓN ARITMÉTICA:");

        System.out.print("Ingrese el primer número: ");
        progresionAritmetica.setNumero_1(teclado.nextInt());

        System.out.print("Ingrese el segundo número: ");
        progresionAritmetica.setNumero_2(teclado.nextInt());

        System.out.print("Ingrese el tercer número: ");
        progresionAritmetica.setNumero_3(teclado.nextInt());

        System.out.println("\n" + progresionAritmetica.mostrarResultado());

        teclado.close();
    }
}
