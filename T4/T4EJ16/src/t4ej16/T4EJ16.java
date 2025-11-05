/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4ej16;

/**
 *
 * @author Admin
 */
public class T4EJ16 {
    public static double raiz64(){
        return Math.sqrt(64);
    }
    public static double ochoCubo(){
        return  Math.pow(8, 3);
    }
    
    public static double expoNente(){
        return Math.exp(2);
    }
    
    public static double logaRITMO(){
        return Math.log(2.71828);
    }
    
    public static int menorValor(){
        return Math.min(2, 3);
    }
    
    public static double absoLUTO(){
        return Math.abs(-4.5);
    }
        public static double redondear(){
        return Math.round(-4.5);
        }
        public static double grado(){
        return Math.sin(Math.toRadians(45));
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Raíz cuadrada de 64: " + raiz64());
        System.out.println("8 elevado al cubo: " + ochoCubo());
        System.out.println("Exponencial de 2: " + expoNente());
        System.out.println("Logaritmo de 2.71828: " + logaRITMO());
        System.out.println("Menor valor entre 2 y 3: " + menorValor());
        System.out.println("Valor absoluto de -4.5: " + absoLUTO());
        System.out.println("Redondeo de -4.5: " + redondear());
        System.out.println("Seno de 45 grados: " + grado());
        // TODO code application logic here
    }
    
}
