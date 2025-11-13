/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej02;

/**
 *
 * @author alumno
 */
public class Curso {
    private String nombre;
    private int horas;
    private static int cursos;
    
    public  void establecerNombreyHoras(String n, int h){
        nombre = n;
        horas = h;
        cursos++;
    }    
    
    public String getNombre(){
        return nombre;
    }
    
    public int getHoras(){
        return horas;
    }
    
    public static void sumarCursos(){
        cursos++;
    }
    
    public static int verCursos(){
        return cursos;
    }
    
    
}
