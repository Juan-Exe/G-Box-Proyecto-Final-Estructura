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
public class Compra {

    private Stack<Juegos> compra;

    public Compra() {
        this.compra = new Stack<>();
    }

    public Stack<Juegos> getCompra() {
        return compra;
    }

    public Stack<Juegos> getProductosComprados() {
        return compra;
    }
      public void transferirABiblioteca(Carrito carrito) {
        for (Juegos juego : carrito.getProductos()) {
            if (!compra.contains(juego)) {
                compra.add(juego);
            }
        }

    }
      public boolean juegoFueComprado(String nombreJuego) {
    for (Juegos juego : compra) {
        if (juego.getNombre().equals(nombreJuego)) {
            return true;
        }
    }
    return false;
}

public Juegos getJuegoComprado(String nombreJuego) {
    for (Juegos juego : compra) {
        if (juego.getNombre().equals(nombreJuego)) {
            return juego;
        }
    }
    return null;
}

}



