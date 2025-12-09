package repaso_12;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    public static void probarTest() {

        Scanner entrada = new Scanner(System.in);

        double hipotenusa;
        double c1;
        double c2;

        Triangulo tri = new Triangulo();

        System.out.println("Escribe el primer cateto");
        tri.setCateto1(entrada.nextDouble());

        System.out.println("Escribe el segundo cateto");
        tri.setCateto2(entrada.nextDouble());
        
        c1 = tri.getCateto1();
        c2 = tri.getCateto2();
        
        System.out.println("La hipotenusa es:");
        hipotenusa = Math.sqrt((c1 * c1) + (c2 * c2));
        
        System.out.println(hipotenusa);
        
        

    }

}
