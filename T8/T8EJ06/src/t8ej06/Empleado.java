package t8ej06;


public class Empleado {
    private String nombre;
    private int horasTrabajo;
    private float sueldoHora;
    
    public Empleado(String nombre,int horas,float sueldo){
        this.nombre = nombre;
        this.horasTrabajo = horas;
        this.sueldoHora = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public float getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(float sueldoHora) {
        this.sueldoHora = sueldoHora;
    }
    
    public float calcularSueldo(){
        float sueldo;
        if (horasTrabajo > 40) {
            sueldo = ((horasTrabajo - 40) * ((sueldoHora/2) + sueldoHora)) + (40 * sueldoHora);
        }
        else{
            sueldo = horasTrabajo * sueldoHora;
        }
        return sueldo;
    }
    
}
