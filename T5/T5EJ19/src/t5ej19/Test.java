/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5ej19;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Test {
    public static void procesarEmpleados() {
        Scanner entrada = new Scanner(System.in);

        // Creamos 3 empleados
        for (int i = 1; i <= 3; i++) {
            System.out.println("Empleado " + i + "  ");
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Horas trabajadas: ");
            int horas = entrada.nextInt();

            System.out.print("Tarifa por hora (en euros): ");
            double tarifa = entrada.nextDouble();

            entrada.nextLine(); // limpiar el buffer

            Empleado emp = new Empleado(nombre, horas, tarifa);
            mostrarSueldo(emp);
        }
    }

    public static void mostrarSueldo(Empleado e) {
        String nombre = e.getNombre();
        int horas = e.getHoras();
        double tarifa = e.getTarifa();
        double sueldo;

        if (horas <= 40) {
            sueldo = horas * tarifa;
        } else {
            // 40 horas normales + (horas extras * tarifa * 1.5)
            sueldo = 40 * tarifa + (horas - 40) * tarifa * 1.5;
        }

        System.out.println(nombre + " trabajó " + horas + " horas, cobra " + tarifa + " euros la hora por lo que le corresponde un sueldo de " + sueldo + " euros.");
    }
    
    
}
