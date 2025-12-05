package repaso_7;

/**
 *
 * @author alumno
 */
public class Descarga {
    private String nombre;
    private double tamaño;
    private int velocidad;

    public Descarga(String nom, double tam, int vel) {
        nombre = nom;
        tamaño = tam;
        velocidad = vel;
    }
    
    
    

    public String getNombre(){
        return nombre;
    }
    public double getTamaño(){
        return tamaño;
    }
    public int getVelocidad(){
        return velocidad;
    }
    
    public void setNombre(String nom){
        nombre = nom;
    }
    public void setTamaño(double tam){
        tamaño = tam;
    }
    public void setVel(int vel){
        velocidad = vel;
    }
}
