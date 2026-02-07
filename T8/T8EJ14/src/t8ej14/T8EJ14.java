package t8ej14;

import java.util.Scanner;

public class T8EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[5]; // Vector para 5 alumnos
        int opcion;
        
        // Menú principal con do-while
        do {
            mostrarMenu();
            opcion = leerEntero(sc, "Seleccione una opción: ");
            
            if (opcion == 1) {
                rellenarAlumno(alumnos, sc);
            } else if (opcion == 2) {
                mostrarVector(alumnos);
            } else if (opcion == 3) {
                mostrarAprobados(alumnos, sc);
            } else if (opcion == 4) {
                contarSuspensos(alumnos);
            } else if (opcion == 5) {
                buscarAlumno(alumnos, sc);
            } else if (opcion == 6) {
                System.out.println("¡Hasta pronto!");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
            
            // Pausa después de cada acción (excepto salir)
            if (opcion >= 1 && opcion <= 5) {
                System.out.println("\nPresione Enter para continuar...");
                sc.nextLine(); // Limpiar buffer
                sc.nextLine(); // Esperar Enter
            }
            
        } while (opcion != 6);
        
        sc.close();
    }
    
    // Muestra el menú de opciones
    private static void mostrarMenu() {
        System.out.println("\n=== GESTIÓN DE ALUMNOS ===");
        System.out.println("1. Rellenar alumno");
        System.out.println("2. Mostrar vector de alumnos");
        System.out.println("3. Mostrar alumnos con nota > X");
        System.out.println("4. Contar alumnos suspensos");
        System.out.println("5. Buscar alumno por nombre");
        System.out.println("6. Salir");
    }
    
    // Rellenar alumno en posición válida (SIN break)
    private static void rellenarAlumno(Alumno[] alumnos, Scanner sc) {
        System.out.print("Posición (0-4): ");
        int pos = sc.nextInt();
        boolean posicionValida = false;
        
        // Validar posición sin usar break
        while (!posicionValida) {
            if (pos >= 0 && pos < alumnos.length) {
                if (alumnos[pos] == null) {
                    posicionValida = true;
                } else {
                    System.out.print("Posición ocupada. Introduzca otra (0-4): ");
                    pos = sc.nextInt();
                }
            } else {
                System.out.print("Posición fuera de rango. Introduzca (0-4): ");
                pos = sc.nextInt();
            }
        }
        
        // Limpiar buffer antes de leer texto
        sc.nextLine();
        
        // Pedir datos del alumno
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        int edad = leerEntero(sc, "Edad: ");
        double nota = leerDouble(sc, "Nota media: ");
        
        // Crear y almacenar el alumno
        alumnos[pos] = new Alumno(nombre, edad, nota);
        System.out.println("✓ Alumno '" + nombre + "' añadido en posición " + pos);
    }
    
    // Mostrar solo alumnos no nulos
    private static void mostrarVector(Alumno[] alumnos) {
        System.out.println("\n--- LISTADO DE ALUMNOS ---");
        boolean hayAlumnos = false;
        
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                System.out.print("[" + i + "] ");
                alumnos[i].mostrarInfo();
                hayAlumnos = true;
            }
        }
        
        if (!hayAlumnos) {
            System.out.println("Vector vacío. No hay alumnos registrados.");
        }
    }
    
    // Mostrar alumnos con nota superior a umbral
    private static void mostrarAprobados(Alumno[] alumnos, Scanner sc) {
        double umbral = leerDouble(sc, "Introduzca nota mínima: ");
        boolean encontrado = false;
        
        System.out.println("\n--- ALUMNOS CON NOTA > " + umbral + " ---");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getNotaMedia() > umbral) {
                System.out.print("[" + i + "] ");
                alumnos[i].mostrarInfo();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("Ningún alumno supera esa nota.");
        }
    }
    
    // Contar alumnos con nota suspensa (<5.0)
    private static void contarSuspensos(Alumno[] alumnos) {
        int contador = 0;
        
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getNotaMedia() < 5.0) {
                contador++;
            }
        }
        
        System.out.println("\nAlumnos suspensos (<5.0): " + contador);
    }
    
    // Buscar alumno por nombre (búsqueda parcial e insensible a mayúsculas)
    private static void buscarAlumno(Alumno[] alumnos, Scanner sc) {
        sc.nextLine(); // Limpiar buffer
        System.out.print("Nombre a buscar: ");
        String busqueda = sc.nextLine().toLowerCase();
        boolean encontrado = false;
        
        System.out.println("\n--- RESULTADOS DE BÚSQUEDA ---");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                String nombreAlumno = alumnos[i].getNombre().toLowerCase();
                if (nombreAlumno.contains(busqueda)) {
                    System.out.print("[" + i + "] ");
                    alumnos[i].mostrarInfo();
                    encontrado = true;
                }
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró ningún alumno con ese nombre.");
        }
    }
    
    // Método auxiliar para leer enteros con validación
    private static int leerEntero(Scanner sc, String mensaje) {
        int valor = 0;
        boolean valido = false;
        
        while (!valido) {
            try {
                System.out.print(mensaje);
                valor = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: debe introducir un número entero válido.");
            }
        }
        return valor;
    }
    
    // Método auxiliar para leer doubles con validación
    private static double leerDouble(Scanner sc, String mensaje) {
        double valor = 0.0;
        boolean valido = false;
        
        while (!valido) {
            try {
                System.out.print(mensaje);
                valor = Double.parseDouble(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: debe introducir un número válido.");
            }
        }
        return valor;
    }
}