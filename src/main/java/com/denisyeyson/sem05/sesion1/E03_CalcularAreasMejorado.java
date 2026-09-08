package com.denisyeyson.sem05.sesion1;

import java.util.Scanner;

public class E03_CalcularAreasMejorado {
    private static final Scanner entrada = new Scanner(System.in);

    /**
     * Ejercicio 3
     * Muestra el menú de opciones para calcular áreas en metros.
     * Ingresar la opción del área a calcular, por ejemplo(cua, tri, rec, ado, etc):
     */
    static void main() {
        IO.print("""
                +-------------------------------------+
                |   CALCULADORA DE ÁREAS EN METROS:   |
                +-------------------------------------+
                | * Cuadrado                          |
                | * Rectángulo                        |
                | * Triángulo                         |
                | * Círculo                           |
                | * Salir                             |
                +-------------------------------------+
                
                Ingrese la opción del área a calcular, por ejemplo(cua, tri, rec, ado, etc):\s""");
        String palabraIngresada = entrada.nextLine().toUpperCase();

        switch (palabraIngresada) {
            case String s when "CUADRADO".contains(s) -> calcularAreaCuadrado();
            case String s when "RECTANGULO".contains(s) || "RECTÁNGULO".contains(s) -> calcularAreaRectangulo();
            case String s when "TRIANGULO".contains(s) || "TRIÁNGULO".contains(s) -> calcularAreaTriangulo();
            case String s when "CIRCULO".contains(s) || "CÍRCULO".contains(s) -> calcularAreaCirculo();
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
        if (!entrada.hasNextDouble()) {
            System.err.println("ERROR: Ingresar solo números positivos, no se aceptan caracteres.");
            System.exit(0);
        }

        double medidaMetros = entrada.nextDouble();

        if (medidaMetros <= 0) {
            System.err.println("ERROR: Ingresar solo números positivos, mayores a 0.");
            System.exit(0);
        }
        entrada.nextLine();

        return medidaMetros;
    }
}
