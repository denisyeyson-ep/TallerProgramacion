package com.denisyeyson.sem03.sesion2.model;

public class CalcularHora {

    protected int hora;
    protected int minuto;
    protected int segundo;

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void calcularHora(){
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60) {
            segundo++;
            if (segundo == 60) {
                segundo = 0;
                minuto++;
                if (minuto == 60) {
                    minuto = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
        } else {
            System.err.println("Ingrese una hora entre 0 y 23, minutos entre 0 y 59 y segundos entre 0 y 59");
        }
    }

    public String formatearHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public String mostrarHora(){
        String horaAnterior = formatearHora();
        calcularHora();
        return "Hora: " +horaAnterior+"\nHora: " + formatearHora();
    }
}
