/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tap_proyecto.Clases;


public class Producto {
    private String Id;
    private String Nombre;
    private Double Precio;
    private int Cantidad;

    public Producto() {
    }

    public Producto(String Id, String Nombre, Double Precio, int Cantidad) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "Id=" + Id + ", Nombre=" + Nombre + ", Precio=" + Precio + ", cantidad=" + Cantidad + '}';
    }
    
}
