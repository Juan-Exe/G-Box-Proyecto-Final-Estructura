/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Stack;

/**
 *
 * @author DAMIANA
 */
public class Carrito {
 
    
    private Stack<Juegos> productos;

    public Carrito() {
        this.productos = new Stack<>();
    }
 
     public void agregarProducto(Juegos producto) {
        productos.add(producto);
    }

    public Stack<Juegos> getProductos() {
        return productos;
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Juegos juego : productos) {
            total += juego.getPrecio();
        }
        return total;
    }

        
}

