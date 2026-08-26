package com.denisyeyson.sem02.sesion2.model;

public class BoletaVenta {

    protected final double DESCUENTO_CLIENTE = 0.05;
    protected final double DESCUENTO_GAMER = 0.02;
    protected String nombreCliente;
    protected String nombreProducto1;
    protected String nombreProducto2;
    protected double precioProducto1;
    protected double precioProducto2;
    protected double importeProducto1;
    protected double importeProducto2;
    protected double subtotal;
    protected double descuentoCliente;
    protected double descuentoProductos;
    protected double descuentoGamer1;
    protected double descuentoGamer2;
    protected double baseCliente;
    protected double total;
    protected int cantidadProducto1;
    protected int cantidadProducto2;

    public BoletaVenta() {}

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNombreProducto1(String nombreProducto1) {
        this.nombreProducto1 = nombreProducto1;
    }

    public void setNombreProducto2(String nombreProducto2) {
        this.nombreProducto2 = nombreProducto2;
    }

    public void setPrecioProducto1(double precioProducto1) {
        this.precioProducto1 = precioProducto1;
    }

    public void setPrecioProducto2(double precioProducto2) {
        this.precioProducto2 = precioProducto2;
    }

    public void setCantidadProducto1(int cantidadProducto1) {
        this.cantidadProducto1 = cantidadProducto1;
    }

    public void setCantidadProducto2(int cantidadProducto2) {
        this.cantidadProducto2 = cantidadProducto2;
    }

    public void calcularImportes() {
        importeProducto1 = precioProducto1 * cantidadProducto1;
        importeProducto2 = precioProducto2 * cantidadProducto2;
        subtotal = importeProducto1 + importeProducto2;
    }

    public void calcularDescuentos() {
        descuentoGamer1 = nombreProducto1.contains("GAMER") ? importeProducto1 * DESCUENTO_GAMER : 0.0;
        descuentoGamer2 = nombreProducto2.contains("GAMER") ? importeProducto2 * DESCUENTO_GAMER : 0.0;
        descuentoProductos = descuentoGamer1 + descuentoGamer2;

        // Se obtiene la base luego de descontar los productos GAMER.
        double baseCliente = subtotal - descuentoProductos;

        // String.equals permite comprobar si el cliente es ANA o JUAN.
        boolean clientePreferente = nombreCliente.equals("ANA") || nombreCliente.equals("JUAN");
        descuentoCliente = clientePreferente ? baseCliente * DESCUENTO_CLIENTE : 0.0;
    }

    public void calcularTotal() {
        total = baseCliente - descuentoCliente;
    }

    public void procesarCompra() {
        calcularImportes();
        calcularDescuentos();
        calcularTotal();
    }

    public void imprimirBoleta() {
        System.out.println("\n############################################");
        System.out.println("                 TIENDA ABC");
        System.out.println("############################################");
        System.out.println("ID: 00000252145");
        System.out.println("\n");
        System.out.println("                COMPRAS");
        System.out.println("             AV. SÁENZ PEÑA 376");
        System.out.println("                CHICLAYO");
        System.out.println("            LOTE: B    TERM: 5268");
        System.out.println("############################################");
        System.out.println("FECHA: 07MAR22           HORA:15:35");
        System.out.printf("VEND: JUAN               CLI: %s%n", nombreCliente);
        System.out.println("############################################");
        System.out.printf("%3d  %-18s     S/. %8.2f%n", cantidadProducto1, nombreProducto1, importeProducto1);
        System.out.printf("%3d  %-18s     S/. %8.2f%n", cantidadProducto2, nombreProducto2, importeProducto2);
        System.out.println("--------------------------------------------");
        System.out.printf("%-27s S/. %10.2f%n", "SUBTOTAL:", subtotal);
        System.out.printf("%-27s S/. %10.2f%n", "DESC. GAMER:", descuentoProductos);
        System.out.printf("%-27s S/. %10.2f%n", "DESC. CLIENTE:", descuentoCliente);
        System.out.println("############################################");
        System.out.printf("%-27s S/. %10.2f%n", "PAGO TOTAL:", total);
        System.out.println("############################################");
        System.out.println("VUELVA PRONTO!");
        System.out.println("############################################");
    }
}
