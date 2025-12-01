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

    // Esto es para probar cada animal directamente (sin polimorfismo)
    public static void pruebaDirecta() {
        //creo un animal de cada para mostrarlo por pantalla luego
        Perro p = new Perro("Sanchez", 3, 12.5);
        Lobo l = new Lobo("Lobo Gris", 5, 40.0);
        Leon le = new Leon("Simba", 4, 190.0);
        Gato g = new Gato("Garfield", 2, 5.0);

        System.out.println("PRUEBA DIRECTA");
        mostrarAnimal(p);
        mostrarAnimal(l);
        mostrarAnimal(le);
        mostrarAnimal(g);
    }

    // Esto es para mostrar la información de un animal
    public static void mostrarAnimal(Animal a) {
        System.out.println("Nombre: " + a.nombre);
        System.out.println("Edad: " + a.edad + " años");
        System.out.println("Peso: " + a.peso + " kg");
        System.out.println("Sonido: " + a.getSonido());
        System.out.println("Alimentacion: " + a.getAlimentacion());
        System.out.println("Habitat: " + a.getHabitat());
        System.out.println("Nombre cientifico: " + a.getNombreCientifico());
        System.out.println();
    }

    // Esto es para probar con polimorfismo (variables de tipo Animal)
    public static void pruebaPolimorfismo() {
        Animal[] animales = {
            new Perro("Marlene", 4, 15.0),
            new Lobo("Estepario", 6, 45.0),
            new Leon("Mufasa", 7, 200.0),
            new Gato("Silvestre", 3, 4.5)
        };

        System.out.println("PRUEBA CON POLIMORFISMO");
        for (Animal a : animales) {
            mostrarAnimal(a);
        }
    }
}
