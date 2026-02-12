package t8ej13;

public class Alumno {
    // Atributos privados
    private String nombre;
    private int edad;
    private double notaMedia;

    // Constructor por defecto
    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0.0;
    }

    // Constructor parametrizado
    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Método para mostrar información del alumno
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años | Nota media: " + notaMedia);
    }
}