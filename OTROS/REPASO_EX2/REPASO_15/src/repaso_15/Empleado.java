package repaso_15;

/**
 *
 * @author Admin
 */
public class Empleado {
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    public Empleado(){
        nombre = "";
        salario = 0;
        direccion = new Direccion();
    }
    
    public Empleado(String nombre, int salario, String calle, int numero, int piso, String ciudad) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = new Direccion(calle, numero, piso, ciudad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setSalario(int sal) {
        salario = sal;
    }

    public void setDireccion(Direccion dir) {
        direccion = dir;
    }
    
    
}
