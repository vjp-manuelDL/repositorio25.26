package repaso_13;

/**
 *
 * @author Admin
 */
public class Test {
    
    public static void probarTest(){
        
        Saludo saludo1 = new Saludo();
        
        saludo1.setFrase("Hola, que tal");
        
        for (int i = 0; i < 5; i++) {
            System.out.println(saludo1.getFrase());
            
        }
        
    }
    
    
}
