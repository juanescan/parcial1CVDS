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

}