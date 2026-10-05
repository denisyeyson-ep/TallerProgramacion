package com.denisyeyson.sem09.sesion2;

import com.denisyeyson.sem09.sesion2.model.Boleta;
import com.denisyeyson.sem09.sesion2.model.Producto;

import java.util.List;

public class E02_ReporteBoleta {
    static void main() {
        Boleta boleta = new Boleta();
        boleta.setRuc("21521458563");
        boleta.setDireccion("Chiclayo-Perú");
        boleta.setCajero("MARIA MENDOZA");
        boleta.setProductos(getProductos());
        boleta.setCliente("CARLOS PEREZ");

        StringBuilder reporte = new StringBuilder();
        reporte.append(String.format("""
                           TIENDA ABC
                
                        RUC: %s
                         %s
                
                CAJERO: %s
                """, boleta.getRuc(), boleta.getDireccion(), boleta.getCajero()));
        for (Producto producto : boleta.getProductos()) {
            reporte.append(String.format("""
                    %-13s %s
                    %14s%02d  x %5.2f %7.2f
                    """, producto.getCodigo(), producto.getNombre(), "", producto.getCantidad(), producto.getPrecioUnit(), producto.getSubtotal()));
        }

        reporte.append(String.format("""
                
                OP. GRAVADA     : %14.2f
                IGV             : %14.2f
                IMPORTE TOTAL   : %14.2f%n
                %s
                CLIENTE: %s
                %s
                """, boleta.getOperacionGravada(), boleta.getIgv(), boleta.getImporteTotal(), "-".repeat(32), boleta.getCliente(), "-".repeat(32)));

        System.out.print(reporte);
    }

    private static List<Producto> getProductos() {
        Producto producto1 = new Producto("7754125852147", "DETERGENTE ULTRA", 6, 3.25);
        Producto producto2 = new Producto("7456456454564", "JAM.PIZZA", 2, 12.90);
        Producto producto3 = new Producto("7796525415", "LECHE EN CAJA", 12, 30.50);
        return List.of(producto1, producto2, producto3);
    }
}
