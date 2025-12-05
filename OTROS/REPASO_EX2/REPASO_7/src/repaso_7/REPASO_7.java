package repaso_7;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class REPASO_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String respuesta;
        String nombre;
        double tamaño;
        int velocidad;
        
       do {
           nombre = Test.pedirNombre();
           tamaño = Test.pedirTamaño();
           velocidad = Test.pedirVelocidad();
           Descarga descarga = new Descarga(nombre, tamaño, velocidad);
           Test.calculoDatos(descarga);
           System.out.println("Quiere calcular otro  archivo?");
           respuesta= entrada.nextLine();
           
       }while (respuesta.equalsIgnoreCase("si"));
            
            
        
        
    
}
}
