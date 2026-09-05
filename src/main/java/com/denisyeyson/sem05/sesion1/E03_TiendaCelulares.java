package com.denisyeyson.sem05.sesion1;

import java.util.Scanner;

public class E03_TiendaCelulares {

    /**
     * Ejercicio 3
     * Una tienda de celulares ofrece distintos planes tarifarios en función de la marca que se compre,
     * así como descuentos aplicados de acuerdo con el plazo de pago promocional escogido (ver tablas).
     * Escribe un programa en Java que solicite al usuario la marca del celular y el plazo de pago,
     * y muestre el monto del plan, el descuento que le corresponda y el monto final a pagar.
     * Mostrar un mensaje de error si alguna opción ingresada es incorrecta.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        String marca = "";
        double montoPlan = 0;
        int cantMeses = 0;
        double porcentajeDescuento = 0;


        IO.print("""
                +-----------------------+-------------------+
                | Marca Celular         | Plan (S/)         |
                +-----------------------+-------------------+
                | 1. Motorola           |             29.90 |
                | 2. LG                 |             36.00 |
                | 3. Samsung            |             46.80 |
                | 4. Huawei             |             62.00 |
                | 5. iPhone             |             71.00 |
                +-----------------------+-------------------+
                
                Ingrese la opción de la marca de celular:\s""");

        if (!(entrada.hasNextByte())) {
            System.err.println("ERROR: Ingresar solo números enteros que se encuentre en el menú de opciones.");
            return;
        }
        byte opcionMarca = entrada.nextByte();

        if (opcionMarca < 1 || opcionMarca > 5) {
            System.err.println("ERROR: Ingresar solo las opciones del menú.");
            return;
        }

        IO.print("""
                +-----------------------------------------+
                |       PLAZOS DE PAGO CON PROMOCIÓN      |
                +--------------+--------------+-----------+
                |   Opción 1   |  A  6 meses  |   13.2%   |
                +---------------+---------------+---------+
                |   Opción 2   |  A 12 meses  |   12.0%   |
                +---------------+---------------+---------+
                |   Opción 3   |  A 18 meses  |   11.2%   |
                +---------------+---------------+---------+
                
                Ingrese la opción de plazo de pago:\s""");
        if (!(entrada.hasNextByte())) {
            System.err.println("ERROR: Ingresar solo números enteros que se encuentre en el menú de opciones.");
            return;
        }
        byte opcionPlazo = entrada.nextByte();

        if (opcionPlazo < 1 || opcionPlazo > 3) {
            System.err.println("ERROR: Ingresar solo las opciones del menú.");
            return;
        }

        switch (opcionPlazo) {
            case 1 -> {
                cantMeses = 6;
                porcentajeDescuento = 13.2;
            }
            case 2 -> {
                cantMeses = 12;
                porcentajeDescuento = 12;
            }
            case 3 -> {
                cantMeses = 18;
                porcentajeDescuento = 11.2;
            }
        }

        switch (opcionMarca) {
            case 1 -> {
                marca = "MOTOROLA";
                montoPlan = 29.90;
            }
            case 2 -> {
                marca = "LG";
                montoPlan = 36;
            }
            case 3 -> {
                marca = "SAMSUNG";
                montoPlan = 46.80;
            }
            case 4 -> {
                marca = "HUAWEI";
                montoPlan = 62;
            }
            case 5 -> {
                marca = "IPHONE";
                montoPlan = 71;
            }
        }

        // Cálculos
        double montoDescuento = montoPlan * (porcentajeDescuento / 100.0);
        double montoFinal = montoPlan - montoDescuento;

        // Mostrar reporte final
        IO.println("""
                Marca seleccionada    : %s
                Plazo de pago         : %d meses
                Monto del plan        : S/ %.2f
                Descuento (%.1f%%)     : S/ %.2f
                Monto final a pagar   : S/ %.2f
                """.formatted(marca, cantMeses, montoPlan, porcentajeDescuento, montoDescuento, montoFinal));

        entrada.close();
    }
}
