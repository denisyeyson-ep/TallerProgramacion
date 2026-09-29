package com.denisyeyson.tool;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Valores {

    public Valores(){

    }

    public String validarCadena(Scanner entrada, String mensaje, String mensajeError, String patron){
        Pattern patronOpcionDecimal = Pattern.compile(patron);
        while (true) {
            System.out.print(mensaje);
            String valor = entrada.nextLine();
            if (patronOpcionDecimal.matcher(valor).matches())
                return valor;
            else
                entrada.nextLine();
            System.out.println(Color.ROJO+mensajeError+Color.RESET);
        }
    }

    public int validarEntero(Scanner entrada, String mensaje, String mensajeError, String patron) {
        Pattern patronOpcionDecimal = Pattern.compile(patron);
        while (true) {
            System.out.print(mensaje);
            String valorEntero = entrada.next();
            if (patronOpcionDecimal.matcher(valorEntero).matches())
                return Integer.parseInt(valorEntero);
            else
                entrada.nextLine();
            System.out.println(Color.ROJO+mensajeError+Color.RESET);
        }
    }

    public double validarDecimal(Scanner entrada, String mensaje, String mensajeError, String patron) {
        Pattern patronOpcionDecimal = Pattern.compile(patron);
        while (true) {
            System.out.print(mensaje);
            String valorEntero = entrada.next();
            if (patronOpcionDecimal.matcher(valorEntero).matches())
                return Double.parseDouble(valorEntero);
            else
                entrada.nextLine();
            System.out.println(Color.ROJO+mensajeError+Color.RESET);
        }
    }
}
