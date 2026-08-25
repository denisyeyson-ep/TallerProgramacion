package com.denisyeyson.sem03.sesion2;

import com.denisyeyson.sem03.sesion2.model.NumeroPositivoPar;

import java.util.Scanner;

public class TA04_01_NumeroPositivoPar {

    /**
     * Ejercicio 04.1:
     * Validar si el número es positivo y par
     * Estructura:
     * Utilizar una condicional simple anidada
     * dentro de otra condicional simple.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        NumeroPositivoPar evaluacion = new NumeroPositivoPar();

        System.out.println("NÚMERO POSITIVO Y PAR:");

        System.out.print("Ingrese un número entero → ");
        evaluacion.setNumero(teclado.nextInt());

        System.out.println("\n" + evaluacion.mostrarMensaje());

        teclado.close();
    }
}