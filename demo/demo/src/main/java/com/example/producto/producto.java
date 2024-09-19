package com.example.producto;
public class producto {
    private final String name;
    private final int precio;
    private final int cantidad;
    private final String categoria;

    public producto(String name,int precio,int cantidad,String categoria) {
        this.name = name;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getName(){
        return name;
    }
}
