/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_24;

/**
 *
 * @author Admin
 */
public class PFresco extends Productos{
    private String envasado;
    private String pais;

    public PFresco(String fecha, int lote,String envasado,String pais) {
        super(fecha,lote);
        this.envasado = envasado;
        this.pais = pais;
    }
    
    public void mostrarInfo(){
        System.out.println(super.getLote());
        System.out.println("Mostrar Lote " + envasado);
        System.out.println("Mostrar Pais " + pais);
        System.out.println("Producto FRESCOS");
    }
}
