package t8ej09;

public class Asignatura {
    private String nombreAsignatura;
    private float notaAsignatura;

    public Asignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
        this.notaAsignatura = 0;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public float getNotaAsignatura() {
        return notaAsignatura;
    }

    public void setNotaAsignatura(float notaAsignatura) {
        this.notaAsignatura = notaAsignatura;
    }
}