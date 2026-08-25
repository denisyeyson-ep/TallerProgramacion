package com.denisyeyson.sem01.sesion2;

import com.denisyeyson.sem01.sesion2.model.DolaresSoles;

import java.util.Scanner;

public class E02_DolaresSoles {

    /**
     * Ejercicio 02:
     * Implementar un programa en Java que permita convertir
     * dólares a soles (tipo de cambio: 3.72)
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        DolaresSoles dolaresSoles = new DolaresSoles();

        System.out.println("CONVERTIR DÓLARES A SOLES:");

        System.out.print("Ingresar el monto en dólares($) -> ");
        dolaresSoles.setDolares(teclado.nextDouble());

        System.out.println("\n" + dolaresSoles.mostrarMensaje());

        teclado.close();
    }
}
