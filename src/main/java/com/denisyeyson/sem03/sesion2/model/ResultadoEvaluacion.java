package com.denisyeyson.sem03.sesion2.model;

public class ResultadoEvaluacion {

    protected String nombreEstudiante;
    protected double nota;

    public ResultadoEvaluacion() {
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean estaAprobado() {
        return nota >= 12;
    }

    public String mostrarResultado() {
        if (estaAprobado()) {
            return "Estudiante: " + getNombreEstudiante() + "\nNota obtenida: " + getNota() + "\nResultado: APROBADO";
        } else {
            return "Estudiante: " + getNombreEstudiante() + "\nNota obtenida: " + getNota() + "\nResultado: DESAPROBADO";
        }
    }
}