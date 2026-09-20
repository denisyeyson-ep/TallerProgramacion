package com.denisyeyson.sem06.sesion2;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.UNICODE_CASE;

public class A01_RegistroUsuarios {

    /**
     * Actividad 1:<br>
     * Realizar un programa que permita registrar usuarios.<br>
     * El programa debe solicitar al usuario que ingrese el nombre de un usuario y luego preguntar si desea registrar otro usuario.<br>
     * Si la respuesta es afirmativa (Sí), el programa debe permitir ingresar otro nombre de usuario.<br>
     * Si la respuesta es negativa (No), el programa debe mostrar la lista de usuarios registrados y finalizar.<br>
     * El programa debe validar que la respuesta del usuario sea "Sí" o "No" (sin importar mayúsculas o minúsculas) y, en caso de que la respuesta no sea válida, debe solicitar nuevamente la respuesta hasta que sea correcta.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(si|sí|no)$", CASE_INSENSITIVE | UNICODE_CASE);
        StringBuilder respuesta = new StringBuilder("si"), listaUsuarios = new StringBuilder();


        while (respuesta.toString().equalsIgnoreCase("si") || respuesta.toString().equalsIgnoreCase("sí")) {
            System.out.print("Ingrese el nombre del usuario: ");
            String nombre = entrada.nextLine();
            listaUsuarios.append(nombre.toUpperCase()).append("\n");

            System.out.print("¿Desea registrar otro usuario? (Sí/No): ");
            respuesta = new StringBuilder(entrada.nextLine());

            while (!pattern.matcher(respuesta).matches()) {
                System.out.print("""
                        Respuesta no válida.
                        Ingrese Sí o No:\s""");
                respuesta = new StringBuilder(entrada.nextLine());
            }
        }
        System.out.println("\nLista de usuarios registrados:");
        System.out.println(listaUsuarios);
        entrada.close();
    }
}
