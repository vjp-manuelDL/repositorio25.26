package repaso_5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Pedir {

    public static void pedirNotas() {
        int total = 0;
        Scanner sc = new Scanner(System.in);

        Notas n1 = new Notas("Programacion", 0);
        int not1;
        System.out.println("Por favor, introduzca la nota de Programación: ");
        not1 = sc.nextInt();
        total += not1;
        
        Notas n2 = new Notas("Lenguajes de Marcas", 0);
        int not2;
        System.out.println("Por favor, introduzca la nota de Lenguaje de Marcas: ");
        not2 = sc.nextInt();
        total += not2;
        
        Notas n3 = new Notas("Bases", 0);
        int not3;
        System.out.println("Por favor, introduzca la nota de Bases de Datos: ");
        not3 = sc.nextInt();
        total += not3;
        
        Notas n4 = new Notas("Desarrollo", 0);
        int not4;
        System.out.println("Por favor, introduzca la nota de Desarrollo: ");
        not4 = sc.nextInt();
        total += not4;
        
        Notas n5 = new Notas("Sistemas", 0);
        int not5;
        System.out.println("Por favor, introduzca la nota de Sistemas: ");
        not5 = sc.nextInt();
        total += not5;
        
        Notas n = new Notas("FOL", 0);
        int not6;
        System.out.println("Por favor, introduzca la nota de FOL: ");
        not6 = sc.nextInt();
        total += not6;
        
        System.out.println("La media es: " + (total / 6));
        

    }

}
