package com.denisyeyson.sem03.sesion1;

import com.denisyeyson.sem03.sesion1.model.Jubilacion;

import java.util.Scanner;

public class Eje02_Jubilacion {

    /**
     * Ejercicio 02:
     * Una persona se puede jubilar si tiene 65 años o más en el caso de los hombres,
     * y 60 como mínimo, en el caso de las mujeres. Las variables leídas son: sexo y edad.
     * Determinar si la persona puede jubilarse.
     */

    static void main() {
        Scanner teclado = new Scanner(System.in);
        Jubilacion jubilacion = new Jubilacion();

        System.out.println("EVALUACIÓN DE JUBILACIÓN:");

        System.out.print("Ingrese sexo (M/F): ");
        jubilacion.setSexo(teclado.nextLine().toUpperCase().charAt(0));

        System.out.print("Ingrese edad: ");
        jubilacion.setEdad(teclado.nextInt());

        System.out.println("\n" + jubilacion.mostrarMensaje());

        teclado.close();
    }
}
