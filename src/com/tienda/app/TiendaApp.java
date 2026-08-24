package com.tienda.app;

import com.tienda.model.Producto;
import java.util.ArrayList;

public class TiendaApp {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        Producto producto1 = new Producto("P001", "Laptop", 15000.00, 10);
        Producto producto2 = new Producto("P002", "Mouse", 350.00, 25);
        Producto producto3 = new Producto("P003", "Teclado", 750.00, 15);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }
    }
}