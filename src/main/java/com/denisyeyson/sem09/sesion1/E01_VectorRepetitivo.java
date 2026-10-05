package com.denisyeyson.sem09.sesion1;

import java.util.Arrays;
import java.util.Scanner;

public class E01_VectorRepetitivo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        final int VALOR_MAXIMO = 99;

        System.out.print("Ingrese la cantidad de números enteros a generar: ");
        int cantidadMaxima = sc.nextInt();

        StringBuilder listaNumerosWhile = new StringBuilder();
        StringBuilder listaNumerosDoWhile = new StringBuilder();
        StringBuilder listaNumerosFor = new StringBuilder();

        int[] vectorWhile = new int[cantidadMaxima];
        int[] vectorDoWhile = new int[cantidadMaxima];
        int[] vectorFor = new int[cantidadMaxima];

        int sumNumWhile = 0, sumNumDoWhile = 0, sumNumFor = 0;

        //Usando estructura repetitiva WHILE
        int contadorWhile = 0;
        while (contadorWhile < cantidadMaxima) {
            vectorWhile[contadorWhile] = (int) (Math.random() * VALOR_MAXIMO) + 1;
            sumNumWhile += vectorWhile[contadorWhile];
            contadorWhile++;
        }

        //Usando estructura repetitiva DO-WHILE
        int contadorDoWhile = 0;
        do {
            vectorDoWhile[contadorDoWhile] = (int) (Math.random() * VALOR_MAXIMO) + 1;
            sumNumDoWhile += vectorDoWhile[contadorDoWhile];
            contadorDoWhile++;
        }
        while (contadorDoWhile < cantidadMaxima);

        //Usando estructura FOR
        for (int i = 0; i < cantidadMaxima; i++) {
            vectorFor[i] = (int) (Math.random() * VALOR_MAXIMO) + 1;
            sumNumFor += vectorFor[i];
        }

        Arrays.stream(vectorWhile).forEach(e -> listaNumerosWhile.append(String.format("%02d, ", e)));
        Arrays.stream(vectorDoWhile).forEach(e -> listaNumerosDoWhile.append(String.format("%02d, ", e)));
        Arrays.stream(vectorFor).forEach(e -> listaNumerosFor.append(String.format("%02d, ", e)));

        System.out.printf("\nUsando WHILE:\n[%s\b\b]\nSumatoria -> %d\n", listaNumerosWhile, sumNumWhile);
        System.out.printf("\nUsando DO-WHILE:\n[%s\b\b]\nSumatoria -> %d\n", listaNumerosDoWhile, sumNumDoWhile);
        System.out.printf("\nUsando FOR:\n[%s\b\b]\nSumatoria -> %d\n", listaNumerosFor, sumNumFor);
    }
}
