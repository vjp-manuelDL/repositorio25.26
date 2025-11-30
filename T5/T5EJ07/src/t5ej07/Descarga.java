/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej07;

/**
 *
 * @author Admin
 */
public class Descarga {

    private String nombreDescarga;
    private double tamanoDescarga;
    private double velocidadDescarga;

    Descarga(String nom, double tam, double vel) {
        nombreDescarga = nom;
        tamanoDescarga = tam;
        velocidadDescarga = vel;
    }

    public void establecerNombre(String nom) {
        nombreDescarga = nom;
    }

    public void establecerTam(double tam) {
        tamanoDescarga = tam;
    }

    public void establecerVelocidad(double vel) {
        velocidadDescarga = vel;
    }

    public String obtenerNombre() {
        return nombreDescarga;
    }

    public double obtenerTam() {
        return tamanoDescarga;

    }

    public double obtenerVelo() {
        return velocidadDescarga;
    }

}
