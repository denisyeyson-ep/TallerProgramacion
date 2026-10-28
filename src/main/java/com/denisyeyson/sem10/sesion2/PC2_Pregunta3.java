package com.denisyeyson.sem10.sesion2;

import java.util.Scanner;

public class PC2_Pregunta3 {

    /**
     * <b><i>Practica 02: Pregunta 03</i></b><br>
     * Una empresa de distribución desea analizar la cantidad de pedidos asignados a sus rutas de reparto.
     * Para ello, se solicita desarrollar un programa que permita registrar y procesar esta información mediante un arreglo unidimensional.
     * Inicialmente, el programa deberá solicitar al usuario la cantidad de rutas que desea registrar, la cual deberá ser mayor que cero.
     * Si se ingresa un valor no válido, deberá mostrar el mensaje “CANTIDAD NO VÁLIDA” y solicitar nuevamente el dato hasta obtener un valor
     * válido. Seguidamente, deberá crear un arreglo con exactamente esa cantidad de posiciones, donde cada posición representará una
     * ruta de reparto y almacenará la cantidad de pedidos asignados a ella.
     * El programa deberá solicitar la cantidad de pedidos correspondiente a cada ruta, validando que los valores ingresados sean
     * mayores o iguales que cero. Si se ingresa un valor negativo, deberá mostrar el mensaje “CANTIDAD DE PEDIDOS NO VÁLIDA” y
     * solicitar nuevamente el dato para la misma ruta. Una vez completado el registro, el programa deberá mostrar todas las rutas
     * con sus respectivas cantidades de pedidos, identificar y mostrar la ruta o las rutas con la mayor y menor cantidad de pedidos,
     * calcular el total de pedidos registrados y el promedio de pedidos por ruta.
     * Todas las operaciones deberán realizarse directamente mediante las posiciones del arreglo unidimensional,
     * sin utilizar otros arreglos ni estructuras de datos adicionales para almacenar la información, aunque se permitirá
     * el uso de variables auxiliares para realizar los cálculos necesarios.
     */
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] rutas = new int[0];
        double promedioPedidos;
        int totalPedidos = 0, cantidadRutas, cantidadPedidos, mayorPedido = 0, menorPedido = 0;
        do {
            System.out.print("Ingrese la cantidad de rutas a registrar: ");
            cantidadRutas = scanner.nextInt();

            if (cantidadRutas <= 0) {
                System.out.println("CANTIDAD NO VÁLIDA\n");
            } else {
                rutas = new int[cantidadRutas];
                mayorPedido = -1;
                menorPedido = 1000000;
                for (int i = 0; i < cantidadRutas; i++) {
                    do {
                        System.out.print("Ingresar la cantidad de pedidos de la ruta: " + (i + 1) + ": ");
                        cantidadPedidos = scanner.nextInt();

                        if (cantidadPedidos < 0) {
                            System.out.println("CANTIDAD DE PEDIDOS NO VÁLIDA\n");
                        } else {
                            rutas[i] = cantidadPedidos;

                            //Según va ingresando calcula el mayor, menor y total de pedidos
                            if (rutas[i] > mayorPedido) {
                                mayorPedido = rutas[i];
                            }
                            if (rutas[i] < menorPedido) {
                                menorPedido = rutas[i];
                            }
                            totalPedidos += rutas[i];
                        }
                    } while (cantidadPedidos < 0);
                }
            }
        } while (cantidadRutas <= 0);
        promedioPedidos = (double) totalPedidos / rutas.length;


        System.out.println();
        for (int i = 0; i < rutas.length; i++) {
            String calificacion = "";
            if (rutas[i] == mayorPedido) {
                calificacion = "Mayor cantidad de pedidos";
            }
            if (rutas[i] == menorPedido) {
                calificacion = "Menor cantidad de pedidos";
            }
            System.out.printf("RUTA %d : %d pedidos. %s\n", (i + 1), rutas[i], calificacion);
        }
        System.out.printf("\nTotal de pedidos: %d\n", totalPedidos);
        System.out.printf("Promedio de pedidos: %.2f\n", promedioPedidos);
        scanner.close();
    }
}
