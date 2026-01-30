package t8ej06;

import java.util.Scanner;

public class T8EJ06 {

    public static int pedirNumeroEmpleados(Scanner entrada) {
        System.out.print("¿Cuantos empleados desea introducir? ");
        int numero = entrada.nextInt();
        entrada.nextLine(); // limpia el buffer
        return numero;
    }

    public static String pedirNombre(Scanner entrada, int posicion) {
        System.out.print("Introduzca el nombre del empleado: ");
        return entrada.nextLine(); // Limpiar los buffers despues de cada metodo o si no da error
    }

    public static int pedirHoras(Scanner entrada, int posicion) {
        System.out.print("¿Cuántas horas trabajo este mes? "); 
        int horas = entrada.nextInt();
        entrada.nextLine(); // limpia el buffer
        return horas;
    }

    public static float pedirSueldoHora(Scanner entrada, int posicion) {
        System.out.print("¿Cual es su tarifa por hora de trabajo? ");   
        float sueldo = entrada.nextFloat();
        entrada.nextLine(); // limpia el buffer
        return sueldo;
    }

    public static Empleado crearEmpleado(Scanner entrada, int posicion) {
        System.out.println("\n- EMPLEADO -" + posicion + " -");
        String nombre = pedirNombre(entrada, posicion);
        int horas = pedirHoras(entrada, posicion);
        float sueldo = pedirSueldoHora(entrada, posicion);
        return new Empleado(nombre, horas, sueldo);
    }

    public static void rellenarEmpleados(Empleado[] empleados, Scanner entrada) {
        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = crearEmpleado(entrada, i + 1);
            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON EXITO");
        }
    }

    public static void mostrarSueldos(Empleado[] empleados) {
        System.out.println("\nSUELDO BRUTO DE LOS EMPLEADOS");
        for (int i = 0; i < empleados.length; i++) {
            Empleado e = empleados[i];
            float sueldo = e.calcularSueldo();
            System.out.println(e.getNombre() + " trabajó " + e.getHorasTrabajo()
                    + " horas, cobra " + e.getSueldoHora()
                    + " euros la hora, por lo que le corresponde un sueldo de "
                    + sueldo + " euros.");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numEmpleados = pedirNumeroEmpleados(entrada); 
        Empleado[] empleados = new Empleado[numEmpleados];

        rellenarEmpleados(empleados, entrada);
        mostrarSueldos(empleados);

        entrada.close();
        
        
    }
}
