package com.denisyeyson.sem03.sesion2;

import com.denisyeyson.sem03.sesion2.model.OperacionBancaria;

import java.util.Scanner;

public class TA02_OperacionBancaria {

    /**
     * Ejercicio 02:
     * Solicitar datos diferentes según el usuario realice
     * un depósito o un retiro.
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        OperacionBancaria operacion = new OperacionBancaria();

        System.out.println("OPERACIÓN BANCARIA");

        System.out.print("Ingrese el saldo inicial → ");
        operacion.setSaldoInicial(teclado.nextDouble());

        System.out.print("Ingrese operación: depósito o retiro (D/R) → ");
        operacion.setTipoOperacion(teclado.next().toUpperCase().charAt(0));

        if (operacion.getTipoOperacion() == 'D') {//Deposito
            System.out.print("Ingrese el monto que desea depositar → ");
            operacion.setMonto(teclado.nextDouble());
        } else {//Retiro
            System.out.print("Ingrese el monto que desea retirar → ");
            operacion.setMonto(teclado.nextDouble());
        }

        System.out.println("\n" + operacion.mostrarMensaje());

        teclado.close();
    }
}