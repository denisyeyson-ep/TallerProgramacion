package com.denisyeyson.sem07.sesion2;

public class T01_ContadorProgresivo {
    static void main() {
        int i = 1;

        System.out.println("Conteo del 1 al 100:");
        do {
            System.out.println("Número: " + i);
            i++;
        } while (i <= 100);
    }
}
