/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej02;

/**
 *
 * @author alumno
 */
public class T5EJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.establecerNombreyHoras("Programacion", 300);
        curso2.establecerNombreyHoras("Sistemas", 230);

        System.out.println("Curso 1");
        System.out.println("Nombre " + curso1.getNombre());
        System.out.println("Horas " + curso1.getHoras());
        System.out.println();

        System.out.println("Curso 2");
        System.out.println("Nombre " + curso2.getNombre());
        System.out.println("Horas " + curso2.getHoras());
        System.out.println();
        
        
        System.out.println("El numero de cursos es: " + Curso.verCursos());
        // TODO code application logic here
    }

}
