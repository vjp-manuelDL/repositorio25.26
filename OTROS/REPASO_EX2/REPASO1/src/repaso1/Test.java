/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso1;

/**
 *
 * @author alumno
 */
public class Test {

    public static void cochePrueba() {
        //creo y arranco mi coche
        Coche micoche = new Coche();
        micoche.setMarca("BMW");
        micoche.setColor("Azul");
        micoche.arrancarCoche();

        //creo y arranco coche padre
        Coche cochepadre = new Coche();
        cochepadre.setMarca("FORD");
        cochepadre.setColor("NEGRO");
        cochepadre.arrancarCoche();

        //acelero y freno mi coche
        micoche.acelerarCoche();
        micoche.acelerarCoche();
        micoche.acelerarCoche();
        micoche.acelerarCoche();
        micoche.acelerarCoche();
        micoche.mostrarInfo();
        micoche.frenarCoche();
        micoche.frenarCoche();
        micoche.mostrarInfo();

        //acelero coche padre
        cochepadre.acelerarCoche();
        cochepadre.acelerarCoche();
        cochepadre.acelerarCoche();

        //muestro la info y apago
        micoche.mostrarInfo();
        cochepadre.mostrarInfo();
        micoche.apagarCoche();
        cochepadre.apagarCoche();
        micoche.mostrarInfo();
        cochepadre.mostrarInfo();

    }

}
