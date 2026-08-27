package com.denisyeyson.sem03.sesion2;

import com.denisyeyson.sem03.sesion2.model.ResultadoEvaluacion;

import java.util.Scanner;

public class T03_ResultadoEvaluacion {

    /**
     * Ejercicio 03:
     * Mostrar si un estudiante está aprobado o desaprobado
     * según la nota obtenida.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        ResultadoEvaluacion evaluacion = new ResultadoEvaluacion();

        System.out.println("RESULTADO DE EVALUACIÓN:");

        System.out.print("Ingrese el nombre del estudiante → ");
        evaluacion.setNombreEstudiante(teclado.nextLine());

        System.out.print("Ingrese la nota obtenida → ");
        evaluacion.setNota(teclado.nextDouble());

        System.out.println("\n" + evaluacion.mostrarResultado());

        teclado.close();
    }
}