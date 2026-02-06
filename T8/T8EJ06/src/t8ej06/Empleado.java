package t8ej06;

public class Empleado {
    // Atributos privados de la clase (encapsulación)
    private String nombre;        // Nombre del empleado
    private int horasTrabajo;     // Horas trabajadas en el mes
    private float sueldoHora;     // Tarifa por hora de trabajo

    // Constructor parametrizado: inicializa un empleado con sus datos
    public Empleado(String nombre, int horas, float sueldo) {
        this.nombre = nombre;
        this.horasTrabajo = horas;
        this.sueldoHora = sueldo;
    }

    // Getters: métodos para obtener los valores de los atributos
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

    // Método para calcular el sueldo mensual con horas extras
    // Las horas extras (más de 40) se pagan un 50% más
    public float calcularSueldo() {
        float sueldo;
        if (horasTrabajo > 40) {
            // Horas extras: (horas - 40) * (sueldoHora + 50%)
            // Horas normales: 40 * sueldoHora
            sueldo = ((horasTrabajo - 40) * ((sueldoHora / 2) + sueldoHora)) + (40 * sueldoHora);
        } else {
            // Sin horas extras: horas * sueldoHora
            sueldo = horasTrabajo * sueldoHora;
        }
        return sueldo;
    }
}