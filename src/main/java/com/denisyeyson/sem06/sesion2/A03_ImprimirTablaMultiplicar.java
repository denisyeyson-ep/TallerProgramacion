package com.denisyeyson.sem06.sesion2;

public class A03_ImprimirTablaMultiplicar {

    /**
     * Actividad 3:<br>
     * Escribir un programa en Java que imprima la tabla de multiplicar del 1 al 10 utilizando bucles anidados.<br>
     * La salida debe mostrar cada tabla de multiplicar en un formato legible, por ejemplo:<br>
     * <pre>
     * Tabla del 1:
     * 1 x 0 = 0
     * 1 x 1 = 1
     * 1 x 2 = 2
     * ...
     */
    static void main() {
        int tabla = 1,contador = 0;

        while(tabla<11){
            System.out.println("Tabla del " + tabla);
            while(contador<11){
                System.out.println(tabla + " x " + contador + " = " + (tabla*contador));
                contador++;
            }
            System.out.print("\n");
            contador = 0;
            tabla++;
        }
    }
}
