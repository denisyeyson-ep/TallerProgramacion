package com.denisyeyson.sem03.sesion2.model;

public class OperacionBancaria {

    protected double saldoInicial;
    protected double monto;
    protected char tipoOperacion;

    public OperacionBancaria() {
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public char getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(char tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getDescripcionOperacion() {
        if (tipoOperacion == 'D') {
            return "Depósito";
        } else {
            return "Retiro";
        }
    }

    public double calcularSaldoFinal() {
        if (tipoOperacion == 'D') {
            return saldoInicial + monto;
        } else {
            return saldoInicial - monto;
        }
    }

    public String mostrarMensaje() {
        return "Operación: " + getDescripcionOperacion()
                + "\nSaldo inicial: S/ "
                + String.format("%.2f", getSaldoInicial())
                + "\nMonto de la operación: S/ "
                + String.format("%.2f", getMonto())
                + "\nSaldo final: S/ "
                + String.format("%.2f", calcularSaldoFinal());
    }
}