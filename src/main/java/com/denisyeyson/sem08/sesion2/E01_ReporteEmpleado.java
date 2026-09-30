package com.denisyeyson.sem08.sesion2;

import com.denisyeyson.tool.ReporteASCII;
import com.denisyeyson.tool.Valores;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class E01_ReporteEmpleado {
    static String[] meses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

    static void main() {
        Scanner entrada = new Scanner(System.in);
        Valores valores = new Valores();
        String nombres = valores.validarCadena(entrada, "Ingrese nombres: ", "Error: Ingrese nombres válidos.", "^[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑüÜ]+){1,3}$");
        int tipoEmpleado = valores.validarEntero(entrada, "Ingrese el tipo de empleado(1.Contradado ,2.Nombrado): ", "Error: ingrese solo las opciones del tipo de empleado.", "[1,2]");
        double salarioMensual = valores.validarDecimal(entrada, "Ingrese salario mensual: ", "Error: Ingrese salario válido.", "^[0-9]+(\\.[0-9]{1,2})?$");
        int numeroBoletasEmitidas = valores.validarEntero(entrada, "Ingrese la cantidad de boletas emitidas: ", "Error: solo se aceptan números enteros", "[1-9]\\d*");
        StringBuilder listaMeses = new StringBuilder();
        AtomicInteger contador = new AtomicInteger(1);
        Arrays.stream(meses).forEach(e -> listaMeses.append(String.format("%02d. ", contador.getAndIncrement())).append(e).append("\n"));
        int numeroMesCurso = valores.validarEntero(entrada, "Ingrese el número del mes del curso:\n" + listaMeses, "Error: solo se aceptan números enteros", "^(?:[1-9]|1[0-2])$");
        mostrarReporte(nombres, tipoEmpleado, salarioMensual, numeroMesCurso, numeroBoletasEmitidas);
        entrada.close();
    }

    static void mostrarReporte(String nombresEmpleado, int tipoEmpleado, double salarioMensual, int mesCurso, int numeroBoletasEmitidas) {
        ReporteASCII reporte = new ReporteASCII(51);

        double total = salarioMensual * mesCurso;
        int boletasRestantes = mesCurso - numeroBoletasEmitidas;

        reporte.imprimirBorde();
        reporte.imprimirContenido("RESUMEN DE BOLETAS DE PAGO ", reporte.CENTRADO);
        reporte.imprimirBorde();
        reporte.imprimirContenido(String.format("Empleado: %s", nombresEmpleado.toUpperCase()), reporte.DERECHA);
        if (tipoEmpleado == 1)
            reporte.imprimirContenido("Tipo: [X] Contratado    [ ] Nombrado", reporte.DERECHA);
        else
            reporte.imprimirContenido("Tipo: [ ] Contratado    [X] Nombrado", reporte.DERECHA);
        reporte.imprimirBorde();
        reporte.imprimirContenido("Datos del Salario            Boleta", reporte.DERECHA);
        for (int i = 0; i < mesCurso; i++) {
            if (i < numeroBoletasEmitidas)
                reporte.imprimirContenido(String.format("Salario %s: S/. %.2f     SI", meses[i].substring(0, 3), salarioMensual), reporte.DERECHA);
            else
                reporte.imprimirContenido(String.format("Salario %s: S/. %.2f     NO", meses[i].substring(0, 3), salarioMensual), reporte.DERECHA);
        }
        reporte.imprimirBorde();
        reporte.imprimirContenido(String.format("Boletas emitidas: %d", numeroBoletasEmitidas), reporte.DERECHA, String.format("Boletas Restantes: %d", boletasRestantes), reporte.IZQUIERDA, " ");
        reporte.imprimirContenido(String.format("Monto total pagado: S/. %.2f", total), reporte.DERECHA);
        reporte.imprimirBorde();
    }
}
