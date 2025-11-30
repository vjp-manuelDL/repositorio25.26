/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej01;

/**
 *
 * @author Admin
 */
public class Test {

    // Esto es para probar las tres operaciones
    public static void probarOperaciones() {
        // Aquí creamos un objeto de cada tipo
        Calculadora s = new Suma(5, 3);
        Calculadora m = new Multiplicacion(4, 7);
        Calculadora p = new Potencia(2, 8);

        // Aquí invocamos el método de cada objeto
        s.realizarOperacion();
        m.realizarOperacion();
        p.realizarOperacion();
    }
}
