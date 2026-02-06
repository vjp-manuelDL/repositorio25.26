package t8ej06;

import java.util.Scanner;

public class T8EJ06 {

    // Método para pedir al usuario el número de empleados a registrar
    public static int pedirNumeroEmpleados(Scanner entrada) {
        System.out.print("Cuantos empleados desea introducir? ");
        int numero = entrada.nextInt();
        entrada.nextLine(); // Limpia el buffer después de nextInt()
        return numero;
    }

    // Método para pedir el nombre del empleado
    public static String pedirNombre(Scanner entrada, int posicion) {
        System.out.print("Introduzca el nombre del empleado: ");
        return entrada.nextLine(); // nextLine() consume el salto de línea
    }

    // Método para pedir las horas trabajadas por el empleado
    public static int pedirHoras(Scanner entrada, int posicion) {
        System.out.print("Cuantas horas trabajo este mes? "); 
        int horas = entrada.nextInt();
        entrada.nextLine(); // Limpia el buffer después de nextInt()
        return horas;
    }

    // Método para pedir la tarifa por hora del empleado
    public static float pedirSueldoHora(Scanner entrada, int posicion) {
        System.out.print("Cual es su tarifa por hora de trabajo? ");   
        float sueldo = entrada.nextFloat();
        entrada.nextLine(); // Limpia el buffer después de nextFloat()
        return sueldo;
    }

    // Método para crear un objeto Empleado con los datos proporcionados
    public static Empleado crearEmpleado(Scanner entrada, int posicion) {
        System.out.println("\n- EMPLEADO -" + posicion + " -");
        String nombre = pedirNombre(entrada, posicion);
        int horas = pedirHoras(entrada, posicion);
        float sueldo = pedirSueldoHora(entrada, posicion);
        return new Empleado(nombre, horas, sueldo);
    }

    // Método para rellenar el array de empleados
    public static void rellenarEmpleados(Empleado[] empleados, Scanner entrada) {
        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = crearEmpleado(entrada, i + 1);
            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON EXITO");
        }
    }

    // Método para mostrar el sueldo bruto de todos los empleados
    public static void mostrarSueldos(Empleado[] empleados) {
        System.out.println("\nSUELDO BRUTO DE LOS EMPLEADOS");
        for (int i = 0; i < empleados.length; i++) {
            Empleado e = empleados[i];
            float sueldo = e.calcularSueldo(); // Calcula el sueldo con horas extras si aplica
            System.out.println(e.getNombre() + " trabajó " + e.getHorasTrabajo()
                    + " horas, cobra " + e.getSueldoHora()
                    + " euros la hora, por lo que le corresponde un sueldo de "
                    + sueldo + " euros.");
        }
    }

    // Método principal: punto de entrada del programa
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir número de empleados y crear el array
        int numEmpleados = pedirNumeroEmpleados(entrada); 
        Empleado[] empleados = new Empleado[numEmpleados];

        // Rellenar el array con datos de los empleados
        rellenarEmpleados(empleados, entrada);
        
        // Mostrar los sueldos calculados
        mostrarSueldos(empleados);

        entrada.close(); // Cerrar el scanner para liberar recursos
    }
}