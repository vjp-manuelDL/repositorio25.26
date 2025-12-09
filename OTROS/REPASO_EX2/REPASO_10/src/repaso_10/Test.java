package repaso_10;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    public static void probarTest() {
        int temp = 0;
        Scanner entrada = new Scanner(System.in);

        Numero num1 = new Numero();
        System.out.println("Escriba el primer numero");
        num1.setValor(entrada.nextInt());
        Numero num2 = new Numero();
        System.out.println("Escriba el sergundo numero");
        num2.setValor(entrada.nextInt());

        Numero num3 = new Numero();
        System.out.println("Escriba el tercer numero");
        num3.setValor(entrada.nextInt());
        Numero num4 = new Numero();
        System.out.println("Escriba el cuarto numero");
        num4.setValor(entrada.nextInt());
        int n1 = num1.getValor();
        int n2 = num2.getValor();
        int n3 = num3.getValor();
        int n4 = num4.getValor();
        
        if (n1 > n2) { temp = n1; n1 = n2; n2 = temp; }
        if (n1 > n3) { temp = n1; n1 = n3; n3 = temp; }
        if (n1 > n4) { temp = n1; n1 = n4; n4 = temp; }

        // Segunda pasada: asegurar que n2 sea el segundo más pequeño
        if (n2 > n3) { temp = n2; n2 = n3; n3 = temp; }
        if (n2 > n4) { temp = n2; n2 = n4; n4 = temp; }

        // Tercera pasada: asegurar que n3 <= n4
        if (n3 > n4) { temp = n3; n3 = n4; n4 = temp; }
        
        System.out.println("El orden de menor a mayor es: " + n1 + " " + n2 + " " + n3 + " " + n4);


        

    }

}
