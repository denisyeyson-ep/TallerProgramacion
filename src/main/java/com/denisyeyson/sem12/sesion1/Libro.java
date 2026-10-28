package com.denisyeyson.sem12.sesion1;

public class Libro {

    private String título;
    private String autor;
    private int stock;
    public String ISBN;
    private double precio;

    public Libro() {
    }

    public Libro(String título, String autor, int stock, String ISBN, double precio) {
        this.título = título;
        this.autor = autor;
        this.stock = stock;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "título='" + título + '\'' +
                ", autor='" + autor + '\'' +
                ", stock=" + stock +
                ", ISBN='" + ISBN + '\'' +
                ", precio=" + precio +
                '}';
    }
}
