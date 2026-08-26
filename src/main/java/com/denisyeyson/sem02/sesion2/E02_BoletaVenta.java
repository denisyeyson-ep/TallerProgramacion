package com.denisyeyson.sem02.sesion2;

import com.denisyeyson.sem02.sesion2.model.BoletaVenta;

import java.util.Scanner;

public class E02_BoletaVenta {

    /**
     * Ejercicio 02:
     * Escribe un programa que genere una boleta de venta como la mostrada (salida con formato).
     * Debes solicitar: nombre de cliente, nombre del producto, precio y cantidad comprada.
     * Si el cliente se llama ANA o JUAN (String.equals), descontar el 5%.
     * Si el nombre del producto contiene la palabra GAMER (String.contains), descontar adicionalmente el 2%.
     * Ingresar los datos de dos productos distintos.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        BoletaVenta boleta = new BoletaVenta();

        System.out.println("BOLETA DE VENTA:");

        System.out.print("Ingrese nombre del cliente -> ");
        boleta.setNombreCliente(teclado.nextLine().toUpperCase());

        System.out.print("Ingrese nombre del producto 1 -> ");
        boleta.setNombreProducto1(teclado.nextLine().toUpperCase());
        System.out.print("Ingrese precio del producto 1 -> ");
        boleta.setPrecioProducto1(teclado.nextDouble());
        System.out.print("Ingrese cantidad del producto 1 -> ");
        boleta.setCantidadProducto1(teclado.nextInt());
        teclado.nextLine(); // Limpia el salto de línea pendiente.

        System.out.print("Ingrese nombre del producto 2 -> ");
        boleta.setNombreProducto2(teclado.nextLine().toUpperCase());
        System.out.print("Ingrese precio del producto 2 -> ");
        boleta.setPrecioProducto2(teclado.nextDouble());
        System.out.print("Ingrese cantidad del producto 2 -> ");
        boleta.setCantidadProducto2(teclado.nextInt());
        teclado.nextLine(); // Limpia el salto de línea pendiente.

        boleta.procesarCompra();
        boleta.imprimirBoleta();

        teclado.close();
    }
}
