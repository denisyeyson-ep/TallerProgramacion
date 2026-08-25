package com.denisyeyson.sem01.exercise;

import java.text.DecimalFormat;

public class AreaCirculo {

    protected final double PI = Math.PI;
    protected double area;
    protected double radio;

    public AreaCirculo(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        DecimalFormat df = new DecimalFormat("#.000");
        this.area = Double.parseDouble(df.format(PI * Math.pow(radio, 2)));
        return area;
    }
}
