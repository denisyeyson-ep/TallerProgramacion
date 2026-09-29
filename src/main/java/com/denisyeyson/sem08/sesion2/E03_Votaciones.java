package com.denisyeyson.sem08.sesion2;

import com.denisyeyson.tool.Color;
import com.denisyeyson.tool.Valores;

import java.util.Arrays;
import java.util.Scanner;

public class E03_Votaciones {

    /**
     * Ejercicio 3:
     * Escribir un programa para recoger los votos de 10 personas que elegirán un color para una campaña publicitaria. Los colores son:
     * celeste, morado y turquesa.
     * Mostrar al final cuántos votos obtuvo cada color, su porcentaje y qué color resultó elegido.
     * Todo el reporte debe generarse y almacenarse en una cadena utilizando String.format()
     */
    static void main() {
        Scanner entrada=new Scanner(System.in);
        Valores v=new Valores();
        int contCeleste=0, contMorado=0,contTurquesa=0, porcentajeCeleste,porcentajeMorado, porcentajeTurquesa;

        String menuVotacion= """
                +---------------------+
                | CAMPAÑA DE VOTACIÓN:|
                +---------------------+
                | \033[38;2;100;200;255m1. Celeste\033[0m          |
                | \033[38;2;180;100;255m2. Morado\033[0m           |
                | \033[38;2;0;200;180m3. Turquesa\033[0m         |
                +---------------------+
                Elija su color:\s""";
        for(int i=0; i<10; i++) {
            imprimir(Color.AZUL, "\nVoto " + (i+1) + ": ");
            int opcionVoto= v.validarEntero(entrada, menuVotacion, "\nError: Opción inválida, ingresar solo los valores del menú.\n", "^[1-3]$");
            switch(opcionVoto){
                case 1-> contCeleste++;
                case 2-> contMorado++;
                case 3-> contTurquesa++;
            }
        }
        porcentajeCeleste=contCeleste*10;
        porcentajeMorado=contMorado*10;
        porcentajeTurquesa=contTurquesa*10;

        String resultado = getResultado(porcentajeCeleste, porcentajeMorado, porcentajeTurquesa);

        String reporte= """
                \n
                Resultado de Votos:
                ----------------------------
                * Celeste   : %d votos. [%d%%]
                * Morado    : %d votos. [%d%%]
                * Turquesa  : %d votos. [%d%%]
                ----------------------------
                %s
                """.formatted(contCeleste,porcentajeCeleste, contMorado,porcentajeMorado, contTurquesa,porcentajeTurquesa,resultado);
        imprimir(Color.VERDE, reporte);
    }

    static String getResultado(int porcentajeCeleste, int porcentajeMorado, int porcentajeTurquesa) {
        String resultado="";
        if(porcentajeCeleste == porcentajeMorado)
            resultado="Empate entre Celeste y Morado";
        if(porcentajeCeleste == porcentajeTurquesa)
            resultado="Empate entre Celeste y Turquesa";
        if(porcentajeMorado == porcentajeTurquesa)
            resultado="Empate entre Morado y Turquesa";
        if(porcentajeCeleste > porcentajeMorado && porcentajeCeleste > porcentajeTurquesa)
            resultado="El color ganador es: Celeste";
        if(porcentajeMorado > porcentajeCeleste && porcentajeMorado > porcentajeTurquesa)
            resultado="El color ganador es: Morado";
        if(porcentajeTurquesa > porcentajeCeleste && porcentajeTurquesa > porcentajeMorado)
            resultado="El color ganador es: Turquesa";
        return resultado;
    }

    static void imprimir(String color, String texto) {
        System.out.println(color + texto + Color.RESET);
    }

    static String textoColor(String color, String texto) {
        return color + texto + Color.RESET;
    }
}
