package com.denisyeyson.sem03.sesion2.model;

public class NumeroPositivoPar {

    protected int numero;

    public NumeroPositivoPar() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String evaluarNumero() {
        String mensaje = "El número no cumple ambas condiciones.";
        if (numero > 0) {
            if (numero % 2 == 0) {
                int cuadrado = numero * numero;
                mensaje = "El número es positivo y par." + "\nSu cuadrado es: " + cuadrado;
            }
        }
        return mensaje;
    }

    public String mostrarMensaje() {
        return "Número ingresado: " + getNumero() + "\n" + evaluarNumero();
    }
}