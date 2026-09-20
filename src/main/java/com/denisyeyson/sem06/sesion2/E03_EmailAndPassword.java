package com.denisyeyson.sem06.sesion2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class E03_EmailAndPassword {

    /**
     * Ejercicio 3:<br>
     * Escribir un programa en Java que pida una dirección de correo y una clave de acceso.<br>
     * Mostrar “Acceso denegado” mientras el correo no cumpla con el formato correcto (clases Pattern & Matching) o mientras la clave ingresada sea diferente de “P@55w0rd”. Haga uso del bucle while.<br>
     * Si se ingresan las credenciales correctas se mostrará “Bienvenido al sistema” y el programa termina.<br>
     * El número máximo de intentos es 5. Si el usuario excede el límite se mostrará “Cuenta suspendida” y el programa termina.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Pattern patronCorreo = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        final String CLAVE_CORRECTA = "P@55w0rd";
        byte contadorIntentos = 0;
        boolean accesoConcedido = false;

        while (contadorIntentos < 5) {
            System.out.print("Ingrese su correo: ");
            String correo = entrada.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String password = entrada.nextLine();

            if (patronCorreo.matcher(correo).matches() && password.equals(CLAVE_CORRECTA)) {
                accesoConcedido = true;
                break;
            } else {
                System.err.println("Acceso denegado.");
                System.out.println("Intentos restantes: " + (4 - contadorIntentos));
            }
            contadorIntentos++;
        }

        System.out.println(accesoConcedido ? "\nBienvenido al sistema." : "\nCuenta suspendida.");
        entrada.close();
    }
}
