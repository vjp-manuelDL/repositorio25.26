/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloex2;

/**
 *
 * @author Admin
 */
public class Horno extends ElecCocina{
    private double volumenLitros;

    public Horno(int volumenLitros, String marca, char consumoE, int precioBase) {
        super(marca, consumoE, precioBase);
        this.volumenLitros = volumenLitros;
    }

    public double getVolumenLitros() {
        return volumenLitros;
    }

    public void setVolumenLitros(double volumenLitros) {
        this.volumenLitros = volumenLitros;
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
         System.out.println("Cocina alimentos mediante calor radiante.");
     }
    @Override
    public  void calcularConsumoMensual(double horasUso){
        double consumo = horasUso * 2;
        System.out.println("El consumo Mensual es: " + consumo + "kWh");
    }
    
    
    
}
