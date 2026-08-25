package com.denisyeyson.sem01.exercise;

public class FormulaGeneral {
    protected double a, b, c, discriminante;
    protected double[] resultado = new double[2];

    public FormulaGeneral(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        this.discriminante = Math.pow(b, 2) - 4 * a * c;
        return discriminante;
    }

    public double[] getResultado() {
        this.resultado[0] = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        this.resultado[1] = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        return resultado;
    }
}
