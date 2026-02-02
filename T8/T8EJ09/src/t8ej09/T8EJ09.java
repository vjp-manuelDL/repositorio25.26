package t8ej09;
import java.util.Scanner;

public class T8EJ09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aula.inicializarAula();
        
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Rellenar las notas de los alumnos.");
            System.out.println("2. Mostrar las notas introducidas.");
            System.out.println("3. Alumno con mejor media.");
            System.out.println("4. Alumno con mas suspensos.");
            System.out.println("5. Asignatura mas dificil.");
            System.out.println("6. Salir del programa.");
            System.out.print("Elija una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    Aula.rellenarNotas(entrada);
                    break;
                case 2:
                    Aula.mostrarNotas();
                    break;
                case 3:
                    Aula.mostrarMejorAlumno();
                    break;
                case 4:
                    Aula.mostrarAlumnoMasSuspensos();
                    break;
                case 5:
                    Aula.mostrarAsignaturaMasDificil();
                    break;
                case 6:
                    System.out.println("Has salido del programa");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 6);
        
        entrada.close();
    }
}