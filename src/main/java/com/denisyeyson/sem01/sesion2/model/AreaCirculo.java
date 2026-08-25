package com.denisyeyson.sem01.sesion2.model;

import java.text.DecimalFormat;

public class AreaCirculo {

    protected final double PI = Math.PI;
    protected double area;
    protected double radio;

    public AreaCirculo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Evalúa el área del círculo.
     *
     * @return Retorna el área del círculo en centímetros cuadrados.
     */
    public double getArea() {
        DecimalFormat df = new DecimalFormat("#.000");
        this.area = Double.parseDouble(df.format(PI * Math.pow(radio, 2)));
        return area;
    }

    public String mostrarMensaje() {
        return "El área del circulo con radio de " + getRadio() + " cm. es: " + getArea() + " cm².";
    }
}
