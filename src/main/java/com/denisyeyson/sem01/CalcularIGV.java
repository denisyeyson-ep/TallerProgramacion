package com.denisyeyson.sem01;

public class CalcularIGV {

    protected final double IGV = 18;
    protected double montoTotal;
    protected double montoIgv;
    protected double montoNeto;

    public CalcularIGV(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoIgv() {
        this.montoIgv = montoTotal * IGV / 100;
        return montoIgv;
    }

    public double getMontoNeto() {
        this.montoNeto = montoTotal - montoIgv;
        return montoNeto;
    }
}
