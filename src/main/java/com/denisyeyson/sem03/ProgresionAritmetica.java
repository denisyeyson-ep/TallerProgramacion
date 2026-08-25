package com.denisyeyson.sem03;

public class ProgresionAritmetica {

    protected int numero_1, numero_2, numero_3;

    public ProgresionAritmetica() {
    }

    /*
    public ProgresionAritmetica(int numero_1, int numero_2, int numero_3) {
        this.numero_1 = numero_1;
        this.numero_2 = numero_2;
        this.numero_3 = numero_3;
    }
    */

    public int getNumero_1() {
        return numero_1;
    }

    public void setNumero_1(int numero_1) {
        this.numero_1 = numero_1;
    }

    public int getNumero_2() {
        return numero_2;
    }

    public void setNumero_2(int numero_2) {
        this.numero_2 = numero_2;
    }

    public int getNumero_3() {
        return numero_3;
    }

    public void setNumero_3(int numero_3) {
        this.numero_3 = numero_3;
    }

    /**
     * Verifica si tres números forman una progresión aritmética.
     * Una progresión aritmética se caracteriza porque la diferencia entre el segundo y el primer número
     * es igual a la diferencia entre el tercer y el segundo número.
     *
     * @return true si los números forman una progresión aritmética, false en caso contrario.
     */
    public boolean esProgresiva() {
        return (numero_2 - numero_1) == (numero_3 - numero_2);
    }

    public String mostrarResultado() {
        return "Número 1: " + getNumero_1() + "\nNúmero 2: " + getNumero_2() + "\nNúmero 3: " + getNumero_3() + "\n" + (esProgresiva() ? "Los números están en progresión aritmética." : "Los números NO están en progresión aritmética.");
    }
}
