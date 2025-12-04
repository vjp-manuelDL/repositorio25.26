package repaso1;

/**
 *
 * @author alumno
 */
public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean encendido;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public void setModelo(String n) {
        modelo = n;
    }

    public void setColor(String col) {
        color = col;
    }


    

    public void arrancarCoche(){
        if (!encendido){
            encendido = true;
            System.err.println("Se ha encendido el motor");
            velocidad = 10;
        }
        else{
            System.err.println("El coche ya estaba encendido");
        }
    }
    
    public void apagarCoche(){
        if (!encendido){
            System.err.println("El coche ha estaba apagado");
        }
        else{
            System.err.println("El coche se ha apagado");
            velocidad = 0;
        }
    }
    
    public void acelerarCoche(){
        velocidad += 20;
    }
    public void frenarCoche(){
        velocidad -= 6;
    }
    
    public void mostrarInfo(){
        System.out.println("Motor ecendido: " + encendido);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad);
    }

   
}
