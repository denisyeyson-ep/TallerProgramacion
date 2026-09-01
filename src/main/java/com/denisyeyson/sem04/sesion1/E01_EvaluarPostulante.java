package com.denisyeyson.sem04.sesion1;

import java.util.Scanner;

public class E01_EvaluarPostulante {

    /**
     * Ejercicio 01:
     * La evaluación de un postulante a un puesto de trabajo resulta en una puntuación entre 0 y 10.
     * Se desea mostrar una descripción de la evaluación alcanzada de acuerdo con los siguientes criterios:
     * 0-4 → descartado
     * 5 → en suspenso
     * 6 → aceptable
     * 7,8 → notable
     * 9, 10 → sobresaliente
     * Escriba un programa que solicite la puntuación de un candidato y muestre la descripción que le corresponda.
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        //Utilizo el tipo Byte porque el rango de valores es de [-128, 127], por lo tanto, no es necesario utilizar un tipo entero
        int puntuacion;
        //En esta variable almacenaremos la descripcion de la evaluación, según el rango de valores
        String descripcionEvaluacion;

        System.out.println("EJERCICIO - EVALUACIÓN DE POSTULANTE:");
        System.out.print("Ingrese la puntuación del candidato (0-10): ");
        puntuacion = entrada.nextInt();

        if(puntuacion >= 0 && puntuacion <= 10) {
            //Evaluamos según el rango de valores
            descripcionEvaluacion = switch (puntuacion){
                case 0,1,2,3,4 -> "Descartado";
                case 5 -> "En suspenso";
                case 6 -> "Aceptable";
                case 7, 8 -> "Notable";
                case 9, 10 -> "Sobresaliente";
                default -> "Puntuación no valida";
            };

            System.out.printf("""
                Resultado:
                Puntuación\t: %d
                Descripción\t: %s
                """,puntuacion, descripcionEvaluacion);
        }else{
            System.err.println("Error, solo se aceptan valores entre 0 y 10.");
        }

        entrada.close();
    }
}
