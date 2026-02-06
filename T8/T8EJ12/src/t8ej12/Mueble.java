package t8ej12;

public class Mueble {
    // Atributos privados (encapsulación)
    private double precio;        // Precio del mueble en euros
    private String descripcion;   // Descripción del mueble

    // Constructor por defecto: inicializa con valores predeterminados
    public Mueble() {
        this.precio = 0.0;
        this.descripcion = "";
    }

    // Constructor parametrizado: crea un mueble con datos específicos
    public Mueble(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters: obtienen los valores de los atributos
    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Setters: modifican los valores de los atributos
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Representación en cadena del objeto
    @Override
    public String toString() {
        return "Mueble: " + descripcion + " | Precio: " + precio + "€";
    }
}