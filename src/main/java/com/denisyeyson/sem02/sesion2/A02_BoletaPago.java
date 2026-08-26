package com.denisyeyson.sem02.sesion2;

import java.util.Scanner;

public class A02_BoletaPago {

    /**
     * Valor pagado por cada hora extra.
     */
    private static final double PAGO_HORA_EXTRA = 15.00;

    /**
     * Descuento aplicado por cada tardanza.
     */
    private static final double DESCUENTO_POR_TARDANZA = 20.00;

    /**
     * Monto utilizado como asignación familiar para fines del ejercicio.
     */
    private static final double ASIGNACION_FAMILIAR = 120.00;

    static void main() {
        // Se crea Scanner para capturar los datos del trabajador.
        Scanner scanner = new Scanner(System.in);

        // Datos String del trabajador.
        System.out.print("Ingrese nombre del trabajador: ");
        String trabajador = scanner.nextLine();
        System.out.print("Ingrese cargo: ");
        String cargo = scanner.nextLine();

        // byte: cantidad de tardanzas.
        System.out.print("Ingrese número de tardanzas: ");
        byte tardanzas = scanner.nextByte();

        // short: cantidad de días trabajados.
        System.out.print("Ingrese días trabajados: ");
        short diasTrabajados = scanner.nextShort();

        // int: cantidad de horas extras.
        System.out.print("Ingrese horas extras: ");
        int horasExtras = scanner.nextInt();

        // long: DNI del trabajador.
        System.out.print("Ingrese DNI: ");
        long dni = scanner.nextLong();

        // float: porcentaje de descuento AFP.
        System.out.print("Ingrese porcentaje AFP: ");
        float porcentajeAFP = scanner.nextFloat();

        // double: sueldo básico.
        System.out.print("Ingrese sueldo básico: ");
        double sueldoBasico = scanner.nextDouble();

        // char: categoría laboral.
        System.out.print("Ingrese categoría (A/B/C): ");
        char categoria = scanner.next().charAt(0);

        // boolean: determina si corresponde asignación familiar.
        System.out.print("¿Tiene asignación familiar? (true/false): ");
        boolean tieneAsignacion = scanner.nextBoolean();

        // Se calculan los ingresos adicionales.
        double montoHorasExtras = horasExtras * PAGO_HORA_EXTRA;
        double asignacion = tieneAsignacion ? ASIGNACION_FAMILIAR : 0.0;

        // El subtotal representa los ingresos antes de descuentos.
        double subtotal = sueldoBasico + montoHorasExtras + asignacion;

        // Se calculan los descuentos de AFP y tardanzas.
        double descuentoAFP = subtotal * porcentajeAFP / 100.0;
        double descuentoTardanzas = tardanzas * DESCUENTO_POR_TARDANZA;
        double totalDescuentos = descuentoAFP + descuentoTardanzas;

        // El total a pagar es el subtotal menos los descuentos.
        double totalPagar = subtotal - totalDescuentos;

        // Uso de métodos de String exigidos por el enunciado.
        trabajador = trabajador.toUpperCase();
        cargo = cargo.toLowerCase();

        // Se imprime la boleta con columnas alineadas.
        System.out.println("\n============================================");
        System.out.println("              BOLETA DE PAGO");
        System.out.println("============================================");
        System.out.printf("Trabajador       : %s%n", trabajador);
        System.out.printf("DNI              : %d%n", dni);
        System.out.printf("Cargo            : %s%n", cargo);
        System.out.printf("Categoría        : %c%n", Character.toUpperCase(categoria));
        System.out.printf("Días trabajados  : %d%n", diasTrabajados);
        System.out.printf("Horas extras     : %d%n", horasExtras);
        System.out.printf("Tardanzas        : %d%n", tardanzas);
        System.out.printf("Asig. familiar   : %b%n", tieneAsignacion);
        System.out.println("--------------------------------------------");
        System.out.printf("%-25s S/. %8.2f%n", "Sueldo básico:", sueldoBasico);
        System.out.printf("%-25s S/. %8.2f%n", "Horas extras:", montoHorasExtras);
        System.out.printf("%-25s S/. %8.2f%n", "Asignación familiar:", asignacion);
        System.out.println("--------------------------------------------");
        System.out.printf("%-25s S/. %8.2f%n", "SUBTOTAL:", subtotal);
        System.out.printf("%-25s S/. %8.2f%n", "Descuento AFP:", descuentoAFP);
        System.out.printf("%-25s S/. %8.2f%n", "Desc. tardanzas:", descuentoTardanzas);
        System.out.printf("%-25s S/. %8.2f%n", "TOTAL DESCUENTOS:", totalDescuentos);
        System.out.println("--------------------------------------------");
        System.out.printf("%-25s S/. %8.2f%n", "TOTAL A PAGAR:", totalPagar);
        System.out.println("============================================");

        // Se libera el recurso Scanner.
        scanner.close();
    }
}
