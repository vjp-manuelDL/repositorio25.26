package t8ej13;

public class T8EJ13 {
    public static void main(String[] args) {
        // Crear dos objetos Alumno
        Alumno alumno1 = new Alumno("Ana García", 18, 8.75);
        Alumno alumno2 = new Alumno();
        
        // Configurar segundo alumno con setters
        alumno2.setNombre("Carlos Ruiz");
        alumno2.setEdad(19);
        alumno2.setNotaMedia(6.4);
        
        // Mostrar información
        System.out.println("=== ALUMNO 1 ===");
        alumno1.mostrarInfo();
        
        System.out.println("\n=== ALUMNO 2 ===");
        alumno2.mostrarInfo();
        
        // Modificar nota del segundo alumno
        System.out.println("\n--- Modificando nota de " + alumno2.getNombre() + " ---");
        alumno2.setNotaMedia(7.2);
        System.out.println(alumno2.getNombre() + " ahora tiene nota: " + alumno2.getNotaMedia());
    }
}