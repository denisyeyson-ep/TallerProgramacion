package com.denisyeyson.sem01.sesion2;

import com.denisyeyson.sem01.sesion2.model.CentigradosFahrenheit;

import java.util.Scanner;

public class E01_CentigradosFahrenheit {

    /**
     * Ejercicio 01:
     * Escribir un programa que convierta grados
     * Centígrados en grados Fahrenheit.
     * Fórmula: F = (C * 9/5) + 32
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        CentigradosFahrenheit centigradosFahrenheit = new CentigradosFahrenheit();

        System.out.println("CONVERTIR GRADOS CENTÍGRADOS A FAHRENHEIT:");

        System.out.print("Ingrese el valor en centígrados -> ");
        centigradosFahrenheit.setCentigrados(teclado.nextDouble());

        System.out.println("\n" + centigradosFahrenheit.mostrarMensaje());

        teclado.close();
    }
}
