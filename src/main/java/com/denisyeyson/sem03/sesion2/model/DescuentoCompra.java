package com.denisyeyson.sem03.sesion2.model;

public class DescuentoCompra {

    protected double importeCompra;

    public DescuentoCompra() {
    }

    public double getImporteCompra() {
        return importeCompra;
    }

    public void setImporteCompra(double importeCompra) {
        this.importeCompra = importeCompra;
    }

    public double calcularPorcentajeDescuento() {
        if (importeCompra >= 200) {
            return 0.15;
        } else {
            return 0.05;
        }
    }

    public double calcularDescuento() {
        return importeCompra * calcularPorcentajeDescuento();
    }

    public double calcularTotalPagar() {
        return importeCompra - calcularDescuento();
    }

    public String mostrarMensaje() {
        return "Importe de compra: S/ " + String.format("%.2f", getImporteCompra())
                + "\nDescuento aplicado: "
                + String.format("%.0f", calcularPorcentajeDescuento() * 100)
                + "%"
                + "\nMonto descontado: S/ "
                + String.format("%.2f", calcularDescuento())
                + "\nTotal a pagar: S/ "
                + String.format("%.2f", calcularTotalPagar());
    }
}