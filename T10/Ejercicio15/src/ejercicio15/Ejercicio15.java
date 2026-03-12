package ejercicio15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal del Ejercicio 15.
 * Gestiona un sistema de empresas y empleados mediante menú interactivo.
 * Permite registrar empresas con sus empleados, listarlos, filtrar por nombre y ordenar por sueldo.
 */
public class Ejercicio15 {

    /**
     * Método principal.
     * Controla el bucle del menú y ejecuta la opción seleccionada por el usuario.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        // ArrayList que almacena los objetos Empresa registrados
        ArrayList<Empresa> empresas = new ArrayList<>();
        
        // Bucle principal del menú
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer tras nextInt()
            
            switch(opcion) {
                case 1 -> introducirEmpresas(empresas);      // Registrar nuevas empresas
                case 2 -> mostrarEmpresas(empresas);          // Listar empresas y empleados
                case 3 -> mostrarEmpleadosConA(empresas);     // Filtrar empleados con 'A' en nombre
                case 4 -> ordenarEmpleadosSueldo(empresas);   // Ordenar empleados por sueldo (desc)
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida!");
            }
        } while(opcion != 5);
        
        scanner.close();  // Cerrar recurso Scanner
    }
    
    /**
     * Muestra el menú de opciones por consola.
     */
    public static void mostrarMenu() {
        System.out.println("=== Menu de opciones ===");
        System.out.println("1. - Introducir empresas y empleados.");
        System.out.println("2. - Mostrar empresas y empleados.");
        System.out.println("3. - Mostrar empleados cuyo nombre contiene A");
        System.out.println("4. - Mostrar empleados ordenador por sueldo");
        System.out.println("5. - Salir del programa");
    }
    
    /**
     * Solicita datos al usuario para crear empresas y sus empleados, y las añade a la lista.
     */
    public static void introducirEmpresas(ArrayList<Empresa> listaEmpresas) {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        
        do {
            System.out.println("Introduce el nombre de la empresa");
            String nombre = entrada.nextLine();
            
            // Crear empresa y registrar sus empleados
            Empresa empresa = new Empresa(nombre);
            empresa.introducirEmpleado();
            
            // Añadir empresa a la lista principal
            listaEmpresas.add(empresa);

            System.out.print("Quieres añadir mas empresas a la lista? (s/n)");
            respuesta = entrada.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
    }
    
    /**
     * Muestra por consola todas las empresas registradas y sus empleados.
     * Si la lista está vacía, informa al usuario.
     */
    public static void mostrarEmpresas(ArrayList<Empresa> empresas) {
        if(empresas.isEmpty()) {
            System.out.println("No hay ninguna empresa registrada.");
        } else {
            System.out.println("--- Lista de empresas ---");
            for(Empresa em : empresas) {
                em.mostrarEmpleados();  // Delega la impresión a la clase Empresa
            }
        }
    }
    
    /**
     * Busca y muestra los empleados cuyo nombre contiene la letra 'A' (sin distinguir mayúsculas).
     */
    public static void mostrarEmpleadosConA(ArrayList<Empresa> empresas) {
        for(Empresa em : empresas) {
            boolean encontrado = false;
            
            for(Empleado emp : em.getEmpleados()) {
                if(emp.getNombre().toLowerCase().contains("a")) {
                    System.out.println(" - " + emp.getNombre());
                    encontrado = true;  // Marcar como encontrado para evitar mensaje incorrecto
                }
            }
            
            if(!encontrado) {
                System.out.println("No se encontró ningun empleado cuyo nombre tenga A");
            }
        }
    }
    
    /**
     * Recopila todos los empleados de todas las empresas y los ordena por sueldo (de mayor a menor).
     * Luego muestra la lista ordenada por consola.
     */
    public static void ordenarEmpleadosSueldo(ArrayList<Empresa> empresas) {
        // Extraer todos los empleados en una lista única
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        for(Empresa e : empresas) {
            for(Empleado em : e.getEmpleados()) {
                empleados.add(em);
            }
        }
        
        if(empleados.isEmpty()) {
            System.out.println("No hay ningun empleado en la lista ");
        } else {
            // Ordenación burbuja: ordenar por sueldo descendente
            for(int i = 0; i < empleados.size() - 1; i++) {
                for(int j = i+1; j < empleados.size(); j++) {
                    if(empleados.get(j).getSueldo() > empleados.get(i).getSueldo()) {
                        // Intercambiar posiciones
                        Empleado aux = empleados.get(i);
                        empleados.set(i, empleados.get(j));
                        empleados.set(j, aux);
                    }
                }
            }
            
            System.out.println("Empleados ordenados por sueldo:");
            
            for(Empleado e : empleados) {
                System.out.println(e.toString());
            }
        }
    }
}