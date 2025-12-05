package repaso_2;

/**
 *
 * @author alumno
 */
public class Curso {
    private String nombre;
    private int horas;
    private static int numeroDeCursos = 0;
    
    public void setNombreyHoras(String n, int h){
        nombre = n;
        horas = h;
        numeroDeCursos++;
    }
    public String getNombre(){
        return nombre;
    }
    public int getHoras(){
        return horas;
    }
    public static void sumarCursos(){
        numeroDeCursos++;
    }
    public static int verCursos(){
        return numeroDeCursos;
    }
    
}
