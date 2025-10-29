package t4ej12;
import java.util.Scanner;

/**
 *
 * @author alumno
 */

public class T4EJ12 {

    public static int pedirContra(){
    Scanner entrada = new Scanner(System.in);
    int contra;
    int intentos = 0;
            System.out.println("Escribe la contraseña de 4 digitos"
+ " este es tu :" + intentos + "intento de 3 intentos");
            contra = entrada.nextInt();
            return contra;
}
        public static boolean comproBar(int contraIntroducida){
            int acertar = 1234;
            return contraIntroducida == acertar;
        }
    public static void mostrarResultado(boolean acceso){
        if (acceso){
            System.out.println("Enhorabuena.Contraseña correcta");
        } else {
            System.out.println("ERROR. Acceso denegado");}
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intentos = 0;
        boolean acceso = false;
        while ( intentos < 3 && !acceso){
            int contra = T4EJ12.pedirContra();
            acceso = t4ej12.comproBar(contra);
            intentos++;
        }
        // TODO code application logic here
    }
