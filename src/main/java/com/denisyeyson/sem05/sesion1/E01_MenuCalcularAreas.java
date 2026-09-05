package com.denisyeyson.sem05.sesion1;

import java.util.Scanner;

public class E01_MenuCalcularAreas {

    private static final Scanner entrada = new Scanner(System.in);
    private static final byte AREA_CUADRADO = 1;
    private static final byte AREA_RECTANGULO = 2;
    private static final byte AREA_TRIANGULO = 3;
    private static final byte AREA_CIRCULO = 4;
    private static final byte SALIR = 5;

    /**
     * Ejercicio 1:
     * Escribe un programa en Java para crear una Calculadora de Áreas.
     * Debe preguntarse al usuario por la figura (cuadrado, rectángulo, triángulo o círculo) y
     * luego solicitar los datos para calcular su área.
     */
    static void main() {
        byte opcion;

        IO.print("""
                CALCULADORA DE ÁREAS EN METROS:
                1. Cuadrado
                2. Rectángulo
                3. Triángulo
                4. Círculo
                5. Salir
                Ingrese una opción:\s""");
        if (!entrada.hasNextByte()) {
            System.err.println("ERROR: Ingresar solo las opciones del menú.");
            return;
        }
        opcion = entrada.nextByte();

        switch (opcion) {
            case AREA_CUADRADO -> calcularAreaCuadrado();
            case AREA_RECTANGULO -> calcularAreaRectangulo();
            case AREA_TRIANGULO -> calcularAreaTriangulo();
            case AREA_CIRCULO -> calcularAreaCirculo();
            case SALIR -> IO.println("Saliendo del programa...");
            default -> System.err.println("ERROR: Ingresar solo las opciones del menú.");
        }
        entrada.close();
    }

    static void calcularAreaCuadrado() {

        IO.print("\nÁREA DEL CUADRADO:\nIngrese el lado del cuadrado: ");
        double lado = validarEntrada();

        double areaCalculada = Math.pow(lado, 2);
        System.out.printf("\nEl área del cuadrado es: %.2f m²", areaCalculada);
    }

    static void calcularAreaRectangulo() {

        IO.print("\nÁREA DEL RECTÁNGULO:\nIngrese la base del rectángulo: ");
        double base = validarEntrada();

        IO.print("Ingrese la altura del rectángulo: ");
        double altura = validarEntrada();

        double areaCalculada = base * altura;
        System.out.printf("\nEl área del rectángulo es: %.2f m²", areaCalculada);
    }

    static void calcularAreaTriangulo() {

        IO.print("\nÁREA DEL TRIANGULO ISOSCELES:\nIngrese la base del triangulo: ");
        double base = validarEntrada();

        IO.print("Ingrese la altura del triangulo: ");
        double altura = validarEntrada();

        double areaCalculada = (base * altura) / 2;
        System.out.printf("\nEl área del triangulo es: %.2f m²", areaCalculada);
    }

    static void calcularAreaCirculo() {

        IO.print("\nÁREA DEL CIRCULO:\nIngrese el radio del circulo: ");
        double radio = validarEntrada();

        double areaCalculada = Math.PI * Math.pow(radio, 2);
        System.out.printf("\nEl área del circulo es: %.2f m²", areaCalculada);
    }

    static double validarEntrada() {
        double medida;
        if (!entrada.hasNextDouble()) {
            System.err.println("ERROR: Ingresar solo números positivos, no se aceptan caracteres.");
            System.exit(0);
        }

        medida = entrada.nextDouble();

        if (medida < 0) {
            System.err.println("ERROR: Ingresar solo números positivos.");
            System.exit(0);
        }
        entrada.nextLine();

        return medida;
    }
}
