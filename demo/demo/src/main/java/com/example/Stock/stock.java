package com.example.Stock;
import com.example.producto.producto;

import java.util.HashMap;
import java.util.Map;


public class stock {
    private final Map<producto,Integer> productos;

    public stock() {
        productos = new HashMap<>();
    }

    public boolean AddProducto(producto producto){
        if (producto == null){
            return false;
        }
        for (producto existingProducto : productos.keySet()){
            if (existingProducto.getName().equals(producto.getName())){
                return false;
            }
            else{
                return true;
            }
        }
        productos.put(producto, 1);
        return true;

    }


    public boolean modificarProducto(producto producto, int cantidad) {
        if (producto == null || !productos.containsKey(producto) || cantidad < 0) {
            return false;
        }
        productos.put(producto, cantidad);
        notificarAgentes(producto, cantidad);
        return true;
    }

    private void notificarAgentes(producto producto, int cantidad) {
        System.out.println("Unidades disponibles de " + producto.getName() + ": " + cantidad);

        if (cantidad < 5) {
            System.out.println("Alerta: menos de 5 unidades disponibles para " + producto.getName());
        }
    }

    public Map<producto, Integer> getProductos() {
        return productos;
    }

}