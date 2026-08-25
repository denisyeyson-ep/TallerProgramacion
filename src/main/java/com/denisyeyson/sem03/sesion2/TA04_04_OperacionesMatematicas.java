package com.denisyeyson.sem03.sesion2;

import com.denisyeyson.sem03.sesion2.model.OperacionesMatematicas;

import java.util.Scanner;

public class TA04_04_OperacionesMatematicas {

    /**
     * Ejercicio 04.4:
     * <p>
     * Ingresar dos números enteros y determinar la operación
     * matemática según ambos sean positivos o no.
     * <p>
     * Métodos utilizados:
     * Math.pow(), Math.sqrt() y Math.abs().
     * <p>
     * Estructura:
     * Condicional doble anidada en una condicional doble.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        OperacionesMatematicas operacion = new OperacionesMatematicas();

        System.out.println("OPERACIONES MATEMÁTICAS:");

        System.out.print("Ingrese el primer número → ");
        operacion.setPrimerNumero(teclado.nextInt());

        System.out.print("Ingrese el segundo número → ");
        operacion.setSegundoNumero(teclado.nextInt());

        System.out.println("\n" + operacion.mostrarMensaje());

        teclado.close();
    }
}