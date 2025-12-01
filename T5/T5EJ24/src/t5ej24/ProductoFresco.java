/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej24;

/**
 *
 * @author Admin
 */
public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;
    //creo la clase producto fresco y es el "hijo" de producto
    public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- PRODUCTO FRESCO ---");
        super.mostrarInformacion();
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
        System.out.println();
    }
}
