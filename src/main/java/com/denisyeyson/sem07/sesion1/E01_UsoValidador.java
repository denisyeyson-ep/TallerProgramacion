package com.denisyeyson.sem07.sesion1;

import java.util.Scanner;

public class E01_UsoValidador {
    static void main() {

        Scanner entrada = new Scanner(System.in);
        byte numero;

        do {
            System.out.print("Ingrese un número entre 1 y 10: ");
            numero = entrada.nextByte();
            entrada.nextLine();
        } while (numero < 1 || numero > 10);

        System.out.println("El número ingresado es: " + numero);

        entrada.close();
    }
}
