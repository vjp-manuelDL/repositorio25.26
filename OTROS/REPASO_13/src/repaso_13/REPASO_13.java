/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_13;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class REPASO_13 {

    final static String Resp1 = "cara";
    final static String Resp2 = "cruz";

    /**
     * @param args the command line arguments
     */
    public static int genRandom() {
        int random = 0;
        random = (int) (Math.random() * 2);
        return random;
    }
    
    public static String pedirLado(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el lado que cree que es");
        return entrada.nextLine();
    }

    public static void main(String[] args) {
        boolean acertado = false;
        
        while (!acertado) {
            String eleccion = pedirLado().toLowerCase();
            
            if (eleccion.equals(Resp1) || eleccion.equals(Resp2)){
                int num = genRandom();
                String resultado;
                if (num % 2 == 0){
                    resultado = Resp1;
                }
                else {
                    resultado = Resp2;
                }
                
                System.out.println("La moneda salio: " + resultado);
                if(eleccion.equals(resultado)){
                    System.out.println("ENHORABUENA HAS ACERTADO");
                }
                else{
                    System.out.println("ERROR, la respuesta era: " + resultado);
                }
            }
            
            
        }

    }
}
