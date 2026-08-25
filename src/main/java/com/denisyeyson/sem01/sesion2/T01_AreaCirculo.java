package com.denisyeyson.sem01.sesion2;

import com.denisyeyson.sem01.sesion2.model.AreaCirculo;

import java.util.Scanner;

public class T01_AreaCirculo {

    /**
     * Tarea 01:
     * Para practicar en casa
     * Escribir un programa que calcule el área de una figura geométrica cualquiera.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        AreaCirculo areaCirculo = new AreaCirculo();

        System.out.println("ÁREA DE UN CÍRCULO A=π.r²");
        System.out.print("Ingrese el radio del círculo en cm. -> ");
        areaCirculo.setRadio(teclado.nextDouble());

        System.out.println("\n" + areaCirculo.mostrarMensaje());

        teclado.close();
    }
}
