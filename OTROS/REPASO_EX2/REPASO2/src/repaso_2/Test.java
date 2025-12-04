/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_2;

/**
 *
 * @author alumno
 */
public class Test {
    public static void probarTest(){
        Curso curso1 = new Curso();
       curso1.setNombreyHoras("DAM", 769);
       
       Curso curso2 = new Curso();
       curso2.setNombreyHoras("DAW", 750);
       
       
        System.out.println("--CURSO 1--");
        System.out.println("Nombre: " + curso1.getNombre());
        System.out.println("Horas: " + curso1.getHoras());
        System.out.println("");
        
        System.out.println("--CURSO 2--");
        System.out.println("Nombre: " + curso2.getNombre());
        System.out.println("Horas: " + curso2.getHoras());
        System.out.println("");
        
        System.out.println("CURSOS TOTALES: " + Curso.verCursos());
               
    }
    
}
