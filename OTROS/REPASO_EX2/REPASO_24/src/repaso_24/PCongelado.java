/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_24;

/**
 *
 * @author Admin
 */
public class PCongelado extends Productos{
    private int temperatura;
    
    public PCongelado(String fecha, int lote,int temperatura){
        super(fecha,lote);
        this.temperatura = temperatura;
    }
     public void mostrarInfo(){
        System.out.println(super.getLote());
        System.out.println("Mostar Temperatura: " + temperatura);
        System.out.println("Producto CONGELADO");
    }
}
