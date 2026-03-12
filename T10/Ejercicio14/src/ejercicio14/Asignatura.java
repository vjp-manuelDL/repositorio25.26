
package ejercicio14;


public class Asignatura {
    
    // atributos
    
    private String nombre;
    private float nota;

    // Constructores
    
    public Asignatura() {
        this.nombre = "";
        this.nota = 0F;
    }

    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    // Getters y setters con "insert code"

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    // Mostrar
    
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
