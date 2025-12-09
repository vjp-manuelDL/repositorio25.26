/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_07;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Televisor implements ControlRemoto{
    Scanner entrada = new Scanner(System.in);
    private boolean encendido = true;
    private int canal = 1;
    private int volumen = 10;

    public Televisor() {
    }


    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    
    
    @Override
    public  void apagar(){
        if (!encendido) {
            System.out.println("El televisor ya esta apagado");
        }
        else{
            System.out.println("El televisor se apagara en 5 segundos");
            encendido = false;
        }
    }

    @Override
    public  void encender(){
        if (encendido) {
            System.out.println("El televisor ya esta encendido");
        }
        else{
            System.out.println("El televisor se encendera en 5 segundos");
            encendido = true;
        }
    }

    @Override
    public  void bajarVolumen(){
        if (encendido) {
            if (volumen >= 0) {
            volumen --;
        System.out.println("El volumen es ahora: " + volumen);
        }
        else{
            System.out.println("No se puede bajar mas el volumen");
        }
        }
        else{
            System.out.println("No se puede bajar el volumen con la tele apagada");
        }
    }

    @Override
    public  void subirVolumen(){
        if (encendido) {
         if (volumen <= 100) {
            volumen ++;
        System.out.println("El volumen es ahora: " + volumen);
        }
        else{
            System.out.println("No se puede subir mas el volumen");
        }
        }
        else{
            System.out.println("No se puede subir el volumen con la tele apagada");
        }
        
    }
    

    
    @Override
    public  void cambiarCanal(float canal){
        if (encendido) {
         this.canal = (int) canal; // canal es int, pero parámetro es float
        System.out.println("Canal actual: " + this.canal);
        }
        else{
            System.out.println("No se puede cambiar el canal con la tele apagada");
        }

    }
}

    
    
    
    
    
    
    
    

