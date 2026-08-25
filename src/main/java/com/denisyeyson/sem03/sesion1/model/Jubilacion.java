package com.denisyeyson.sem03.sesion1.model;

public class Jubilacion {

    protected char sexo;
    protected int edad;

    public Jubilacion() {
    }

    /*
    public Jubilacion(char sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }
    */

    public char getSexo() {
        return sexo;
    }

    public String getSexoDescripcion() {
        return sexo == 'M' ? "Masculino" : "Femenino";
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Determina si una persona es jubilada.
     *
     * @return true si es jubilada, false en caso contrario.
     */
    public boolean esJubilado() {
        return sexo == 'M' && edad >= 65 || sexo == 'F' && edad >= 60;
    }

    public String mostrarMensaje() {
        return "Edad: " + getEdad() + "\nSexo:" + getSexoDescripcion() + "(" + getSexo() + ")\n" + (esJubilado() ? "La persona puede jubilarse." : "La persona no puede jubilarse.");
    }
}
