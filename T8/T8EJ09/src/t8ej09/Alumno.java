package t8ej09;

public class Alumno {
    private String nombreAlumno;
    private Asignatura[] asignaturas;

    public Alumno(String nombreAlumno, String[] nombresAsignaturas) {
        this.nombreAlumno = nombreAlumno;
        this.asignaturas = new Asignatura[nombresAsignaturas.length];
        for (int i = 0; i < nombresAsignaturas.length; i++) {
            asignaturas[i] = new Asignatura(nombresAsignaturas[i]);
        }
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public float calcularMedia() {
        float suma = 0;
        for (int i = 0; i < asignaturas.length; i++) {
            suma = suma + asignaturas[i].getNotaAsignatura();
        }
        return suma / asignaturas.length;
    }

    public int contarSuspensos() {
        int contador = 0;
        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i].getNotaAsignatura() < 5) {
                contador = contador + 1;
            }
        }
        return contador;
    }
}