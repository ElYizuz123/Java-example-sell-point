/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tap_proyecto.Clases;

/**
 *
 * @author chuy-
 */
public class Venta {
    private String Articulo;
    private int Cantidad;
    private Double Total;

    public Venta() {
    }

    public Venta(String Articulo, int Cantidad, Double Total) {
        this.Articulo = Articulo;
        this.Cantidad = Cantidad;
        this.Total = Total;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "Venta{" + "Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Total=" + Total + '}';
    }
    
    
    
}
