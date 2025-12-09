/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_01;

/**
 *
 * @author Admin
 */
public class Test {

    public static void probarTest() {
        Suma sum1 = new Suma(3, 4);
        sum1.realizarOperacion();

        Multiplicacion mul1 = new Multiplicacion(3, 4);
        mul1.realizarOperacion();

        Potencia pot1 = new Potencia(3, 4);
        pot1.realizarOperacion();

        Calculadora cal1 = new Suma(1, 2);
        cal1.realizarOperacion();
        
        Calculadora cal2 = new Multiplicacion(1, 2);
        cal2.realizarOperacion();
        
        Calculadora cal3 = new Potencia(1, 2);
        cal3.realizarOperacion();
    }

}
