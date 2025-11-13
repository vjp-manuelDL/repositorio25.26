/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej01;

/**
 *
 * @author alumno
 */
public class T5EJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();
        //defino micoche y cochepadre

        miCoche.setmModelo("Serie X");
        miCoche.setMarca("BMW");
        miCoche.setColor("Azul");

        cochePadre.setmModelo("Skyline  ");
        cochePadre.setMarca("Nissan");
        cochePadre.setColor("Rojo");

        //arranco
        miCoche.arrancarCoche();
        miCoche.obtenerEstado();
        cochePadre.arrancarCoche();
        cochePadre.obtenerEstado();

        //acelero micoche
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.acelerarCoche();
        miCoche.obtenerEstado();

        //Freno mi coche
        miCoche.frenarCoche();
        miCoche.frenarCoche();
        miCoche.obtenerEstado();

        //acelero cocheapadre
        cochePadre.acelerarCoche();
        cochePadre.acelerarCoche();
        cochePadre.acelerarCoche();
        
        //apago cochepadre
        cochePadre.apagarCoche();
        
        //obtengo estado
        miCoche.obtenerEstado();
        cochePadre.obtenerEstado();

        // TODO code application logic here
    }

}
