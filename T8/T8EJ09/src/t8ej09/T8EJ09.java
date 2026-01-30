package t8ej09;

import java.util.Scanner;

public class T8EJ09 {

    public static void mostrarMenu(Scanner entrada) {
        int opcion;
        do {

            System.out.println("Elija la opcion que quiera");
            System.out.println("1. Rellenar las notas de los alumnos.\n"
                    + "2. Mostrar las notas introducidas en el punto anterior.\n"
                    + "3. Que nos diga que alumno es el mejor de la clase. (nota media mas alta)"
                    + "4. Que nos diga el alumno con más suspensos.\n"
                    + "5. Que nos diga cual es la asignatura más difícil. (nota media más baja)"
                    + "\n6. Salir del programa.");
            opcion = entrada.nextInt();
            if (opcion == 1) {

            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion == 4) {

            } else if (opcion == 5) {

            }

        } while (opcion != 6);
        System.out.println("Has salido del programa");
    }
    
    
    public static void rellenarNotas(Scanner entrada){
        
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        mostrarMenu(entrada);

    }

}
