package com.denisyeyson.sem03.sesion2;

import com.denisyeyson.sem03.sesion2.model.CalculoRaizPotencia;

import java.util.Scanner;

public class TA04_02_CalculoRaizPotencia {

    /**
     * Ejercicio 04.2:
     * <p>
     * Ingresar un número entero.
     * Sí es positivo, calcular su raíz cuadrada.
     * Si además es par, calcular su potencia al cubo.
     * En caso contrario, mostrar su valor absoluto.
     * Estructura:
     * Condicional simple anidada en una condicional doble.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        CalculoRaizPotencia calculo = new CalculoRaizPotencia();

        System.out.println("CÁLCULO DE RAÍZ Y POTENCIA:");

        System.out.print("Ingrese un número entero → ");
        calculo.setNumero(teclado.nextInt());

        System.out.println("\n" + calculo.mostrarMensaje());

        teclado.close();
    }
}