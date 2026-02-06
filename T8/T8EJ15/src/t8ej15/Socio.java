package t8ej15;

public class Socio {
    // Atributos privados de la clase Socio
    private String nombre;          // Nombre del socio
    private double precioAbonado;   // Aportación voluntaria del socio

    // Constructor por defecto: inicializa con valores vacíos/0
    public Socio() {
        this.nombre = "";
        this.precioAbonado = 0.0;
    }

    // Constructor parametrizado: crea un socio con datos específicos
    public Socio(String nombre, double precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }

    // Getters: métodos para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public double getPrecioAbonado() {
        return precioAbonado;
    }

    // Setters: métodos para modificar los valores de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioAbonado(double precioAbonado) {
        this.precioAbonado = precioAbonado;
    }

    // Representación en cadena del objeto Socio
    @Override
    public String toString() {
        return "Socio: " + nombre + " | Aportación: " + precioAbonado + "€";
    }
}