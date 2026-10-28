package com.denisyeyson.sem12.sesion2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReporteAlumno {
    static void main() throws IOException {

        Alumno alumno1 = new Alumno();
        alumno1.setFoto("ana.jpg");//juan.png o ana.jpg
        alumno1.setNombre("Ana");
        alumno1.setEdad(28);
        alumno1.setPractica1(20);
        alumno1.setPractica2(20);
        alumno1.setPractica3(20);
        alumno1.setExamenFinal(20);

        double promedio = (
                alumno1.getPractica1()
                        + alumno1.getPractica2()
                        + alumno1.getPractica3()
                        + alumno1.getExamenFinal()
        ) / 4.0;

        String html = """
                <!DOCTYPE html>
                <html lang="es">
                <head>
                    <meta charset="UTF-8">
                    <title>Reporte de notas</title>
                    <link rel="stylesheet" href="style.css">
                </head>
                <body>
                    <div class="contenedor-tabla">
                              <div class="titulo-tabla">Listado de notas</div>
                              <table>
                                <thead>
                                  <tr>
                                    <th>Foto</th>
                                    <th>Nombre</th>
                                    <th>Edad</th>
                                    <th>PC1</th>
                                    <th>PC2</th>
                                    <th>PC3</th>
                                    <th>EF</th>
                                    <th>PROM</th>
                                  </tr>
                                </thead>
                                <tbody>
                                  <tr>
                                    <td><img src="./img/%s" alt="Avatar de %s" class="avatar"></td>
                                    <td>%s</td>
                                    <td>%d</td>
                                    <td>%d</td>
                                    <td>%d</td>
                                    <td>%d</td>
                                    <td>%d</td>
                                    <td>%.2f</td>
                                  </tr>
                                </tbody>
                              </table>
                            </div>
                </body>
                </html>
                """.formatted(
                alumno1.getFoto(),
                alumno1.getNombre(),
                alumno1.getNombre(),
                alumno1.getEdad(),
                alumno1.getPractica1(),
                alumno1.getPractica2(),
                alumno1.getPractica3(),
                alumno1.getExamenFinal(),
                promedio
        );

        Path archivo = Path.of("src/main/java/com/denisyeyson/sem12/sesion2/reporte.html");
        Files.writeString(archivo, html);

        System.out.println("Reporte HTML generado correctamente.");
    }
}
