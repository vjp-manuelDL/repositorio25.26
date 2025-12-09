/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_24;

/**
 *
 * @author Admin
 */
public class PRefrigerado extends Productos{
    private double code;
    
    public PRefrigerado(String fecha, int lote,double code){
        super(fecha,lote);
        this.code = code;
    }
     public void mostrarInfo(){
        System.out.println(super.getLote());
         System.out.println("Mostar Codigo: " + code);
        System.out.println("Producto REFRIGERADOS");
    }
}
