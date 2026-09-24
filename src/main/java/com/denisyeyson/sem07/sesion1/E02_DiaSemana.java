package com.denisyeyson.sem07.sesion1;

import java.util.Scanner;

public class E02_DiaSemana {

    static void main() {
        Scanner entrada = new Scanner(System.in);
        byte diaSemana;
        do{
            System.out.print("Ingrese un número entre 1 y 7 para indicar el día de la semana: ");
            diaSemana = entrada.nextByte();
            entrada.nextLine();
        }while(diaSemana<1 || diaSemana>7);

        System.out.println("El día de la semana ingresado es: " + diaSemana);

        entrada.close();
    }
}
