package com.denisyeyson.sem04.sesion2;

import java.util.Scanner;

public class A02_SwitchMejorado {

    /**
     * Actividad 02:
     * Escribir un programa en Java que haga uso de switch mejorado y utilice agrupamiento de opciones.
     * La variable por evaluar debe ser de tipo char.
     * Ingresa un carácter y detectar si es de tipo numérico, si es una vocal, consonante o numeral.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        char caracter;
        String categoria;

        System.out.println("""
                +----------------------------+
                |   DETECTOR DE CARACTERES   |
                +----------------------------+
                """);
        System.out.print("Ingrese un carácter: ");
        caracter = entrada.next().toUpperCase().charAt(0);

        categoria = switch (caracter) {
            case 'A', 'E', 'I', 'O', 'U' -> "vocal";
            case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X',
                 'Y', 'Z' -> "consonante";
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> "numérico";
            default -> "desconocido\nComunicarse con soporte para que actualize la Base de Datos ;)";
        };

        System.out.printf("""
                Carácter\t: %s
                Valor ASCII\t: %d
                Categoria\t: %s
                """, caracter, (int) caracter, categoria);

        entrada.close();
    }
}
