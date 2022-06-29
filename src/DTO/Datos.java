/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ABITA
 */
public class Datos {
    int id;
     String nombre;
     String direccion;
     String celular;

    public Datos(int id, String nombre, String direccion, String celular) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
    }

    public Datos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    
}
     
     
     

   