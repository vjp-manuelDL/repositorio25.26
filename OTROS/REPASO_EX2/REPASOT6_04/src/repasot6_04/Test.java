/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasot6_04;

/**
 *
 * @author Admin
 */
public class Test {

    public static void probarTest() {
        
        Gato gato = new Gato("SOUSOU", 12, (float) 3.5);
        Perro perro = new Perro("Sanchez", 4, (float) 9.3);
        Lobo lobo = new Lobo("Mufasa", 12, 7);
        Leon leon = new Leon("MaryKita", 5, (float) 30.2);
        
       gato.mostrarInfo();
       gato.mostarGenero();
       gato.mostrarAlimentacion();
       gato.mostrarHabidad();
       gato.mostrarNombreCienti();
       gato.mostrarSonido();
       
       
       perro.mostrarInfo();
       perro.mostarGenero();
       perro.mostrarAlimentacion();
       perro.mostrarHabidad();
       perro.mostrarNombreCienti();
       perro.mostrarSonido();
       
       
       lobo.mostrarInfo();
       lobo.mostarGenero();
       lobo.mostrarAlimentacion();
       lobo.mostrarHabidad();
       lobo.mostrarNombreCienti();
       lobo.mostrarSonido();
       
       
       leon.mostrarInfo();
       leon.mostarGenero();
       leon.mostrarAlimentacion();
       leon.mostrarHabidad();
       leon.mostrarNombreCienti();
       leon.mostrarSonido();
    }

}
