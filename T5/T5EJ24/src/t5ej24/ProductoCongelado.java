/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej24;

/**
 *
 * @author Admin
 */
public class ProductoCongelado extends Producto {
    private double temperaturaCongelacion;

    public ProductoCongelado(String fechaCaducidad, String numeroLote, double temperaturaCongelacion) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public double getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    public void setTemperaturaCongelacion(double temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- PRODUCTO CONGELADO ---");
        super.mostrarInformacion();
        System.out.println("Temperatura de congelación recomendada: " + temperaturaCongelacion + " °C");
        System.out.println();
    }
}
