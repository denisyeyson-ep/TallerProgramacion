package com.denisyeyson.sem05.sesion1;

import java.util.Scanner;

public class T02_AutomatizarCalculoEstacionamiento {

    /**
     * <b>Problema 2:</b><br>
     * Una empresa de estacionamientos necesita automatizar el cálculo del importe que debe pagar cada cliente según el tipo de vehículo y la cantidad de horas que permaneció en el estacionamiento.<br>
     * La tarifa se determina de acuerdo con el siguiente cuadro:
     * <table>
     *   <caption>Tarifas del estacionamiento</caption>
     *   <tr>
     *     <th>Código</th>
     *     <th>Tipo de vehículo</th>
     *     <th>Tarifa por hora</th>
     *   </tr>
     *   <tr>
     *     <td>1</td>
     *     <td>Motocicleta</td>
     *     <td>S/ 2.50</td>
     *   </tr>
     *   <tr>
     *     <td>2</td>
     *     <td>Automóvil</td>
     *     <td>S/ 4.00</td>
     *   </tr>
     *   <tr>
     *     <td>3</td>
     *     <td>Camioneta</td>
     *     <td>S/ 5.50</td>
     *   </tr>
     *   <tr>
     *     <td>4</td>
     *     <td>Camion</td>
     *     <td>S/ 8.00</td>
     *   </tr>
     * </table>
     * <p>
     * Desarrolle un programa en Java que solicite mediante la clase Scanner el código del tipo de vehículo y la cantidad de horas utilizadas durante el servicio<br>
     * El importe se deberá calcular realizando cantidad de horas × tarifa por hora.<br>
     * Si el usuario ingresa un código diferente de 1, 2, 3 o 4, el programa deberá mostrar el mensaje <i><b>“TIPO DE VEHÍCULO NO VÁLIDO”</i></b> y no deberá realizar el cálculo.<br>
     * Asimismo, si la cantidad de horas ingresada es menor o igual a cero, deberá mostrar el mensaje <i><b>“CANTIDAD DE HORAS NO VÁLIDA”</i></b> y no deberá realizar el cálculo.<br>
     * Se debe mostrar el código del vehículo, tipo de vehículo, cantidad de horas, tarifa por hora y total a pagar.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        String vehiculoEscogido = "";
        double tarifaPorHora = 0;

        System.out.print("""
                +---------------------------------------------+
                |         TARIFAS DE ESTACIONAMIENTO          |
                +---------------------------------------------+
                | Código | Tipo de Vehiculo | Tarifa por Hora |
                +--------+------------------+-----------------+
                |    1   |    Motocicleta   |      S/ 2.50    |
                |    2   |     Automóvil    |      S/ 4.00    |
                |    3   |    Camioneta     |      S/ 5.50    |
                |    4   |      Camion      |      S/ 8.00    |
                +--------+------------------+-----------------+
                
                Ingrese el código del vehículo:\s""");
        if (!entrada.hasNextByte()) {
            System.err.println("❌ Ingresar solo números enteros del 1 al 4, no se aceptan caracteres.");
            return;
        }
        byte codigoVehiculo = entrada.nextByte();
        if (codigoVehiculo < 1 || codigoVehiculo > 4) {
            System.err.println("❌ TIPO DE VEHÍCULO NO VÁLIDO.");
            return;
        }

        switch (codigoVehiculo) {
            case 1 -> {
                vehiculoEscogido = "Motocicleta";
                tarifaPorHora = 2.5;
            }
            case 2 -> {
                vehiculoEscogido = "Automóvil";
                tarifaPorHora = 4.0;
            }
            case 3 -> {
                vehiculoEscogido = "Camioneta";
                tarifaPorHora = 5.5;
            }
            case 4 -> {
                vehiculoEscogido = "Camion";
                tarifaPorHora = 8.0;
            }
        }

        System.out.printf("""
                \n
                Tipo de vehiculo escogido: %s
                Ahora ingrese la cantidad de horas a estacionar:\s""", vehiculoEscogido);
        if (!entrada.hasNextInt()) {
            System.err.println("❌ Ingresar solo números enteros, no se aceptan caracteres.");
            return;
        }
        int cantidadHorasEstacionar = entrada.nextInt();
        if (cantidadHorasEstacionar < 1) {
            System.err.println("❌ CANTIDAD DE HORAS NO VÁLIDA.");
            return;
        }

        double totalAPagar = cantidadHorasEstacionar * tarifaPorHora;
        System.out.printf("""
                \n
                Código del vehiculo : %s
                Tipo de vehiculo    : %s
                Cantidad de horas   : %d
                Tarifa x hora       : S/.%.2f
                El total a pagar es : S/.%.2f
                """, codigoVehiculo, vehiculoEscogido, cantidadHorasEstacionar, tarifaPorHora, totalAPagar);
        entrada.close();
    }
}
