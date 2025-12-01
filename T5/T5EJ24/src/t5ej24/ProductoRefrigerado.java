/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej24;

/**
 *
 * @author Admin
 */
public class ProductoRefrigerado extends Producto {

    private String codigoOrganismo;
    //creo la clase producto refrigerado y es el "hijo" de producto

    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoOrganismo) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- PRODUCTO REFRIGERADO ---");
        super.mostrarInformacion();
        System.out.println("Código del organismo de supervisión: " + codigoOrganismo);
        System.out.println();
    }
}
