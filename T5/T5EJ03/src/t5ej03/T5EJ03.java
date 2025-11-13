/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ej03;

/**
 *
 * @author alumno
 */
public class T5EJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Crear 2 ruedas
        Rueda rueda1 = new Rueda();
        rueda1.setMaterial("Caucho");
        rueda1.setPulgadas(16);

        Rueda rueda2 = new Rueda();
        rueda2.setMaterial("Aleación");
        rueda2.setPulgadas(18);

        // Mostrar datos de las ruedas
        System.out.println("Rueda 1 -> Material: " + rueda1.getMaterial() + ", Pulgadas: " + rueda1.getPulgadas());
        System.out.println("Rueda 2 -> Material: " + rueda2.getMaterial() + ", Pulgadas: " + rueda2.getPulgadas());

        // Crear 3 coches
        Coche coche1 = new Coche();
        coche1.setMarca("Volkswagen");
        coche1.setModelo("Golf");
        coche1.setRueda(rueda1);

        Coche coche2 = new Coche();
        coche2.setMarca("Opel");
        coche2.setModelo("Astra");
        coche2.setRueda(rueda1);

        Coche coche3 = new Coche();
        coche3.setMarca("Citroën");
        coche3.setModelo("C3");
        coche3.setRueda(rueda2);

        // Mostrar datos de los coches
        System.out.println("Coche 1 -> Marca: " + coche1.getMarca() + 
                ", Modelo: " + coche1.getModelo() + 
                ", Rueda: " + coche1.getRueda().getMaterial() + 
                " (" + coche1.getRueda().getPulgadas() + " pulgadas)");

        System.out.println("Coche 2 -> Marca: " + coche2.getMarca() + 
                ", Modelo: " + coche2.getModelo() + 
                ", Rueda: " + coche2.getRueda().getMaterial() + 
                " (" + coche2.getRueda().getPulgadas() + " pulgadas)");

        System.out.println("Coche 3 -> Marca: " + coche3.getMarca() + 
                ", Modelo: " + coche3.getModelo() + 
                ", Rueda: " + coche3.getRueda().getMaterial() + 
                " (" + coche3.getRueda().getPulgadas() + " pulgadas)");
    }
    
}
