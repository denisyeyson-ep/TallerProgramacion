package com.denisyeyson.sem01.sesion2;

import com.denisyeyson.sem01.sesion2.model.FormulaGeneral;

import java.util.Scanner;

public class T02_FormulaGeneral {

    /**
     * Tarea 02:
     * Para practicar en casa
     * Escribir un programa que resuelva una fórmula matemática
     * que utilice al menos 3 variables.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        FormulaGeneral formulaGeneral = new FormulaGeneral();

        //a=2, b=-4 y c=-6
        System.out.println("""
                    FÓRMULA GENERAL:
                    -b ± √(b² - 4ac)
                x = ------------------
                       2a""");
        System.out.print("Ingrese el valor de A -> ");
        formulaGeneral.setA(teclado.nextDouble());

        System.out.print("Ingrese el valor de B -> ");
        formulaGeneral.setB(teclado.nextDouble());

        System.out.print("Ingrese el valor de C -> ");
        formulaGeneral.setC(teclado.nextDouble());

        System.out.println("\n" + formulaGeneral.mostrarMensaje());

        teclado.close();
    }
}
