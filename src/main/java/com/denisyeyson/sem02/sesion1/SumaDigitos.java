package com.denisyeyson.sem02.sesion1;

public class SumaDigitos {

    protected int numero,suma,d1,d2,d3;

    public SumaDigitos() {
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void sumarDigitos(){
        d1 = numero / 100;
        d2 = (numero / 10) % 10;
        d3 = numero % 10;
        suma = d1 + d2 + d3;
    }

    public void mostrarMensaje(){
        if (numero > 0 && numero < 1000){
            sumarDigitos();
            System.out.printf("\nNúmero: %d\n%d+%d+%d=%d\n", numero,d1, d2, d3, suma);
        }else{
            System.out.println("\nEl programa no soporta mas de 3 dígitos");
        }
    }
}
