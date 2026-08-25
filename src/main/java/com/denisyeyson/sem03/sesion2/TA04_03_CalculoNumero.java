package com.denisyeyson.sem03.sesion2;

import com.denisyeyson.sem03.sesion2.model.CalculoNumero;

import java.util.Scanner;

public class TA04_03_CalculoNumero {

    /**
     * Ejercicio 04.3:
     * Si el número es positivo y par calcula su mitad,
     * por otro lado, si es positivo e impar, se calcula su triple.
     * Estructura:
     * Utilizar una condicional doble anidada
     * dentro de una condicional simple.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        CalculoNumero calculo = new CalculoNumero();

        System.out.println("OPERACIÓN SEGÚN PARIDAD:");

        System.out.print("Ingrese un número entero → ");
        calculo.setNumero(teclado.nextInt());

        System.out.println("\n" + calculo.mostrarMensaje());

        teclado.close();
    }
}