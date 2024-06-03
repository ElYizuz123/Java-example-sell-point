/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tap_proyecto.Clases;

/**
 *
 * @author chuy-
 */
public class Usuario {
    private String Nombre;
    private String Contra;

    public Usuario() {
    }

    public Usuario(String nombre, String contra) {
        this.Nombre = nombre;
        this.Contra = contra;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String contra) {
        this.Contra = contra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + Nombre + ", contra=" + Contra + '}';
    }
    
}
