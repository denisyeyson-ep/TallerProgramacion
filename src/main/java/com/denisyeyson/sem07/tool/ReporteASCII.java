package com.denisyeyson.sem07.tool;

public class ReporteASCII {
    public int anchoMaximo;
    public final int DERECHA = 0;
    public final int CENTRADO = 1;
    public final int IZQUIERDA = 2;

    public ReporteASCII(int anchoMaximo) {
        this.anchoMaximo = anchoMaximo;
    }

    public void imprimirBorde() {
        System.out.println("+" + "-".repeat(anchoMaximo - 2) + "+");
    }

    /**
     * Se utiliza para centrar el texto en el reporte ASCII.
     *
     * @param texto     Del texto ingresado se calculará cuantos caracteres contiene para agregar los espacios necesarios
     * @param posicion: Según el valor de la variable posición, se puede centrar el texto a la derecha, centrado o a la izquierda.
     */
    public void imprimirContenido(String texto, int posicion) {
        String mensaje = "";
        if (posicion == 0) {//texto a la derecha
            mensaje = "| " + texto + " ".repeat(anchoMaximo - texto.length() - 3) + "|";
        }
        if (posicion == 1) {//texto centrado
            mensaje = "|" + " ".repeat((anchoMaximo - texto.length() - 2) / 2) + texto + " ".repeat((anchoMaximo - texto.length() - 2) / 2) + "|";
        }
        if (posicion == 2) {//texto a la izquierda
            mensaje = "|" + " ".repeat(anchoMaximo - texto.length() - 3) + texto + " |";
        }
        System.out.println(mensaje);
    }

    public void imprimirContenido(String texto1, int posicion1, String texto2, int posicion2, String separador) {
        String mensaje = "";
        if (posicion1 == 0 && posicion2 == 0) {//texto a la derecha
            mensaje = "| " + texto1 + " ".repeat((anchoMaximo / 2) - texto1.length() - 2) + separador + texto2 + " ".repeat((anchoMaximo / 2) - texto2.length() - 2) + " |";
        }
        if (posicion1 == 1 && posicion2 == 1) {//texto centrado
            mensaje = "|" + " ".repeat(((anchoMaximo / 2 - texto1.length()) / 2) + 1) + texto1 + " ".repeat(((anchoMaximo / 2 - texto1.length() - 1) / 2)-1) + separador +
                    " ".repeat(((anchoMaximo / 2 - texto2.length() - 1) / 2) - 1) + texto2 + " ".repeat(((anchoMaximo / 2 - texto2.length() - 1) / 2) + 1) + "|";
        }
        if (posicion1 == 2 && posicion2 == 2) {//texto a la izquierda
            mensaje = "| " + " ".repeat((anchoMaximo / 2) - texto1.length() - 2) + texto1 + separador + " ".repeat((anchoMaximo / 2) - texto2.length() - 2) + texto2 + " |";
        }
        if (posicion1 == 0 && posicion2 == 2) {
            mensaje = "| " + texto1 + " ".repeat((anchoMaximo / 2) - texto1.length() - 2) + separador + " ".repeat((anchoMaximo / 2) - texto2.length() - 2) + texto2 + " |";
        }
        System.out.println(mensaje);
    }
}
