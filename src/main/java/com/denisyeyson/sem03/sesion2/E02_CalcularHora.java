package com.denisyeyson.sem03.sesion2;

import com.denisyeyson.sem03.sesion2.model.CalcularHora;

import java.util.Scanner;

public class E02_CalcularHora {

    /**
     * Ejercicio 02:
     * Escribir un programa en Java que lea las horas, minutos y segundos
     * individualmente, y calcule qué hora sería en el siguiente segundo.
     * <p>
     * Validar los valores ingresados de las horas (0-23), minutos (0-59) y segundos (0-59)
     */
    static void main() {
        Scanner teclado=new Scanner(System.in);
        CalcularHora calcularHora=new CalcularHora();

        System.out.println("CALCULAR HORA:");

        System.out.print("Ingrese la hora -> ");
        calcularHora.setHora(teclado.nextInt());

        System.out.print("Ingrese el minuto -> ");
        calcularHora.setMinuto(teclado.nextInt());

        System.out.print("Ingrese el segundo -> ");
        calcularHora.setSegundo(teclado.nextInt());

        System.out.println("\n"+calcularHora.mostrarHora());

        teclado.close();
    }
}
