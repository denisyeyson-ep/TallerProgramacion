package com.denisyeyson.sem01.sesion2.model;

public class CentigradosFahrenheit {

    protected double centigrados;
    protected double fahrenheit;

    public CentigradosFahrenheit() {
    }

    public double getCentigrados() {
        return centigrados;
    }

    public void setCentigrados(double centigrados) {
        this.centigrados = centigrados;
    }

    public double getFahrenheit() {
        convertirCentigradosAFahrenheit();
        return fahrenheit;
    }

    public void convertirCentigradosAFahrenheit() {
        this.fahrenheit = (centigrados * 9 / 5) + 32;
    }

    public String mostrarMensaje(){
        return "Centígrados: " + getCentigrados() + "\nFahrenheit: " + getFahrenheit();
    }

}
