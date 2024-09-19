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
    public void modificar(){
        
    }

}