package com.denisyeyson.sem07.sesion2;

import com.denisyeyson.sem07.tool.ReporteASCII;

import java.util.Scanner;
import java.util.regex.Pattern;

public class E01_InfoEmpleado {

    static void main() {

        Pattern patronNombre = Pattern.compile("^[A-Za-zÁÉÍÓÚáéíóúÑñÜü]+([ '-][A-Za-zÁÉÍÓÚáéíóúÑñÜü]+)*$");
        Pattern patronSalario = Pattern.compile("^(?=.*[1-9])[0-9]{1,5}(\\.[0-9]{1,2})?$");

        Scanner entrada = new Scanner(System.in);
        String nombres = "", apellidos = "";
        float salarioMensual = 0, total = 0, descuento = 0;
        boolean validadorNombres = false, validadorApellidos = false, validadorSalario = false;
        byte opcion = 0;
        do {
            System.out.print("""
                    \n
                    ################################
                    #       MENU DE OPCIONES       #
                    ################################
                    # 1. Ingresar empleado         #
                    # 2. Ingresar salario mensual  #
                    # 3. Emitir boleta             #
                    # 4. Salir                     #
                    ################################
                    Ingrese una opción:\s""");

            if (!entrada.hasNextByte()) {
                System.err.println("Opción inválida. Ingrese una opcion valida solo números [1-4].");
                entrada.nextLine();
                continue;
            }
            opcion = entrada.nextByte();

            if (opcion < 1 || opcion > 4) {
                System.err.println("Opción inválida. Intente nuevamente.");
                continue;
            }

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresar el nombre del empleado: ");
                    nombres = entrada.next().trim();

                    if (patronNombre.matcher(nombres).matches()) {
                        validadorNombres = true;
                    } else {
                        System.err.println("Nombre inválido. Solo se permiten letras.");
                        continue;
                    }

                    System.out.print("Ingresar los apellidos del empleado: ");
                    apellidos = entrada.next().trim();

                    if (patronNombre.matcher(apellidos).matches()) {
                        validadorApellidos = true;
                    } else {
                        System.err.println("Apellidos inválido. Solo se permiten letras.");
                        continue;
                    }
                    System.out.println("\nEmpleado registrado correctamente.");
                }
                case 2 -> {
                    System.out.print("Ingresar el salario mensual: ");

                    if (!entrada.hasNextFloat()) {
                        System.err.println("Ingrese un salario numérico válido.");
                        continue;
                    }
                    salarioMensual = entrada.nextFloat();

                    if (!patronSalario.matcher(String.format("%.2f", salarioMensual)).matches()) {
                        System.err.println("Ingrese un salario numérico válido y debe ser mayor a cero.");
                        continue;
                    }

                    total = salarioMensual * 12;
                    descuento = total * 0.05f;
                    validadorSalario = true;
                    System.out.println("\nSalario registrado correctamente.");

                }
                case 3 -> {
                    if ((!validadorNombres || !validadorApellidos) && !validadorSalario) {
                        System.out.println("\nPrimero debe realizar las opciones 1 y 2.");
                    } else if (!validadorNombres || !validadorApellidos) {
                        System.out.println("\nPrimero debe ingresar los datos del empleado.");
                    } else if (!validadorSalario) {
                        System.out.println("\nPrimero debe ingresar el salario mensual.");
                    } else {
                        mostrarReporteASCII(nombres, apellidos, salarioMensual, total, descuento);
                    }
                }
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.err.println("Opción no valida, ingresar solo las opciones del menu");
            }
        } while (opcion != 4);
        entrada.close();
    }

    static void mostrarReporteASCII(String nombres, String apellidos, double salarioMensual, double total, double descuento) {
        ReporteASCII reporte = new ReporteASCII(51);
        String[] meses = {"ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC"};
        System.out.println();
        reporte.imprimirBorde();
        reporte.imprimirContenido("RESUMEN DE BOLETAS DE PAGO ", reporte.CENTRADO);
        reporte.imprimirBorde();
        reporte.imprimirContenido("NOMBRES DEL EMPLEADO  : " + nombres.toUpperCase(), reporte.DERECHA);
        reporte.imprimirContenido("APELLIDOS DEL EMPLEADO: " + apellidos.toUpperCase(), reporte.DERECHA);
        reporte.imprimirBorde();
        reporte.imprimirContenido("Tipo: Contratado", reporte.DERECHA);
        reporte.imprimirBorde();
        int contador = 0;
        do {
            reporte.imprimirContenido(String.format("Salario %s: %.2f", meses[contador], salarioMensual), reporte.DERECHA,
                    String.format("Salario %s: %.2f", meses[contador + 1], salarioMensual), reporte.IZQUIERDA, " ");
            contador += 2;
        } while (contador < 12);
        reporte.imprimirBorde();
        reporte.imprimirContenido("Total     : ", reporte.DERECHA, String.format("%.2f", total), reporte.IZQUIERDA, " ");
        reporte.imprimirContenido("Descuento : ", reporte.DERECHA, String.format("%.2f", descuento), reporte.IZQUIERDA, " ");
        reporte.imprimirBorde();
    }
}

