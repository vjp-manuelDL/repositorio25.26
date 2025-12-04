/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej07;

/**
 *
 * @author Admin
 */
public class Radio implements ControlRemoto {

    private boolean encendido;
    private float emisora; // Frecuencia en MHz (por defecto 80.0)
    private int volumen;   // Volumen en saltos de 5 (por defecto 15)

   // inicializo apagada, emisora 80.0, volumen 15.
    
    public Radio() {
        this.encendido = false;
        this.emisora = 80.0f;
        this.volumen = 15;
    }

    // Getters (sin acceso a 'encendido')
    public float getEmisora() {
        return emisora;
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
            System.out.println("La Radio se ha encendido en la emisora: " + emisora);
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("Radio apagada.");
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen += 5;
            System.out.println("El volumen actual: " + volumen);
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen -= 5;
            System.out.println("El volumen actual: " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float emisora) {
        if (encendido) {
            this.emisora = emisora;
            System.out.println("Emisora actual: " + this.emisora);
        }
    }

    /**
     * Muestra el estado actual de la radio.
     */
    public void mostrarInformacion() {
        System.out.println("Radio - Encendida: " + encendido
                + ", Emisora: " + emisora
                + ", Volumen: " + volumen);
    }

}
