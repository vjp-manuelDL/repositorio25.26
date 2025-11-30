/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej16;

/**
 *
 * @author Admin
 */
public class Alumno {

    private String nombre;
    private int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
        // Método para obtener la calificación textual
    public String obtenerCalificacion() {
        if (nota >= 0 && nota <= 4) {
            return "Suspenso";
        } else if (nota == 5 || nota == 6) {
            return "Bien";
        } else if (nota == 7 || nota == 8) {
            return "Notable";
        } else if (nota == 9 || nota == 10) {
            return "Sobresaliente";
        } else {
            return "Nota inválida";
        }
    }
}
