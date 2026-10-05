package com.denisyeyson.sem09.sesion2;

import java.util.List;

public class E01_ArreglosParalelos {
    static void main() {

        List<Estudiante> estudiantes = getEstudiantes();
        double promedioTotal = estudiantes.stream().mapToDouble(Estudiante::promedio).average().orElse(0.0);

        String separador = "#".repeat(58);

        System.out.println("#".repeat(20)+" REPORTE DE NOTAS "+"#".repeat(20));
        System.out.printf("%-25s %5s %5s %3s %3s %3s %2s %5s%n", "NOMBRE", "EDAD", "GRADO", "PC1", "PC2", "PC3", "EF", "PROM");
        System.out.println(separador);

        estudiantes.forEach(e -> System.out.printf("%-25.25s %5d %5d %3d %3d %3d %2d %5.2f%n",
                e.nombres() + " " + e.apellidos(),
                e.edad(),
                e.grado(),
                e.notaPC1(),
                e.notaPC2(),
                e.notaPC3(),
                e.notaEF(),
                e.promedio()
        ));

        System.out.println(separador);
        System.out.printf("PROMEDIO TOTAL: %42.2f\n", promedioTotal);
        System.out.println(separador);
    }

    static List<Estudiante> getEstudiantes() {
        Estudiante est1 = new Estudiante("JUAN CARLOS", "GARCIA RODRIGUEZ", 19, 5, 20, 19, 15, 17);
        Estudiante est2 = new Estudiante("ANA MARIELA", "TORRES MONTEZ", 25, 5, 20, 17, 18, 16);
        Estudiante est3 = new Estudiante("ROSA", "INOÑAN FARRO", 22, 4, 20, 18, 12, 13);
        Estudiante est4 = new Estudiante("CARLOS ALBERTO", "ROJAS CHANG", 24, 5, 16, 18, 15, 12);
        Estudiante est5 = new Estudiante("GABRIELA LUCIA", "ALVITES CHANG", 25, 5, 20, 20, 14, 15);
        return List.of(est1, est2, est3, est4, est5);
    }

    record Estudiante(String nombres, String apellidos, int edad, int grado, int notaPC1, int notaPC2,
                             int notaPC3, int notaEF) {
        public double promedio() {
            return (notaPC1 + notaPC2 + notaPC3 + notaEF) / 4.0;
        }
    }
}
