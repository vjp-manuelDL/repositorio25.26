package t8ej14;

public class Alumno {
    private String nombre;
    private int edad;
    private double notaMedia;

    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0.0;
    }

    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años | Nota: " + notaMedia);
    }
}