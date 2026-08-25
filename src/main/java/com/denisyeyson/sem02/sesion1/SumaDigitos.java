package com.denisyeyson.sem02.sesion1;

public class SumaDigitos {

    protected int numero;
    protected int suma;

    public SumaDigitos() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int sumarDigitos(){
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }


}
