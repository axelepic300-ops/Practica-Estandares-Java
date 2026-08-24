package com.tienda.model;

/**
 * Representa un producto de una tienda.
 */
public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int existencia;

    /**
     * Crea un producto con todos sus datos.
     *
     * @param codigo código del producto
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param existencia cantidad disponible
     */
    public Producto(String codigo, String nombre, double precio, int existencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setExistencia(existencia);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        if (existencia > 0) {
            this.existencia = existencia;
        }
    }

    /**
     * Muestra la información del producto.
     */
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.printf("Precio: $%.2f%n", precio);
        System.out.println("Existencia: " + existencia);
        System.out.println();
    }
}