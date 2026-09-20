package com.denisyeyson.sem06.sesion2;

import java.util.Scanner;

public class A02_SerieFibonacci {

    /**
     * Actividad 2:<br>
     * Escribir un programa en Java que genere la serie de Fibonacci hasta un número "n" ingresado por el usuario.<br>
     * La serie de Fibonacci comienza con los números 0 y 1, y cada número siguiente es la suma de los dos anteriores.<br>
     * El programa debe mostrar la serie completa hasta el número n.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int a = 0, b = 1, c, contador = 0;

        System.out.print("""
                Serie de Fibonacci:
                Ingrese la cantidad de números a mostrar
                de la serie de Fibonacci:\s""");
        int cantidad = entrada.nextInt();
        while (contador < cantidad) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            contador++;
        }
        entrada.close();
    }
}
