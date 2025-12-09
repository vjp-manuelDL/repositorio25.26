/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_24;

/**
 *
 * @author Admin
 */
public class Productos {
    private String fecha;
    private int numero;

    public Productos() {
        fecha =  "22/10/2030";
        numero = 0;
    }
    
    public Productos(String fe, int num){
        fecha = fe;
        numero = num;
    }
    
    public String getFecha(){
        return fecha;
    }
    public int getNumero(){
        return numero;
    }

    public void setFecha(String fe) {
        fecha = fe;
    }

    public void setNumero(int num) {
        numero = num;
    }
    
    
    public String getLote(){
        return "Caducidad " + fecha + " " + "Lote " + numero + " ";
    }
}
