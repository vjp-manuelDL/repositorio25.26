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
        Coche coche1 = new Coche();
        coche1.setMarca("BMW");
        coche1.setmModelo("X3");
        coche1.setColor("Azul");
        coche1.setVelocidad(300);
        coche1.encenderMotor();
        coche1.mostrarCoche();
        

        Coche coche2 = new Coche();
        coche2.setMarca("BMW");
        coche2.setmModelo("Serie 8");
        coche2.setColor("Rojo");
        coche2.setVelocidad(350);
        coche2.encenderMotor();
        coche2.mostrarCoche();
        
        

        // TODO code application logic here
    }

}
