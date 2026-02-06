package t8ej16;

public class Socio {
    // Atributos privados de la clase Socio (encapsulación)
    private String nombre;          // Nombre del socio de la asociación
    private double precioAbonado;   // Aportación voluntaria realizada por el socio

    // Constructor por defecto: inicializa con valores predeterminados vacíos/0
    public Socio() {
        this.nombre = "";           // Cadena vacía como valor inicial
        this.precioAbonado = 0.0;   // 0 euros como aportación inicial
    }

    // Constructor parametrizado: permite crear un socio con datos específicos
    public Socio(String nombre, double precioAbonado) {
        this.nombre = nombre;               // Asigna el nombre recibido
        this.precioAbonado = precioAbonado; // Asigna la aportación recibida
    }

    // Getter para obtener el nombre del socio
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar el nombre del socio
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener la aportación del socio
    public double getPrecioAbonado() {
        return precioAbonado;
    }

    // Setter para modificar la aportación del socio
    public void setPrecioAbonado(double precioAbonado) {
        this.precioAbonado = precioAbonado;
    }

    // Método toString: devuelve una representación en cadena del objeto Socio
    @Override
    public String toString() {
        return "Socio: " + nombre + " | Aportación: " + precioAbonado + "€";
    }
}