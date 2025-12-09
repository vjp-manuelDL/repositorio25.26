/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloex2;

/**
 *
 * @author Admin
 */
public class Lavadora extends ElecLimpieza{
    private double capacidadKG;

    public Lavadora(int capacidadKG, String marca, char consumoE, int precioBase) {
        super(marca, consumoE, precioBase);
        this.capacidadKG = capacidadKG;
    }

    public double getCapacidadKG() {
        return capacidadKG;
    }

    public void setCapacidadKG(double capacidadKG) {
        this.capacidadKG = capacidadKG;
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
         System.out.println("Lava la ropa de forma automática.");
     }
    @Override
    public  void calcularConsumoMensual(double horasUso){
        double consumo = horasUso * 1.2;
        System.out.println("El consumo Mensual es: " + consumo + "kWh");
    }
}
