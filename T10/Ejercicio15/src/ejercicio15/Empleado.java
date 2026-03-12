
package ejercicio15;

public class Empleado {
    
    private String nombre;
    private int sueldo;
    
    public Empleado() {
        this.nombre = "";
        this.sueldo = 0;
    }
    
    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    // getters y setters con insert code
    public String getNombre() {
        return this.nombre;
    }
    
    public int getSueldo() {
        return this.sueldo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
}
