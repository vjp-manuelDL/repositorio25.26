/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej07;

/**
 *
 * @author Admin
 */
public class Test {
  // Ejecuto la secuencia de pruebas
    public void ejecutar() {
        // Prueba del televisor
        System.out.println("=== TELEVISOR ===");
        Televisor tv = new Televisor();
        tv.encender();
        tv.mostrarInformacion();
        tv.subirVolumen(); tv.subirVolumen(); tv.subirVolumen();
        System.out.println("Volumen actual: " + tv.getVolumen());
        tv.cambiarCanal(5.0f);
        tv.bajarVolumen();
        tv.apagar();
        tv.mostrarInformacion();

        System.out.println();

        // Prueba de la radio
        System.out.println("=== RADIO ===");
        Radio radio = new Radio();
        radio.encender();
        radio.mostrarInformacion();
        radio.subirVolumen(); radio.subirVolumen(); radio.subirVolumen();
        System.out.println("Volumen actual: " + radio.getVolumen());
        radio.cambiarCanal(98.5f);
        radio.bajarVolumen();
        radio.apagar();
        radio.mostrarInformacion();
    }
    
}
