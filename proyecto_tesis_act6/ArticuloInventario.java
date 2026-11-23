/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tesis_act6;

/**
 *
 * @author lucia
 */
public class ArticuloInventario {
    private String nombreArticulo;
    private double precioUnitario;
    private int cantidadStock;

    public ArticuloInventario(String nombreArticulo, double precioUnitario, int cantidadStock) {
        validarDatos(precioUnitario, cantidadStock);
        this.nombreArticulo = nombreArticulo;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = cantidadStock;
    }

    public void actualizarArticulo(String nuevoNombre, double nuevoPrecio, int nuevoStock) {
        validarDatos(nuevoPrecio, nuevoStock);
        this.nombreArticulo = nuevoNombre;
        this.precioUnitario = nuevoPrecio;
        this.cantidadStock = nuevoStock;
    }

    public String obtenerNombre() {
        return nombreArticulo;
    }

    public double obtenerPrecioUnitario() {
        return precioUnitario;
    }

    public int obtenerCantidadStock() {
        return cantidadStock;
    }

    private void validarDatos(double precio, int stock) {
        if (precio < 0 || stock < 0) {
            throw new IllegalArgumentException("Precio y stock deben ser mayores o iguales a cero");
        }
    }
    
}
