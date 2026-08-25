package com.denisyeyson.sem01.sesion2.model;

public class FormulaGeneral {
    protected double a, b, c, discriminante;
    protected double[] resultado = new double[2];

    public FormulaGeneral() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    /**
     * Obtiene el valor de la discriminante
     * @return discriminante
     */
    public double getDiscriminante() {
        this.discriminante = Math.pow(b, 2) - 4 * a * c;
        return discriminante;
    }

    /**
     * Obtiene los valores de x1 y x2
     * @return resultado
     */
    public double[] getResultado() {
        this.resultado[0] = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        this.resultado[1] = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        return resultado;
    }

    public String mostrarMensaje(){
        return "Valor de A: "+getA()+"\nValor de B: "+getB()+"\nValor de C: "+getC()+"\nEl valor de discriminante es: " + getDiscriminante()+"\n"+(getDiscriminante() > 0 ? "Los valores de x son: " + getResultado()[0] + " y " + getResultado()[1] : "No existen soluciones reales");
    }
}
