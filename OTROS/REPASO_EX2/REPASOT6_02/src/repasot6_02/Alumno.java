package repasot6_02;

/**
 *
 * @author Admin
 */
public class Alumno extends Persona{
    private String grupo;
    
    public Alumno(){
        grupo = "";
    }
    
    public Alumno(String nombre,String grup){
        super(nombre);
        grupo = grup;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grup) {
        this.grupo = grup;
    }
    
    @Override
     public  void saludar() {
         System.out.println("Hola soy el alumno: " + getNombre());
         System.out.println("Y voy al Curso: " + getGrupo());
     }
}
