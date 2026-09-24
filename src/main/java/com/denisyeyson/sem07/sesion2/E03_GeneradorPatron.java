package com.denisyeyson.sem07.sesion2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03_GeneradorPatron {
    static void main() {
        Scanner lector = new Scanner(System.in);
        String expresion;
        Matcher matcher;

        Pattern patron = Pattern.compile("^([A-Za-z])([A-Za-z])=([1-9][0-9]*)$");

        do {
            System.out.print("Ingrese una expresión con formato ab=N: ");
            expresion = lector.nextLine();

            matcher = patron.matcher(expresion);

            if (!matcher.matches()) {
                System.out.println("Expresión inválida.");
                System.out.println("Ejemplos válidos: xy=4, wi=5");
            }

        } while (!matcher.matches());

        char a = matcher.group(1).charAt(0);
        char b = matcher.group(2).charAt(0);
        int numeroFilas = Integer.parseInt(matcher.group(3));

        System.out.println("\nExpresión válida.");
        System.out.println("Carácter a: " + a);
        System.out.println("Carácter b: " + b);
        System.out.println("Número de filas: " + numeroFilas);

        System.out.println("\nResultado:");

        int fila = 1;

        while (fila <= numeroFilas) {

            int columna = 1;

            while (columna <= fila) {

                if ((fila + columna) % 2 == 0) {
                    System.out.print(a);
                } else {
                    System.out.print(b);
                }
                columna++;
            }

            System.out.println();
            fila++;
        }
        lector.close();
    }
}
