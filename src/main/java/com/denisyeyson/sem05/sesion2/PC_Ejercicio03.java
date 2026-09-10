package com.denisyeyson.sem05.sesion2;

import java.util.Scanner;

public class PC_Ejercicio03 {

    /**
     * <b><i>Practica 01: Ejercicio 03</i></b><br>
     * El departamento de Tecnologías de Información de una empresa municipal de agua necesita
     * automatizar el cálculo de la facturación mensual de sus usuarios. El importe que debe pagar cada
     * usuario depende de la cantidad de metros cúbicos de agua consumidos y de la categoría asignada. La
     * asignación de tarifas se realiza de acuerdo con el siguiente cuadro:
     * <table>
     *     <tr>
     *         <th>Código de categoría</th>
     *         <th>Nombre de categoría</th>
     *         <th>Precio por m³</th>
     *     </tr>
     *     <tr>
     *         <td>1</td>
     *         <td>Social</td>
     *         <td>S/ 0.15</td>
     *     </tr>
     *     <tr>
     *         <td>2</td>
     *         <td>Doméstica</td>
     *         <td>S/ 0.28</td>
     *     </tr>
     *     <tr>
     *         <td>3</td>
     *         <td>Comercial</td>
     *         <td>S/ 0.45</td>
     *     </tr>
     *     <tr>
     *         <td>4</td>
     *         <td>Industrial</td>
     *         <td>S/ 0.60</td>
     *     </tr>
     * </table>
     * Desarrolle un programa en Java que solicite mediante la clase Scanner el código de la categoría y la
     * cantidad de metros cúbicos consumidos durante el mes. Se debe calcular el importe total del servicio,
     * mediante la fórmula: Importe total = consumo en m3 × tarifa por m3.
     *
     * <ul>
     *     <li>Si el usuario ingresa un código diferente de 1, 2, 3 o 4, mostrar: “CATEGORÍA NO VÁLIDA” y no deberá realizar el cálculo.</li>
     *     <li>Si la cantidad de metros cúbicos ingresada es negativa, mostrar: “CONSUMO NO VÁLIDO”.</li>
     * </ul>
     * Finalmente, el programa deberá mostrar el código de la categoría, nombre de la categoría,
     * cantidad de metros cúbicos consumidos, tarifa por metro cúbico y total a pagar.
     *
     */
    static void main() {
        Scanner entrada = new Scanner(System.in);
        String nombreCategoria;
        double tarifa;

        IO.print("""
                +-----------------------------------------------------------+
                | Código de categoría | Nombre de categoría | Precio por m³ |
                |---------------------|---------------------|---------------|
                | 1                   | Social              | S/ 0.15       |
                | 2                   | Doméstica           | S/ 0.28       |
                | 3                   | Comercial           | S/ 0.45       |
                | 4                   | Industrial          | S/ 0.60       |
                +-----------------------------------------------------------+
               
                Ingrese el código de la categoria del trabajador:\s""");
        if (!entrada.hasNextByte()) {
            System.err.println("Error: Debe ingresar un número entero.");
            entrada.close();
            return;
        }
        byte categoria = entrada.nextByte();

        switch (categoria) {
            case 1 -> {
                nombreCategoria = "Social";
                tarifa = 0.15;
            }
            case 2 -> {
                nombreCategoria = "Doméstica";
                tarifa = 0.28;
            }
            case 3 -> {
                nombreCategoria = "Comercial";
                tarifa = 0.45;
            }
            case 4 -> {
                nombreCategoria = "Industrial";
                tarifa = 0.60;
            }
            default -> {
                System.err.println("CATEGORÍA NO VÁLIDA");
                return;
            }
        }

        IO.print("Ingrese la cantidad de metros cúbicos consumidos: ");
        if (!entrada.hasNextDouble()) {
            System.err.println("Error: Debe ingresar un valor numérico.");
            entrada.close();
            return;
        }
        double consumo = entrada.nextDouble();

        if (consumo < 0) {
            System.err.println("CONSUMO NO VÁLIDO");
            entrada.close();
            return;
        }

        double total = consumo * tarifa;

        IO.println("""
                
                Código de categoría         : %d
                Nombre de categoría         : %s
                Cantidad de m³ consumidos   : %.2f
                Tarifa por metro cúbico     : S/ %.2f
                Total a pagar               : S/ %.2f
                """.formatted(categoria, nombreCategoria, consumo, tarifa, total));
        entrada.close();
    }
}