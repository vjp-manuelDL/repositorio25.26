/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej24;

/**
 *
 * @author Admin
 */
public class Test {
    public static void mostrarProductos() {
        ProductoFresco fresco = new ProductoFresco("10/06/2025", "L-FR-001", "01/06/2025", "España");
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("15/07/2025", "L-REF-102", "ES-ALIM-5543");
        ProductoCongelado congelado = new ProductoCongelado("20/12/2025", "L-CON-990", -18.0);

        fresco.mostrarInformacion();
        refrigerado.mostrarInformacion();
        congelado.mostrarInformacion();
    }
}
