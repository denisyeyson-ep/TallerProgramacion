package com.denisyeyson.sem06.sesion1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class E01_ValidarCodigo {

    /**
     * Ejercicio 1:<br>
     * Escribir un programa en Java que solicite al usuario el ingreso de un código universitario y valide su formato.<br>
     * Mostrar el mensaje adecuado en caso no se cumpla dicho formato y volver a solicitar el código, usando la estructura while.<br>
     * Ejemplo de código universitario: U23205077
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);

        IO.print("Ingrese un código de estudiante: ");
        String codigoEstudiante = entrada.nextLine();

        Pattern patron = Pattern.compile("^[Uu]\\d{8}$");
        boolean esValido = patron.matcher(codigoEstudiante).matches();

        if (esValido) {
            System.out.printf("Código universitario válido: %s%n", codigoEstudiante);
        } else {
            System.err.println("Código inválido. Debe tener el formato U########.\nEjemplo: U23205077");
        }

        entrada.close();
    }
}
