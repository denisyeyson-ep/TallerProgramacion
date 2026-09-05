package com.denisyeyson.sem05.sesion1;

import java.util.Scanner;

public class E02_BusquedaPalabras {

    /**
     * Ejercicio 2:
     * Elegir una figura requiere ingresar el nombre
     * completo o las tres primeras letras (“cuadrado” o “cua”, por ejemplo).
     * Usa los métodos equals y contains de la clase String para validar el ingreso del usuario.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        StringBuilder textoEncontrado = new StringBuilder();

        IO.print("Ingrese el texto a buscar: ");
        String palabraIngresada = teclado.nextLine().toUpperCase();

        switch (palabraIngresada) {
            case String s when "CUADRADO".contains(s) -> textoEncontrado.append("CUADRADO");
            case String s when "RECTANGULO".contains(s) || "RECTÁNGULO".contains(s) -> textoEncontrado.append("RECTÁNGULO");
            case String s when "TRIANGULO".contains(s) || "TRIÁNGULO".contains(s) -> textoEncontrado.append("TRIANGULO");
            case String s when "CIRCULO".contains(s) || "CÍRCULO".contains(s) -> textoEncontrado.append("CÍRCULO");
            default -> IO.println("No se encontró la palabra");
        }

        IO.println(textoEncontrado);
        teclado.close();
    }
}
