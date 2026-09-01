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
        final double VALOR_DOLAR=3.82;
        final double VALOR_EURO=4.17;

        System.out.println("CONVERSION DE MONEDAS:");

        System.out.print("""
                Ingrese la moneda de origen:
                - (D)Dólar
                - (E)Euro
                - (S)Soles
                ->\s""");
        monedaOrigen = entrada.next().toUpperCase().charAt(0);
        entrada.nextLine();

        System.out.print("""
                Ingrese la moneda de destino:
                - (D)Dólar
                - (E)Euro
                - (S)Soles
                ->\s""");
        monedaDestino = entrada.next().toUpperCase().charAt(0);
        entrada.nextLine();

        System.out.print("Ingrese el monto a convertir: ");
        montoIngresado = entrada.nextFloat();
        entrada.nextLine();

        //Concatena las dos monedas y evalúa la conversion
        montoConvertido = switch (monedaOrigen + String.valueOf(monedaDestino)) {
            case "DS" -> montoIngresado * VALOR_DOLAR;//Conversion de Dólar a Soles
            case "ES" -> montoIngresado * VALOR_EURO;//Conversion de Euro a Soles
            case "SD" -> montoIngresado / VALOR_DOLAR;//Conversion de Soles a Dólar
            case "SE" -> montoIngresado / VALOR_EURO;//Conversion de Soles a Euro
            case "DE" -> (montoIngresado * VALOR_DOLAR) / VALOR_EURO;//Conversion de Dólar a Euro
            case "ED" -> (montoIngresado * VALOR_EURO) / VALOR_DOLAR;//Conversion de Euro a Dólar
            default -> 0.00;
        };

        System.out.printf("\nMonto de ingreso ->\t: %s\nMonto convertido ->\t: %s\n", getMoneda(monedaOrigen, montoIngresado), getMoneda(monedaDestino, montoConvertido));

        entrada.close();
    }

    //Obtiene la descripción de la moneda y su símbolo con el monto redondeado
    public static String getMoneda(char moneda, double monto) {
        monto = (double) Math.round(monto * 100) / 100;
        return switch (moneda) {
            case 'D' -> "Dólares($/." + monto + ")";
            case 'E' -> "Euros(Є/." + monto + ")";
            case 'S' -> "Soles(S/." + monto + ")";
            default -> "";
        };
    }
}
