package com.denisyeyson.sem01.sesion2.model;

public class CalcularIGV {

    protected final double IGV = 18;
    protected double montoTotal;
    protected double montoIgv;
    protected double montoNeto;

    public CalcularIGV() {
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
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

    public String mostrarMensaje() {
        return "IGV: " + getMontoIgv() + "\nMonto neto: " + getMontoNeto()+"\nMonto a pagar: " + getMontoTotal();
    }
}
