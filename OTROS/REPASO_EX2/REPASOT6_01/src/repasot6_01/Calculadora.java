/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_01;

/**
 *
 * @author Admin
 */
public abstract class Calculadora {
    private double numero;
    
    
    public Calculadora(){
    }
    
    public Calculadora(double num){
        this.numero = num;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    public abstract void realizarOperacion();
    
}
