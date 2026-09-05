package com.denisyeyson.sem05.sesion1;

import java.util.Scanner;

public class E02_sdf {

    static void main() {
        Scanner entrada = new Scanner(System.in);

        IO.print("""
                +-----------------------+-------------------+
                | Marca Celular         | Plan (S/)         |
                +-----------------------+-------------------+
                | 1. Motorola           |             29.90 |
                | 2. LG                 |             36.00 |
                | 3. Samsung            |             46.80 |
                | 4. Huawei             |             62.00 |
                | 5. iPhone             |             71.00 |
                +-----------------------+-------------------+
                \n
                Ingrese la opción de la marca de celular:\s""");

        if(!(entrada.hasNextByte())){
            System.err.println("Opción inválida, escoja una opción válida");
            return;
        }
        byte opcionMarca = entrada.nextByte();

        IO.print("""
                +-----------------------------------------+
                |       PLAZOS DE PAGO CON PROMOCIÓN      |
                +--------------+--------------+-----------+
                |   Opción 1   |  A  6 meses  |   13.2%   |
                +---------------+---------------+---------+
                |   Opción 2   |  A 12 meses  |   12.0%   |
                +---------------+---------------+---------+
                |   Opción 3   |  A 18 meses  |   11.2%   |
                +---------------+---------------+---------+
                \n
                Ingrese la opción de plazo de pago:\s""");
        if(!(entrada.hasNextByte())){
            System.err.println("Opción inválida, escoja una opción válida");
            return;
        }
        byte opcionPlazo = entrada.nextByte();

        System.out.println(opcionMarca+" "+opcionPlazo);
        entrada.close();
    }
}
