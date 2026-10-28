package com.denisyeyson.sem12.sesion1;

public class Cancion {

    private String nombre;
    private String cantante;
    private String genero;
    private int duracion;

    public Cancion() {
    }

    public Cancion(String nombre, String cantante, String genero, int duracion) {
        this.nombre = nombre;
        this.cantante = cantante;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", cantante='" + cantante + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion='" + duracion + '\'' +
                '}';
    }
}
