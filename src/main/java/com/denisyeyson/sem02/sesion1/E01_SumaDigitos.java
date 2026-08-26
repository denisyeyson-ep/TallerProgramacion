package com.denisyeyson.sem02.sesion1;

import java.util.Scanner;

public class E01_SumaDigitos {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        SumaDigitos suma = new SumaDigitos();

        System.out.println("SUMA DE DÍGITOS:");

        System.out.print("Ingrese el numero -> ");
        suma.setNumero(teclado.nextInt());

        suma.mostrarMensaje();

        teclado.close();
    }
}
