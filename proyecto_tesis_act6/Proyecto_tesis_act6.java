/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_tesis_act6;

/**
 *
 * @author lucia
 */
public class Proyecto_tesis_act6 {

    public static void main(String[] args) {
        ArticuloInventario articulo = new ArticuloInventario("Laptop Pro", 12500.0, 8);
        CalculadoraInventario calculadora = new CalculadoraInventario();
        VistaInventario vista = new VistaInventario();

        double total = calculadora.calcularTotalConDescuento(articulo, 10.0);
        vista.mostrarResumen(articulo, total);
    }
}
