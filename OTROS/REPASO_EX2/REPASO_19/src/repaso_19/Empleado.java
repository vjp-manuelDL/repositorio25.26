/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_19;

/**
 *
 * @author Admin
 */
public class Empleado {

    private String nombre;
    private int horas;
    private double tarifa;

    public Empleado() {
        nombre = "";
        horas = 0;
        tarifa = 0;
    }

    public Empleado(String nom, int hor, double tar) {
        nombre = nom;
        horas = hor;
        tarifa = tar;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setHoras(int hor) {
        horas = hor;
    }

    public void setTarifa(double tar) {
        tarifa = tar;
    }


}
