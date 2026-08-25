package com.denisyeyson.sem03.sesion2;

import com.denisyeyson.sem03.sesion2.model.AumentoSalario;

import java.util.Scanner;

public class E01_AumentoSalario {

    /**
     * Ejercicio 01:
     * El gobierno ha decretado un aumento en los salarios de los altos
     * funcionarios de acuerdo con la siguiente escala:
     * <p>
     * Sexo | Salud | Educación | Transporte
     * Masculino | 20% | 11% | 15%
     * Femenino | 25% | 12% | 20%
     * <p>
     * Los salarios actuales son:
     * - Salud (S/.15000)
     * - Educación (S/.12000)
     * - Transporte (S/. 18000)
     * <p>
     * Escribir un programa en Java que solicite el sexo y sector de un
     * funcionario y calcule el monto que recibirá luego de aplicado el aumento.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        AumentoSalario salario = new AumentoSalario();

        System.out.println("AUMENTO DE SALARIO:");

        System.out.print("Ingrese sexo Masculino(M), Femenino(F) -> ");
        salario.setSexo(teclado.nextLine().toUpperCase().charAt(0));

        System.out.println("Ingrese el sector de la empresa");
        System.out.println(" E: Educación");
        System.out.println(" S: Salud");
        System.out.println(" T: Transporte");
        salario.setSector(teclado.nextLine().toUpperCase().charAt(0));

        System.out.println("\n" + salario.mostrarMensaje());

        teclado.close();
    }
}
