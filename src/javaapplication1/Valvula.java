/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author nikos
 */
public class Valvula {
    private int codigo;
    private String referencia;
    private int precio;
    private int cantidad;

    public Valvula() {
    }

    public Valvula(int codigo, String referencia, int precio, int cantidad) {
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.referencia = referencia;
        this.precio = precio;
    }

    public String getNombre() {
        return referencia;
    }

    public void setNombre(String nombre) {
        this.referencia = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
