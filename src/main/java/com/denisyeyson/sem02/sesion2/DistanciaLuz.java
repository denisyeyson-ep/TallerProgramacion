package com.denisyeyson.sem02.sesion2;

public class DistanciaLuz {

    //Velocidad de la luz expresada en metros por segundo.
    protected final long VELOCIDAD_LUZ = 299792458L;

    //Cantidad de segundos que tiene un día: 60 * 60 * 24
    protected final long SEGUNDOS_POR_DIA = 86400L;

    protected long distancia;
    protected int dias;
    protected long segundos;

    public DistanciaLuz() {
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public long calcularSegundos() {
        this.segundos = dias * SEGUNDOS_POR_DIA;
        return segundos;
    }

    public long calcularDistancia() {
        this.distancia = VELOCIDAD_LUZ * calcularSegundos();
        return distancia;
    }
}
