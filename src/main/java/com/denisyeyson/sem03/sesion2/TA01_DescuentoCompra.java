package com.denisyeyson.sem03.sesion2;

import com.denisyeyson.sem03.sesion2.model.DescuentoCompra;

import java.util.Scanner;

public class TA01_DescuentoCompra {

    /**
     * Ejercicio 01:
     * Aplicar un descuento del 15 % si la compra es mayor o igual
     * a S/ 200. En caso contrario, aplicar un descuento del 5 %.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        DescuentoCompra compra = new DescuentoCompra();

        System.out.println("CÁLCULO DE DESCUENTO:");

        System.out.print("Ingrese el importe de compra → ");
        compra.setImporteCompra(teclado.nextDouble());

        System.out.println("\n" + compra.mostrarMensaje());

        teclado.close();
    }
}