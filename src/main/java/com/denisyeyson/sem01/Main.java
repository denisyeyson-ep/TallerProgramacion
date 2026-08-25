package com.denisyeyson.sem01;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int opc;

        System.out.print("""
                Menú opciones:
                --------------------
                1. Área de un circulo
                2. Formula General
                3. Calcular IGV
                4. Salir
                Seleccione una opción:""");

        opc = entrada.nextInt();

        switch (opc) {
            case 1 -> {
                System.out.println("\nÁrea de un circulo A=π.r²");
                System.out.println("Ingrese el radio del circulo en cm.");
                double radio = entrada.nextDouble();
                AreaCirculo areaCirculo = new AreaCirculo(radio);
                System.out.println("El área del circulo es: " + areaCirculo.getArea() + " cm².");
            }
            case 2 -> {//a=2, b=-4 y c=-6
                System.out.println("""
                        \nFórmula general:
                                  -b ± √(b² - 4ac)
                              x = ------------------
                                         2a
                        """);
                System.out.println("Ingrese los valores de a, b y c.");
                double a = entrada.nextDouble();
                double b = entrada.nextDouble();
                double c = entrada.nextDouble();
                FormulaGeneral formulaGeneral = new FormulaGeneral(a, b, c);

                System.out.println("El valor de discriminante es: " + formulaGeneral.getDiscriminante());
                System.out.println(formulaGeneral.getDiscriminante() > 0 ? "Los valores de x son: " + formulaGeneral.getResultado()[0] + " y " + formulaGeneral.getResultado()[1] : "No existen soluciones reales");
            }
            case 3 -> {
                System.out.println("\nCalcular IGV");
                System.out.println("Ingrese el monto total del producto.");
                double montoTotal = entrada.nextDouble();
                CalcularIGV calcularIGV = new CalcularIGV(montoTotal);
                System.out.println("El monto IGV es: " + calcularIGV.getMontoIgv());
                System.out.println("El monto neto es: " + calcularIGV.getMontoNeto());
            }
            case 4 -> {
                System.out.println("\nGracias por usar el programa \uD83D\uDC4D\nSaliendo...");
                System.exit(0);
            }
            default -> System.out.println("Opción no válida");
        }
        entrada.close();
    }
}
