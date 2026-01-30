package t8ej09;

public class Alumno {
    private String nombreAlumno;
    
    private Asignatura[] asignaturas;

    public Alumno(String nombreAlumno, Asignatura[] asignaturas) {
        this.nombreAlumno = nombreAlumno;
        this.asignaturas = asignaturas;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    
}
