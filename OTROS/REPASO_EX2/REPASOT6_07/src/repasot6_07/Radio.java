package repasot6_07;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Radio implements ControlRemoto {

    Scanner entrada = new Scanner(System.in);
    private boolean encendido = true;
    private float emisora = 80;
    private int volumen = 10;

    public Radio() {
       
    }

    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public void apagar() {
        if (!encendido) {
            System.out.println("La radio ya esta apagada");
        } else {
            System.out.println("La radio se apagara en 5 segundos");
            encendido = false;
        }
    }

    @Override
    public void encender() {
        if (encendido) {
            System.out.println("La radio ya esta encendida");
        } else {
            System.out.println("La radio se encendera en 5 segundos");
            encendido = true;
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            if (volumen >= 0) {
                volumen -= 5;
                System.out.println("El volumen es ahora: " + volumen);
            } else {
                System.out.println("No se puede bajar mas el volumen");
            }
        } else {
            System.out.println("No se puede bajar el volumen con la radio apagada");
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido) {
            if (volumen <= 100) {
                volumen += 5;
                System.out.println("El volumen es ahora: " + volumen);
            } else {
                System.out.println("No se puede subir mas el volumen");
            }
        } else {
            System.out.println("No se puede subir el volumen con la radio apagada");
        }

    }

    
    @Override
    public void cambiarCanal(float emisora) {
        
        if (encendido) {
             this.emisora = emisora;
        System.out.println("Emisora actual: " + this.emisora);
        } else {
            System.out.println("No se puede cambiar la emisora con la radio apagada");
        }

    }

}
