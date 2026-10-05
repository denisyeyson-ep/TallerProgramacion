package com.denisyeyson.sem09.sesion2.model;

import java.util.List;

public class Boleta {
    String ruc;
    String direccion;
    String cajero;
    List<Producto> productos;
    double operacionGravada;
    double igv;
    double importeTotal;
    String cliente;

    public Boleta() {
    }

    public Boleta(String ruc, String direccion, String cajero, List<Producto> productos, double operacionGravada, double igv, double importeTotal, String cliente) {
        this.ruc = ruc;
        this.direccion = direccion;
        this.cajero = cajero;
        this.productos = productos;
        this.operacionGravada = operacionGravada;
        this.igv = igv;
        this.importeTotal = importeTotal;
        this.cliente = cliente;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getOperacionGravada() {
        operacionGravada = productos.stream().mapToDouble(Producto::getSubtotal).sum();
        return operacionGravada;
    }

    public void setOperacionGravada(double operacionGravada) {
        this.operacionGravada = operacionGravada;
    }

    public double getIgv() {
        igv = operacionGravada * 0.18;
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getImporteTotal() {
        importeTotal = operacionGravada + igv;
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}

