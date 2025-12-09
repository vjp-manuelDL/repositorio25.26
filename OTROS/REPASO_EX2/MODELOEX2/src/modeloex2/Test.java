/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloex2;

/**
 *
 * @author Admin
 */
public class Test {
    public static void probarTest(){
        
        Electrodomestico horno = new Horno(20, "Azul", 'A' , 30);
        horno.mostrarFuncion();
        horno.calcularConsumoMensual(20);
        
        Electrodomestico lavadora = new Lavadora(10, "Verde", 'C', 40);
        lavadora.mostrarFuncion();
        lavadora.calcularConsumoMensual(30);
        
        Electrodomestico frigo = new Frigorifico(true, "Rojo", 'B', 100);
        frigo.mostrarFuncion();
        frigo.calcularConsumoMensual(24);
        
    }
    }
    

