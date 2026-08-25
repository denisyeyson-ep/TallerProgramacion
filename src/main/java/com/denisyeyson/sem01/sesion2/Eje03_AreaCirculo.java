package com.denisyeyson.sem01.sesion2;

import com.denisyeyson.sem01.sesion2.model.AreaCirculo;

import java.util.Scanner;

public class Eje03_AreaCirculo {

    /**
     * Ejercicio 03:
     * Escribir un programa que calcule el área de una figura geométrica cualquiera.
     */

    static void main() {

        Scanner teclado = new Scanner(System.in);
        AreaCirculo areaCirculo = new AreaCirculo();

        System.out.println("ÁREA DE UN CÍRCULO A=π.r²");
        System.out.println("Ingrese el radio del círculo en cm. -> ");
        areaCirculo.setRadio(teclado.nextDouble());

        System.out.println(areaCirculo.mostrarMensaje());

        teclado.close();

    }
}
