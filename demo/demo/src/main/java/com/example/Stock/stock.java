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

    public void modificar(){

    }
}