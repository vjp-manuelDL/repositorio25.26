/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej19;

/**
 *
 * @author Admin
 */
public class Empleado {

    private String nombre;
    private int horas;
    private double tarifa;

    // Constructor
    public Empleado(String nombre, int horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public double getTarifa() {
        return tarifa;
    }

}
