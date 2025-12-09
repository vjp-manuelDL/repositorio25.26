/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloex2;

/**
 *
 * @author Admin
 */
public abstract class ElecLimpieza extends Electrodomestico{
    
    public ElecLimpieza(String marca, char consumoE, double precioBase) {
        this.marca = marca;
        this.consumoE = consumoE;
        this.precioBase = precioBase;
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
    
    

    
    
}
