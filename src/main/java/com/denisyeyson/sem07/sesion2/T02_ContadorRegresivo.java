package com.denisyeyson.sem07.sesion2;

public class T02_ContadorRegresivo {
    static void main() {
        int i = 10;

        System.out.println("Cuenta Regresiva:");
        do {
            System.out.println("Segundos restantes: " + i);
            i--;
        } while (i >= 1);

        System.out.println("¡Tiempo cumplido!");
    }
}
