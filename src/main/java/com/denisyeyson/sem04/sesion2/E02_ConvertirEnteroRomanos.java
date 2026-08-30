package com.denisyeyson.sem04.sesion2;

import java.util.Locale;
import java.util.Scanner;

public class E02_ConvertirEnteroRomanos {

    /**
     * Ejercicio 02:
     * Escribir un programa que lea un número entero entre 1 y 50 y lo escriba en números romanos.
     * Preguntar al usuario si desea mostrar el valor en mayúsculas o minúsculas (String.toUpperCase y String.toLowerCase)
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero entre 1 y 50: ");
        if (!entrada.hasNextInt()) {//Válida que ingrese solo números enteros
            System.err.println("Error: Debe ingresar un número entero válido.");
            return;
        }

        int numero = entrada.nextInt();

        if (numero < 1 || numero > 50) {//Valida que el numero este en el rango de 1 a 50
            System.err.println("Error: El número debe estar en el rango de 1 a 50.");
            return;
        }

        //Separa el número en decenas y unidades
        int decenas = (numero / 10) * 10;
        int unidades = numero % 10;

        String romanoDecenas = switch (decenas) {
            case 50 -> "L";
            case 40 -> "XL";
            case 30 -> "XXX";
            case 20 -> "XX";
            case 10 -> "X";
            default -> "";
        };

        String romanoUnidades = switch (unidades) {
            case 9 -> "IX";
            case 8 -> "VIII";
            case 7 -> "VII";
            case 6 -> "VI";
            case 5 -> "V";
            case 4 -> "IV";
            case 3 -> "III";
            case 2 -> "II";
            case 1 -> "I";
            default -> "";
        };

        System.out.print("¿Desea ver el resultado en: \n* (1)Mayúsculas\n* (2)Minúsculas?\n-> ");
        int respuesta = entrada.nextInt();

        if (respuesta==2) {
            romanoDecenas = romanoDecenas.toLowerCase();
            romanoUnidades = romanoUnidades.toLowerCase();
        }

        System.out.println("Número en romanos: " + romanoDecenas + romanoUnidades);
        entrada.close();
    }
}
