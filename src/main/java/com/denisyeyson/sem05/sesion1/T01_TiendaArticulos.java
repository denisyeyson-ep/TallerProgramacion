package com.denisyeyson.sem05.sesion1;

import java.util.Scanner;

public class T01_TiendaArticulos {

    /**
     * <b>Problema 01:</b><br>
     * Una tienda de artículos tecnológicos aplica un descuento a sus clientes de acuerdo con el monto total de su compra.<br>
     * Desarrolle un programa en Java que solicite al usuario el monto de la compra utilizando la clase Scanner y determine el descuento que le corresponde según las siguientes condiciones:
     * <ul>
     *     <li>Si el monto se encuentra entre S/ 0.00 y S/ 200.00, no recibe descuento.</li>
     *     <li>Si el monto es mayor a S/ 200.00 y menor o igual a S/ 500.00, recibe un descuento del 5%.</li>
     *     <li>Si el monto es mayor a S/ 500.00 y menor o igual a S/ 1000.00, recibe un descuento del 10%.</li>
     *     <li>Si el monto es mayor a S/ 1000.00, recibe un descuento del 15%.</li>
     * </ul>
     *
     * Si el usuario ingresa un monto negativo, el programa deberá mostrar el mensaje <b><i>"MONTO NO VÁLIDO"</i></b> y no deberá realizar ningún cálculo.<br>
     * Se debe mostrar el monto de la compra, porcentaje de descuento aplicado, monto descontado y total a pagar.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto total de la compra: ");
        if (!entrada.hasNextDouble()) {
            System.err.println("Ingresar solo números, no se aceptan caracteres");
            return;
        }
        double montoTotal = entrada.nextDouble();

        if (montoTotal <= 0) {
            System.err.println("MONTO NO VALÍDO");
            return;
        }

        int porcentajeDescuento = switch (Double.valueOf(montoTotal)) {
            case Double monto when monto >= 0 && monto <= 200 -> 0;
            case Double monto when monto > 200 && monto <= 500 -> 5;
            case Double monto when monto > 500 && monto <= 1000 -> 10;
            default -> 15;
        };

        double descuento = montoTotal * porcentajeDescuento / 100;
        double totalAPagar = montoTotal - descuento;

        System.out.printf("""
                Monto de la compra          :%.2f
                Porcentaje de descuento     :%d%%
                Monto descontado            :%.2f
                Total a pagar               :%.2f
                %n""", montoTotal, porcentajeDescuento, descuento, totalAPagar);

        entrada.close();
    }
}
