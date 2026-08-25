package com.denisyeyson.sem03.sesion1;

import com.denisyeyson.sem03.sesion1.model.CambioProducto;

import java.util.Scanner;

public class Eje03_CambioProducto {

    /**
     * Ejercicio 03:
     * Una tienda acepta cambio de productos en los siguientes casos: si el producto tiene
     * un precio entre 50 y 80 soles y fue comprado el día lunes (día 1) o si el producto
     * tiene un precio no por debajo de 120 soles y fue comprado cualquier día, excepto
     * miércoles o jueves (días 3 o 4, respectivamente). Evaluar si procede o no el cambio
     * del producto. Las variables leídas son precioProducto y numeroDia.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        CambioProducto cambioProducto = new CambioProducto();

        System.out.println("CAMBIO DE PRODUCTO:");

        System.out.print("Ingrese el precio del producto: S/ ");
        cambioProducto.setPrecioProducto(teclado.nextDouble());

        System.out.print("Ingrese el número del día (1-7): ");
        cambioProducto.setNumeroDia(teclado.nextInt());

        System.out.println("\n" + cambioProducto.mostrarMensaje());

        teclado.close();

    }
}
