package com.denisyeyson.sem03.sesion2.model;

public class OperacionesMatematicas {

    protected int primerNumero;
    protected int segundoNumero;

    public OperacionesMatematicas() {
    }

    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public double calcularPotencia() {
        return Math.pow(primerNumero, segundoNumero);
    }

    public double calcularRaizCuadrada() {
        return Math.sqrt(primerNumero);
    }

    public int calcularValorAbsoluto() {
        return Math.abs(primerNumero);
    }

    public double calcularCuadrado() {
        return Math.pow(segundoNumero, 2);
    }

    public String evaluarNumeros() {

        String mensaje;

        if (primerNumero > 0) {
            if (segundoNumero > 0) {
                mensaje = "Ambos números son positivos."
                        + "\nOperación: primer número elevado al segundo."
                        + "\nResultado: "
                        + String.format("%.0f", calcularPotencia());
            } else {
                mensaje = "El primer número es positivo."
                        + "\nEl segundo número no es positivo."
                        + "\nOperación: raíz cuadrada del primer número."
                        + "\nResultado: "
                        + String.format("%.2f", calcularRaizCuadrada());
            }
        } else {
            if (segundoNumero > 0) {
                mensaje = "El primer número no es positivo."
                        + "\nEl segundo número es positivo."
                        + "\nOperación: valor absoluto del primer número."
                        + "\nResultado: "
                        + calcularValorAbsoluto();
            } else {
                mensaje = "Ninguno de los números es positivo."
                        + "\nOperación: segundo número elevado al cuadrado."
                        + "\nResultado: "
                        + String.format("%.0f", calcularCuadrado());
            }
        }
        return mensaje;
    }

    public String mostrarMensaje() {
        return "Primer número: " + getPrimerNumero()
                + "\nSegundo número: " + getSegundoNumero()
                + "\n\n" + evaluarNumeros();
    }
}