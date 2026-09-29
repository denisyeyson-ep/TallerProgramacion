package com.denisyeyson.sem08.sesion2;

import com.denisyeyson.tool.ReporteASCII;
import com.denisyeyson.tool.Valores;

import java.util.Scanner;

public class E01_ReporteEmpleado {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Valores valores = new Valores();
        ReporteASCII reporte = new ReporteASCII(51);
        String[] meses = {"ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC"};

        String nombres = valores.validarCadena(entrada, "Ingrese nombres: ", "Error: Ingrese nombres válidos.", "^[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ]+(?: [a-zA-ZáéíóúÁÉÍÓÚñÑüÜ]+){1,3}$");
        int tipoEmpleado = valores.validarEntero(entrada, "Ingrese el tipo de empleado(1.Contradado ,2.Nombrado): ", "Error: ingrese solo las opciones del tipo de empleado.", "[1,2]");
        double salario = valores.validarDecimal(entrada, "Ingrese salario mensual: ", "Error: Ingrese salario válido.", "^[0-9]+(\\.[0-9]{1,2})?$");
        int numeroBoletasEmitidas = valores.validarEntero(entrada, "Ingrese la cantidad de boletas emitidas: ", "Error: solo se aceptan números enteros", "[1-9]\\d*");
        String listaMeses = """
                01. ENERO
                02. FEBRERO
                03. MARZO
                04. ABRIL
                05. MAYO
                06. JUNIO
                07. JULIO
                08. AGOSTO
                09. SEPTIEMBRE
                10. OCTUBRE
                11. NOVIEMBRE
                12. DICIEMBRE
                ->\s""";
        int numeroMesCurso = valores.validarEntero(entrada, "Ingrese el número del mes del curso:\n" + listaMeses, "Error: solo se aceptan números enteros", "^(?:[1-9]|1[0-2])$");

        double total = salario * numeroMesCurso;
        int boletasRestantes = numeroMesCurso - numeroBoletasEmitidas;
        reporte.imprimirBorde();
        reporte.imprimirContenido("RESUMEN DE BOLETAS DE PAGO ", reporte.CENTRADO);
        reporte.imprimirBorde();
        reporte.imprimirContenido(String.format("Empleado: %s", nombres.toUpperCase()), reporte.DERECHA);
        if (tipoEmpleado == 1)
            reporte.imprimirContenido("Tipo: [X] Contratado    [ ] Nombrado", reporte.DERECHA);
        else
            reporte.imprimirContenido("Tipo: [ ] Contratado    [X] Nombrado", reporte.DERECHA);
        reporte.imprimirBorde();
        reporte.imprimirContenido("Datos del Salario            Boleta", reporte.DERECHA);
        for (int i = 0; i < numeroMesCurso; i++) {
            if (i < numeroBoletasEmitidas)
                reporte.imprimirContenido(String.format("Salario %s: S/. %.2f     SI", meses[i], salario), reporte.DERECHA);
            else
                reporte.imprimirContenido(String.format("Salario %s: S/. %.2f     NO", meses[i], salario), reporte.DERECHA);
        }
        reporte.imprimirBorde();
        reporte.imprimirContenido(String.format("Boletas emitidas: %d", numeroBoletasEmitidas), reporte.DERECHA, String.format("Boletas Restantes: %d", boletasRestantes), reporte.IZQUIERDA, " ");
        reporte.imprimirContenido(String.format("Monto total pagado: S/. %.2f", total), reporte.DERECHA);
        reporte.imprimirBorde();
        entrada.close();
    }
}
