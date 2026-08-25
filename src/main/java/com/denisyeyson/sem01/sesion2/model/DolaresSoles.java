package com.denisyeyson.sem01.sesion2.model;

public class DolaresSoles {

    protected final double TIPO_CAMBIO = 3.72;
    protected double dolares;
    protected double soles;

    public DolaresSoles() {
    }

    public double getDolares() {
        return dolares;
    }

    public void setDolares(double dolares) {
        this.dolares = dolares;
    }

    public double getSoles() {
        calcularCambio();
        return soles;
    }

    public void calcularCambio() {
        this.soles = dolares * TIPO_CAMBIO;
    }

    public String mostrarMensaje() {
        return "Tipo cambio: "+TIPO_CAMBIO+"\nDólares: " + getDolares() + "\nSoles: " + String.format("%.2f",getSoles());
    }
}
