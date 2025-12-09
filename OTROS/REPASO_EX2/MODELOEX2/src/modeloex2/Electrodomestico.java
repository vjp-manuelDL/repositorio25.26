package modeloex2;

/**
 *
 * @author Admin
 */
public abstract class Electrodomestico {
    protected String marca;
    protected char consumoE;
    protected double precioBase;

    public Electrodomestico(String marca, char consumoE, double precioBase) {
        this.marca = marca;
        this.consumoE = consumoE;
        this.precioBase = precioBase;
    }

    public Electrodomestico() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    public abstract void mostrarFuncion();
    
    public abstract void calcularConsumoMensual(double horasUso);
    
    
}
