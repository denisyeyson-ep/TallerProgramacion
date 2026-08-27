package com.denisyeyson.sem03.sesion2.model;

public class CalculoNumero {

    protected int numero;

    public CalculoNumero() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String calcularResultado() {
        String mensaje = "El número debe ser positivo.";

        if (numero > 0) {
            if (numero % 2 == 0) {
                double mitad = numero / 2.0;
                mensaje = "El número es positivo y par." + "\nSu mitad es: " + mitad;
            } else {
                int triple = numero * 3;
                mensaje = "El número es positivo e impar." + "\nSu triple es: " + triple;
            }
        }
        return mensaje;
    }

    public String mostrarMensaje() {
        return "Número ingresado: " + getNumero() + "\n" + calcularResultado();
    }
}