package com.denisyeyson.sem02.sesion2;

import java.util.Scanner;

public class A03_TicketAgenteBancario {
    static void main() {
        // Scanner permite capturar los datos de la operación bancaria.
        Scanner scanner = new Scanner(System.in);

        // Datos textuales.
        System.out.print("Ingrese nombre del cliente: ");
        String cliente = scanner.nextLine();
        System.out.print("Ingrese nombre del banco: ");
        String banco = scanner.nextLine();

        // byte: número de operaciones realizadas en el día.
        System.out.print("Ingrese número de operaciones realizadas hoy: ");
        byte numeroOperaciones = scanner.nextByte();

        // short: número de agencias.
        System.out.print("Ingrese número de agencia: ");
        short numeroAgencia = scanner.nextShort();

        // int: código de la operación.
        System.out.print("Ingrese código de operación: ");
        int codigoOperacion = scanner.nextInt();

        // long: número de cuenta.
        System.out.print("Ingrese número de cuenta: ");
        long numeroCuenta = scanner.nextLong();

        // float: porcentaje de comisión.
        System.out.print("Ingrese comisión (%): ");
        float porcentajeComision = scanner.nextFloat();

        // double: monto de la operación.
        System.out.print("Ingrese monto de la operación: ");
        double monto = scanner.nextDouble();

        // char: D representa depósito y R representa retiro.
        System.out.print("Ingrese tipo de operación (D=Depósito / R=Retiro): ");
        char tipoOperacion = scanner.next().charAt(0);

        // boolean: indica si el cliente solicita comprobante.
        System.out.print("¿Desea comprobante? (true/false): ");
        boolean comprobante = scanner.nextBoolean();

        // Se calcula el importe de la comisión.
        double comision = monto * porcentajeComision / 100.0;

        // El cliente entrega o asume el monto de la operación más la comisión.
        double total = monto + comision;

        // Uso de los métodos String solicitados.
        cliente = cliente.toUpperCase();
        banco = banco.toLowerCase();

        // Se determina una descripción legible del tipo de operación.
        char tipoNormalizado = Character.toUpperCase(tipoOperacion);
        String descripcionOperacion = tipoNormalizado == 'D' ? "DEPOSITO" : "RETIRO";

        // Se imprime el ticket bancario con salida formateada.
        System.out.println("\n############################################");
        System.out.println("              AGENTE BANCARIO");
        System.out.println("############################################");
        System.out.printf("BANCO        : %s%n", banco);
        System.out.printf("AGENCIA      : %d%n", numeroAgencia);
        System.out.println("--------------------------------------------");
        System.out.printf("CLIENTE      : %s%n", cliente);
        System.out.printf("CUENTA       : %d%n", numeroCuenta);
        System.out.printf("OPERACIÓN    : %s%n", descripcionOperacion);
        System.out.printf("CÓDIGO       : %d%n", codigoOperacion);
        System.out.printf("NRO. OP. DÍA : %d%n", numeroOperaciones);
        System.out.println("--------------------------------------------");
        System.out.printf("%-25s S/. %8.2f%n", "MONTO:", monto);
        System.out.printf("%-25s S/. %8.2f%n", "COMISIÓN:", comision);
        System.out.println("--------------------------------------------");
        System.out.printf("%-25s S/. %8.2f%n", "TOTAL:", total);
        System.out.println("--------------------------------------------");
        System.out.printf("COMPROBANTE  : %b%n", comprobante);
        System.out.println("############################################");
        System.out.println("          OPERACIÓN REALIZADA");
        System.out.println("############################################");

        // Se cierra Scanner al finalizar el proceso.
        scanner.close();
    }
}
