package com.example.demo;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import com.example.Stock.stock;
import com.example.producto.producto;
public class TestProducto {
    @Test
    void testGetCantidad(){
        producto producto = new producto("leche",200,20,"especial");
        assertEquals(20,producto.getCantidad());
    }

    @Test
    void testGetPrecio(){
        producto producto = new producto("leche",200,20,"especial");
        assertEquals(200,producto.getPrecio());
    }
    @Test
    void testGetCategoria(){
        producto producto = new producto("leche",200,20,"especial");
        assertEquals("especial",producto.getCategoria());
    }

}
