/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej07;

/**
 *
 * @author Admin
 */
public class Televisor implements ControlRemoto {

    private boolean encendido;
    private int canal;    
    private int volumen; 

    
     // inicializo apagado, canal 1, volumen 10.
    
    public Televisor() {
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
    }

    // Getters (sin acceso a 'encendido')
    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public boolean isEncendido() {
        return encendido;
    }

    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Televisor encendido. Canal actual: " + canal);
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            System.out.println("La TV se apagará en 10s");
            encendido = false;
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen++;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen--;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.canal = (int) canal; // Convierte float a int
            System.out.println("Canal actual: " + this.canal);
        }
    }

    /**
     * Muestra el estado actual del televisor.
     */
    public void mostrarInformacion() {
        System.out.println("Televisor - Encendido: " + encendido
                + ", Canal: " + canal
                + ", Volumen: " + volumen);
    }
}
