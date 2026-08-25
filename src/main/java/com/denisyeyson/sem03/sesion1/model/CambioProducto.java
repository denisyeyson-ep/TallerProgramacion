package com.denisyeyson.sem03.sesion1.model;

public class CambioProducto {
    protected double precioProducto;
    protected int numeroDia;

    public CambioProducto() {
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getNumeroDia() {
        return numeroDia;
    }

    public String getNumeroDiaDescripcion() {
        return switch (numeroDia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Dia no valido";
        };
    }

    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }

    /**
     * Determina si el producto debe procede el cambio.
     *
     * @return true si procede el cambio, false en caso contrario.
     */
    public boolean procedeCambio() {
        return ((precioProducto >= 50 && precioProducto <= 80)
                && numeroDia == 1)
                || (precioProducto >= 120
                && numeroDia != 3
                && numeroDia != 4);
    }

    public String mostrarMensaje() {
        return "Día: " + getNumeroDia() + "-" + getNumeroDiaDescripcion() + "\nPrecio: " + getPrecioProducto() + "\n" + (procedeCambio() ? "Procede el cambio del producto." : "No procede el cambio del producto.");
    }
}
