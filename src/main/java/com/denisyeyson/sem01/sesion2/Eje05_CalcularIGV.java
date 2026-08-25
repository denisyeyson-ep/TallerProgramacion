package com.denisyeyson.sem01.sesion2;

import com.denisyeyson.sem01.sesion2.model.CalcularIGV;

import java.util.Scanner;

public class Eje05_CalcularIGV {

    /**
     * Ejercicio 05:
     * Escribir un programa que, dado un monto total,
     * lo descomponga en monto a pagar e IGV (18%).
     */

    static void main() {

        Scanner teclado = new Scanner(System.in);
        CalcularIGV calcularIGV = new CalcularIGV();

        System.out.println("CALCULAR  IGV:");

        System.out.println("Ingrese el monto total del producto ->");
        calcularIGV.setMontoTotal(teclado.nextDouble());

        System.out.println("\n" + calcularIGV.mostrarMensaje());

        teclado.close();

    }
}
