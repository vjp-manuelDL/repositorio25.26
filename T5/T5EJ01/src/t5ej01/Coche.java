/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej01;

/**
 *
 * @author alumno
 */
public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean encendido = false;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public String getModelo() {
        return modelo;
    }

    public void setmModelo(String n) {
        modelo = n;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int ve) {
        velocidad = ve;
    }

    public void encenderMotor() {
        if (encendido == true) {
            System.out.println("El motor ya estaba encendido");
        } else {
            encendido = true;
        }
    }

    public void apagarMotor() {
        if (encendido == false) {
            System.out.println("El motoy ya estaba apagado");
        } else {
            encendido = false; }
    }

    public void mostrarCoche() {
        System.out.println("Marca " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Color " + color);
        System.out.println("Velocidad " + velocidad);
        if (encendido == true) {
            System.out.println("El coche esta encendido");
        } else {
            System.out.println("El coche esta apagado");
        }
    }
}
