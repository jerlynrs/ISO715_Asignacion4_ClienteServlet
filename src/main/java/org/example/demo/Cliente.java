package org.example.practica4;

public class Cliente {
    private String id;
    private String nombre;
    private String categoria;
    private String direccion;

    public Cliente(String id, String nombre, String categoria, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + categoria + "," + direccion;
    }
}