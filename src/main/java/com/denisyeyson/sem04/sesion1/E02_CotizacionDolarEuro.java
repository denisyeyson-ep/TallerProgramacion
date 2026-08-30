package com.denisyeyson.sem04.sesion1;

import java.util.Scanner;

public class E02_CotizacionDolarEuro {

    /**
     * Ejercicio 02:
     * Hoy la cotización del dólar y del euro son el siguiente:
     * 1 dólar = 3.82 soles
     * 1 euro = 4.17 soles
     * Escribe un programa para convertir entre dólares, euros y soles.
     * El usuario elegirá las monedas de origen y destino e ingresará el monto a convertir.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        char monedaOrigen, monedaDestino;
        double montoIngresado, montoConvertido;

        System.out.println("CONVERSION DE MONEDAS:");

        System.out.println("""
                Ingrese la moneda de origen:
                - (D)Dólar
                - (E)Euro
                - (S)Soles
                """);
        monedaOrigen = entrada.next().toUpperCase().charAt(0);
        entrada.nextLine();

        System.out.println("""
                Ingrese la moneda de destino:
                - (D)Dólar
                - (E)Euro
                - (S)Soles
                """);
        monedaDestino = entrada.next().toUpperCase().charAt(0);
        entrada.nextLine();

        System.out.println("Ingrese el monto a convertir:");
        montoIngresado = entrada.nextDouble();
        entrada.nextLine();

        montoConvertido = switch (String.valueOf(monedaOrigen + monedaDestino)) {
            case "DS" -> montoIngresado * 3.82;//Conversion de Dólar a Soles
            case "DE" -> montoIngresado * 4.17;//Conversion de Dólar a Euro
            case "SD" -> montoIngresado / 3.82;//Conversion de Soles a Dólar
            case "SE" -> montoIngresado / 4.17;//Conversion de Soles a Euro
            case "ES" -> montoIngresado * 0.86;//Conversion de Euro a Soles
            case "ED" -> montoIngresado * 1.14;//Conversion de Euro a Dólar
            default -> 0.00;
        };

        System.out.printf("El monto de %s es de %s soles.Modena%s", montoIngresado, montoConvertido,getMoneda(monedaDestino));

    }

    public static String getMoneda(char moneda) {
        return switch (moneda) {
            case 'D' -> "Dólares";
            case 'E' -> "Euros";
            case 'S' -> "Soles";
            default -> "";
        };
    }
}
