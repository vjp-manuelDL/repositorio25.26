/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6ej04;

/**
 *
 * @author Admin
 */
public class Test {
    public void ejecutar(){
      System.out.println("--INSTANCIAS DIRECTAS--");
        
        // Aquí creo un perro con nombre, edad y peso, y lo guardo en una variable de tipo Perro
        Perro perro1 = new Perro("Sanchez", 1, 20);
        perro1.mostrarInfo();
        perro1.hacerSonido();
        perro1.mostrarAlimentacion();
        perro1.mostrarHabitat();
        perro1.mostrarNombreCientifico();
        System.out.println();
        
        Lobo lobo1 = new Lobo("Lobo", 5, 40.0);
        lobo1.mostrarInfo();
        lobo1.hacerSonido();
        lobo1.mostrarAlimentacion();
        lobo1.mostrarHabitat();
        lobo1.mostrarNombreCientifico();
        System.out.println();

        Leon leon1 = new Leon("Simba", 4, 190.0);
        leon1.mostrarInfo();
        leon1.hacerSonido();
        leon1.mostrarAlimentacion();
        leon1.mostrarHabitat();
        leon1.mostrarNombreCientifico();
        System.out.println();

        Gato gato1 = new Gato("Michi", 2, 4.5);
        gato1.mostrarInfo();
        gato1.hacerSonido();
        gato1.mostrarAlimentacion();
        gato1.mostrarHabitat();
        gato1.mostrarNombreCientifico();
        System.out.println();

        // Segunda parte: POLIMORFISMO
        System.out.println("--CON POLIMORFISMO--");

        // Aquí creo un perro, pero lo guardo en una variable de tipo Animal
        Animal perro2 = new Perro("Rex", 2, 10.0);
        perro2.mostrarInfo();
        perro2.hacerSonido();
        perro2.mostrarAlimentacion();
        perro2.mostrarHabitat();
        perro2.mostrarNombreCientifico();
        System.out.println();

        Animal lobo2 = new Lobo("Aullador", 6, 38.0);
        lobo2.mostrarInfo();
        lobo2.hacerSonido();
        lobo2.mostrarAlimentacion();
        lobo2.mostrarHabitat();
        lobo2.mostrarNombreCientifico();
        System.out.println();

        Animal leon2 = new Leon("Mufasa", 7, 210.0);
        leon2.mostrarInfo();
        leon2.hacerSonido();
        leon2.mostrarAlimentacion();
        leon2.mostrarHabitat();
        leon2.mostrarNombreCientifico();
        System.out.println();

        Animal gato2 = new Gato("Luna", 1, 3.8);
        gato2.mostrarInfo();
        gato2.hacerSonido();
        gato2.mostrarAlimentacion();
        gato2.mostrarHabitat();
        gato2.mostrarNombreCientifico();
    }
}
