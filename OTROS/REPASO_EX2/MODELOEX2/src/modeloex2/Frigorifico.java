/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloex2;

/**
 *
 * @author Admin
 */
public class Frigorifico extends ElecCocina{
    private boolean esNoFrost;

    public Frigorifico(boolean esNoFrost, String marca, char consumoE, int precioBase) {
        super(marca, consumoE, precioBase);
        this.esNoFrost = esNoFrost;
    }

    public boolean isEsNoFrost() {
        return esNoFrost;
    }

    public void setEsNoFrost(boolean esNoFrost) {
        this.esNoFrost = esNoFrost;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public char getConsumoE() {
        return consumoE;
    }

    @Override
    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    @Override
    public double getPrecioBase() {
        return precioBase;
    }

    @Override
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
     @Override
     public  void mostrarFuncion(){
         System.out.println("Mantiene los alimentos refrigerados");
         if (esNoFrost) {
             System.out.println("Es NoFrost");
             
         }
         else{
             System.out.println("Es Frost");
         }
     }
    @Override
    public  void calcularConsumoMensual(double horasUso){
        double consumo = 24 * 30 * 0.08;
        System.out.println("El consumo Mensual es: " + consumo + "kWh");
    }
    
    
    
    
}
