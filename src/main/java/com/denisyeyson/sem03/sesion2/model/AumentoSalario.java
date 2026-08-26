package com.denisyeyson.sem03.sesion2.model;

public class AumentoSalario {

    private final double SALARIO_SALUD = 15000;
    private final double SALARIO_EDUCACION = 12000;
    private final double SALARIO_TRANSPORTE = 18000;
    protected char sexo;
    protected char sector;

    public AumentoSalario() {
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getSexoDescripcion() {
        return sexo == 'M' ? "Masculino" : "Femenino";
    }

    public char getSector() {
        return sector;
    }

    public void setSector(char sector) {
        this.sector = sector;
    }

    public double getSalarioSector() {
        return switch (sector) {
            case 'S' -> SALARIO_SALUD;
            case 'E' -> SALARIO_EDUCACION;
            case 'T' -> SALARIO_TRANSPORTE;
            default -> -1;
        };
    }

    public String getSectorDescripcion() {
        return switch (sector) {
            case 'S' -> "Salud";
            case 'E' -> "Educación";
            case 'T' -> "Transporte";
            default -> "Otro";
        };
    }

    public double calcularAumento(char sexo, char sector) {
        if (sector == 'S') {
            return SALARIO_SALUD * (sexo == 'M' ? 1.20 : 1.25);
        } else if (sector == 'E') {
            return SALARIO_EDUCACION * (sexo == 'M' ? 1.11 : 1.12);
        } else if (sector == 'T') {
            return SALARIO_TRANSPORTE * (sexo == 'M' ? 1.15 : 1.20);
        } else {
            return -1;
        }
    }

    public void mostrarMensaje() {
        System.out.println("\nSexo: " + getSexoDescripcion() + "(" + getSexo()
                        + ")\nSector: " + getSectorDescripcion() + "(" + getSector()
                        + ")\nSalario: " + getSalarioSector()
                        + "\nAumento: " + (calcularAumento(getSexo(), getSector()) - getSalarioSector())
                        + "\nSalario a pagar: " + calcularAumento(getSexo(), getSector()));
    }
}
