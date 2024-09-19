package com.example.demo;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import com.example.Stock.stock;
import com.example.producto.producto;

public class TestStock {
    private stock stock;
    @BeforeEach
    public void setUP(){
        stock = new stock();
    }
    @Test
    public void testAddProduct(){
        producto producto = new producto("leche",200,20,"especial");
        assertTrue(stock.AddProducto(producto));
    }

    @Test
    public void testAddProductFail(){
        producto producto = new producto("leche",200,20,"especial");
        producto producto1 = new producto("leche",100,2,"especial");
        stock.AddProducto(producto);
        assertFalse(stock.AddProducto(producto1));
    }

    @Test
    public void testAddProductoNull(){
        producto producto = null;
        assertFalse(stock.AddProducto(producto));
    }

    @Test
    public void testAddTwoProductos(){
        producto producto = new producto("xbox",200,20,"especial");
        producto producto1 = new producto("leche",100,2,"especial");
        stock.AddProducto(producto);
        assertTrue(stock.AddProducto(producto1));
    }

    @Test
    public void modificarFail(){
        producto producto = null;
        assertFalse(stock.modificarProducto(producto,20));

    }

    @Test
    public void modificar(){
        producto producto = new producto("xbox",200,20,"especial");
        stock.AddProducto(producto);
        assertTrue(stock.modificarProducto(producto,10));
    }

    @Test
    public void menorAcuatro(){
        producto producto = new producto("xbox",200,20,"especial");
        stock.AddProducto(producto);
        assertTrue(stock.modificarProducto(producto,3));
    }

    @Test
    public void KeynoContains(){
        producto producto = new producto("xbox",200,20,"especial");
        producto producto2 = new producto("nevera",200,20,"especial");
        stock.AddProducto(producto);
        assertFalse(stock.modificarProducto(producto2,10));
    }


    @Test
    public void cantidadNegativa(){
        producto producto = new producto("xbox",200,20,"especial");
        stock.AddProducto(producto);
        assertFalse(stock.modificarProducto(producto,-3));
    }


}