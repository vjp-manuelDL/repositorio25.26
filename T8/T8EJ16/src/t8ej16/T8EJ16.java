package t8ej16;

import java.util.Scanner;

public class T8EJ16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pelicula[] cartelera = new Pelicula[10]; // Máximo 10 películas
        int numPeliculas = 0;
        int opcion;

        // Bucle do-while para el menú principal
        do {
            mostrarMenu();
            opcion = leerEntero(entrada, "Seleccione una opción: ");

            if (opcion == 1) {
                numPeliculas = rellenarPeliculas(entrada, cartelera, numPeliculas);
            } else if (opcion == 2) {
                mostrarPeliculas(cartelera, numPeliculas);
            } else if (opcion == 3) {
                mostrarSociosPelicula(entrada, cartelera, numPeliculas);
            } else if (opcion == 4) {
                mostrarRecaudacionPelicula(entrada, cartelera, numPeliculas);
            } else if (opcion == 5) {
                mostrarPeliculaMasCara(cartelera, numPeliculas);
            } else if (opcion == 6) {
                mostrarPeliculaMasSocios(cartelera, numPeliculas);
            } else if (opcion == 7) {
                mostrarSociosPorLetra(entrada, cartelera, numPeliculas);
            } else if (opcion == 8) {
                mostrarPeliculasPorTexto(entrada, cartelera, numPeliculas);
            } else if (opcion == 9) {
                modificarVocalesUltimaPelicula(cartelera, numPeliculas);
            } else if (opcion == 10) {
                convertirTitulosMayusculas(cartelera, numPeliculas);
            } else if (opcion == 11) {
                System.out.println("¡Hasta pronto!");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

            // Pausa después de ejecutar una opción válida (excepto salir)
            if (opcion >= 1 && opcion <= 10) {
                System.out.println("\nPresione Enter para continuar...");
                entrada.nextLine(); // Limpiar buffer
                entrada.nextLine(); // Esperar Enter
            }

        } while (opcion != 11);

        entrada.close();
    }

    // Muestra el menú de opciones al usuario
    private static void mostrarMenu() {
        System.out.println("\n=== ASOCIACIÓN 'NOS GUSTA EL CINE' ===");
        System.out.println("1. Rellenar películas");
        System.out.println("2. Mostrar todas las películas");
        System.out.println("3. Mostrar socios de una película");
        System.out.println("4. Mostrar recaudación total de una película");
        System.out.println("5. Mostrar película más cara (licencia)");
        System.out.println("6. Mostrar película con más socios");
        System.out.println("7. Mostrar socios que empiecen por letra");
        System.out.println("8. Mostrar películas que contengan texto");
        System.out.println("9. Modificar 'a' por 'e' en última película");
        System.out.println("10. Convertir títulos a mayúsculas");
        System.out.println("11. Salir");
    }

    // Rellena el array de películas con datos proporcionados por el usuario
    private static int rellenarPeliculas(Scanner entrada, Pelicula[] cartelera, int numActual) {
        int maxNuevas = 10 - numActual; // Calcula cuántas películas más caben
        if (maxNuevas == 0) {
            System.out.println("No se pueden añadir más películas (máximo 10 alcanzado).");
            return numActual;
        }

        int nuevas = leerEntero(entrada, "¿Cuántas películas desea añadir? (máx. " + maxNuevas + "): ");
        
        if (nuevas <= 0 || nuevas > maxNuevas) {
            System.out.println("Número no válido.");
            return numActual;
        }

        // Bucle para crear cada película nueva
        for (int i = 0; i < nuevas; i++) {
            System.out.println("\n--- Película " + (numActual + i + 1) + " ---");
            System.out.print("Título: ");
            String titulo = entrada.nextLine();
            double coste = leerDouble(entrada, "Coste de licencia: ");
            
            // Crear nueva película
            cartelera[numActual + i] = new Pelicula(titulo, coste);
            
            // Añadir socios (máximo 4 por película)
            System.out.println("Añadiendo socios (máx. 4, escriba 'fin' para terminar):");
            int contSocios = 0;
            boolean continuar = true;
            
            // Bucle para añadir socios hasta máximo 4 o hasta que el usuario escriba 'fin'
            while (contSocios < 4 && continuar) {
                System.out.print("Nombre socio " + (contSocios + 1) + ": ");
                String nombre = entrada.nextLine();
                if (nombre.equalsIgnoreCase("fin")) {
                    continuar = false; // Salir del bucle sin usar break
                } else {
                    double aportacion = leerDouble(entrada, "Aportación voluntaria: ");
                    cartelera[numActual + i].anadirSocio(new Socio(nombre, aportacion));
                    contSocios++;
                }
            }
        }
        return numActual + nuevas; // Devuelve el nuevo total de películas
    }

    // Muestra todas las películas registradas
    private static void mostrarPeliculas(Pelicula[] cartelera, int num) {
        if (num == 0) {
            System.out.println("No hay películas registradas.");
            return;
        }
        System.out.println("\n=== LISTADO DE PELÍCULAS ===");
        for (int i = 0; i < num; i++) {
            System.out.println("Película " + (i + 1) + ":");
            cartelera[i].mostrarInfo();
        }
    }

    // Muestra los socios de una película específica
    private static void mostrarSociosPelicula(Scanner entrada, Pelicula[] cartelera, int num) {
        if (num == 0) {
            System.out.println("No hay películas registradas.");
            return;
        }
        int pos = leerEntero(entrada, "Número de película (1-" + num + "): ") - 1;
        if (pos >= 0 && pos < num) {
            cartelera[pos].mostrarInfo();
        } else {
            System.out.println("Película no válida.");
        }
    }

    // Muestra la recaudación total de una película específica
    private static void mostrarRecaudacionPelicula(Scanner entrada, Pelicula[] cartelera, int num) {
        if (num == 0) {
            System.out.println("No hay películas registradas.");
            return;
        }
        int pos = leerEntero(entrada, "Número de película (1-" + num + "): ") - 1;
        if (pos >= 0 && pos < num) {
            System.out.println("Recaudación de '" + cartelera[pos].getTitulo() + "': " 
                + cartelera[pos].calcularRecaudacion() + "€");
        } else {
            System.out.println("Película no válida.");
        }
    }

    // Encuentra y muestra la película con mayor coste de licencia
    private static void mostrarPeliculaMasCara(Pelicula[] cartelera, int num) {
        if (num == 0) {
            System.out.println("No hay películas registradas.");
            return;
        }
        Pelicula masCara = cartelera[0];
        for (int i = 1; i < num; i++) {
            if (cartelera[i].getCosteLicencia() > masCara.getCosteLicencia()) {
                masCara = cartelera[i]; // Actualizar película más cara
            }
        }
        System.out.println("Película más cara:");
        System.out.println("Título: " + masCara.getTitulo());
        System.out.println("Coste licencia: " + masCara.getCosteLicencia() + "€");
    }

    // Encuentra y muestra la película con más socios inscritos
    private static void mostrarPeliculaMasSocios(Pelicula[] cartelera, int num) {
        if (num == 0) {
            System.out.println("No hay películas registradas.");
            return;
        }
        Pelicula masSocios = cartelera[0];
        for (int i = 1; i < num; i++) {
            if (cartelera[i].getNumSocios() > masSocios.getNumSocios()) {
                masSocios = cartelera[i]; // Actualizar película con más socios
            }
        }
        System.out.println("Película con más socios:");
        System.out.println("Título: " + masSocios.getTitulo());
        System.out.println("Nº socios: " + masSocios.getNumSocios() + "/4");
    }

    // Muestra socios cuyo nombre empieza por una letra dada
    private static void mostrarSociosPorLetra(Scanner entrada, Pelicula[] cartelera, int num) {
        if (num == 0) {
            System.out.println("No hay películas registradas.");
            return;
        }
        System.out.print("Letra inicial: ");
        String input = entrada.nextLine();
        if (input.isEmpty()) {
            System.out.println("No se introdujo ninguna letra.");
            return;
        }
        char letra = Character.toUpperCase(input.charAt(0));
        boolean encontrado = false;
        
        System.out.println("\nSocios que empiezan por '" + letra + "':");
        // Recorrer todas las películas y sus socios
        for (int i = 0; i < num; i++) {
            Socio[] socios = cartelera[i].getSocios();
            for (int j = 0; j < cartelera[i].getNumSocios(); j++) {
                if (!socios[j].getNombre().isEmpty() && 
                    Character.toUpperCase(socios[j].getNombre().charAt(0)) == letra) {
                    System.out.println("  - " + socios[j].getNombre() + " (Película: " + cartelera[i].getTitulo() + ")");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron socios con esa letra inicial.");
        }
    }

    // Muestra películas cuyo título contiene un texto dado
    private static void mostrarPeliculasPorTexto(Scanner entrada, Pelicula[] cartelera, int num) {
        if (num == 0) {
            System.out.println("No hay películas registradas.");
            return;
        }
        System.out.print("Texto a buscar: ");
        String texto = entrada.nextLine().toLowerCase();
        if (texto.isEmpty()) {
            System.out.println("No se introdujo ningún texto.");
            return;
        }
        boolean encontrado = false;
        
        System.out.println("\nPelículas que contienen '" + texto + "':");
        for (int i = 0; i < num; i++) {
            // Búsqueda insensible a mayúsculas/minúsculas
            if (cartelera[i].getTitulo().toLowerCase().contains(texto)) {
                System.out.println("  - " + cartelera[i].getTitulo());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron películas con ese texto.");
        }
    }

    // Modifica las vocales 'a' por 'e' en la última película
    private static void modificarVocalesUltimaPelicula(Pelicula[] cartelera, int num) {
        if (num == 0) {
            System.out.println("No hay películas registradas.");
            return;
        }
        String tituloOriginal = cartelera[num - 1].getTitulo();
        cartelera[num - 1].modificarVocales(); // Usa el método de la clase Pelicula
        System.out.println("Título original: " + tituloOriginal);
        System.out.println("Título modificado: " + cartelera[num - 1].getTitulo());
    }

    // Convierte todos los títulos a mayúsculas
    private static void convertirTitulosMayusculas(Pelicula[] cartelera, int num) {
        if (num == 0) {
            System.out.println("No hay películas registradas.");
            return;
        }
        for (int i = 0; i < num; i++) {
            cartelera[i].convertirMayusculas(); // Usa el método de la clase Pelicula
        }
        System.out.println("Todos los títulos convertidos a mayúsculas.");
    }

    // Método auxiliar para leer enteros con validación de excepciones
    private static int leerEntero(Scanner entrada, String mensaje) {
        int valor = 0;
        boolean valido = false;
        do {
            try {
                System.out.print(mensaje);
                valor = Integer.parseInt(entrada.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: debe introducir un número entero válido.");
            }
        } while (!valido);
        return valor;
    }

    // Método auxiliar para leer doubles con validación de excepciones
    private static double leerDouble(Scanner entrada, String mensaje) {
        double valor = 0.0;
        boolean valido = false;
        do {
            try {
                System.out.print(mensaje);
                valor = Double.parseDouble(entrada.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: debe introducir un número válido.");
            }
        } while (!valido);
        return valor;
    }
}