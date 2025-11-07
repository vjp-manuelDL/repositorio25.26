/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaclase;

/**
 *
 * @author Admin
 */
public class PruebaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Azul");
        bici1.setTipo("Montaña");
        bici1.setAntiguedad(15);

        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Canondale");
        bici2.setColor("Roja");
        bici2.setTipo("Carretera");
        bici2.setAntiguedad(20);

        bici1.mostrarAntiguedad();
        System.out.println("");
        bici2.mostrarAntiguedad();

        bici1.mostrarBicicleta();
        System.out.println("");
        bici2.mostrarBicicleta();
        // TODO code application logic here
    }

}
