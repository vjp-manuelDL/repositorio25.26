package t8ej15;

public class Pelicula {
    // Atributos de la clase Película
    private String titulo;          // Título de la película
    private double costeLicencia;   // Coste de la licencia de proyección
    private Socio[] socios;         // Array para almacenar hasta 4 socios (aforo máximo)
    private int numSocios;          // Contador de socios reales inscritos

    // Constructor: inicializa la película y reserva espacio para 4 socios
    public Pelicula(String titulo, double costeLicencia) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socios = new Socio[4]; // Aforo máximo de 4 socios
        this.numSocios = 0;         // Inicialmente sin socios
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCosteLicencia() {
        return costeLicencia;
    }

    public int getNumSocios() {
        return numSocios;
    }

    public Socio[] getSocios() {
        return socios;
    }

    // Método para añadir un socio (controla el aforo máximo de 4)
    public boolean anadirSocio(Socio socio) {
        if (numSocios < 4) {
            socios[numSocios] = socio; // Añade el socio en la siguiente posición libre
            numSocios++;               // Incrementa el contador de socios
            return true;               // Éxito
        }
        return false; // Aforo completo
    }

    // Calcula la recaudación total sumando las aportaciones de todos los socios
    public double calcularRecaudacion() {
        double total = 0.0;
        for (int i = 0; i < numSocios; i++) {
            total += socios[i].getPrecioAbonado();
        }
        return total;
    }

    // Muestra información completa de la película
    public void mostrarInfo() {
        System.out.println("Película: " + titulo);
        System.out.println("Coste licencia: " + costeLicencia + "€");
        System.out.println("Socios (" + numSocios + "/4):");
        
        if (numSocios == 0) {
            System.out.println("  - Sin socios inscritos");
        } else {
            // Muestra cada socio inscrito
            for (int i = 0; i < numSocios; i++) {
                System.out.println("  " + (i + 1) + ". " + socios[i].toString());
            }
        }
        System.out.println("Recaudación total: " + calcularRecaudacion() + "€");
        System.out.println("----------------------------------------");
    }
}