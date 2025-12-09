package repaso_11;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    
    public static void probarTest(){
        Scanner entrada = new Scanner(System.in);
        
        Numero num1 = new Numero();
        System.out.println("Escriba el primer numero");
        num1.setValor(entrada.nextDouble());
        Numero num2 = new Numero();
        System.out.println("Escriba el segundo numero");
        num2.setValor(entrada.nextDouble());
        
        double n1 = num1.getValor();
        double n2 = num2.getValor();
        
        if (n1 > 10) {
            System.out.println("El resultado es una multiplicacion");
            double producto = n1 * n2;
            System.out.println("Resultado: " + producto);
            
        }
        if (n1 < 10) {
            System.out.println("El resultado es una suma");
            double suma = n1 + n2;
            System.out.println("Resultado: " + suma);
            
        }
        
        
        
        
        
        
    }
    
}
