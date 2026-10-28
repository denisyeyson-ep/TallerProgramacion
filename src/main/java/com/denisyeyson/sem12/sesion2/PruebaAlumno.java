package com.denisyeyson.sem12.sesion2;

public class PruebaAlumno {

    static void main() {
        Alumno alumno1 = new Alumno();
        alumno1.setFoto("D://Galeria/foto.jpg");
        alumno1.setNombre("Andres Guzman");
        alumno1.setEdad(28);
        alumno1.setPractica1(20);
        alumno1.setPractica2(20);
        alumno1.setPractica3(20);
        alumno1.setExamenFinal(20);

        System.out.println(alumno1);
    }
}
