package com.denisyeyson.sem03.sesion2.model;

public class CalculoRaizPotencia {

    protected int numero;

    public CalculoRaizPotencia() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double calcularRaizCuadrada() {
        return Math.sqrt(numero);
    }

    public double calcularPotenciaCubo() {
        return Math.pow(numero, 3);
    }

    public int calcularValorAbsoluto() {
        return Math.abs(numero);
    }

    public String evaluarNumero() {
        String mensaje;
        if (numero > 0) {
            mensaje = "El número es positivo." + "\nRaíz cuadrada: " + String.format("%.2f", calcularRaizCuadrada());
            if (numero % 2 == 0) {
                mensaje += "\nEl número también es par." + "\nPotencia al cubo: " + String.format("%.0f", calcularPotenciaCubo());
            }

        } else {
            mensaje = "El número no es positivo." + "\nValor absoluto: " + calcularValorAbsoluto();
        }
        return mensaje;
    }

    public String mostrarMensaje() {
        return "Número ingresado: " + getNumero() + "\n" + evaluarNumero();
    }
}