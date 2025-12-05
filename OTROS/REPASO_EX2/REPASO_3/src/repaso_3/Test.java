package repaso_3;

/**
 *
 * @author alumno
 */
public class Test {

    public static void intPrueba() {
        Rueda r1 = new Rueda();
        Rueda r2 = new Rueda();

        //rueda 1
        r1.setMaterial(" Aluminio ");
        r1.setPulgadas(10);

        System.out.println("Rueda 1: " + r1.getMaterial() + r1.getPulgadas());

        //rueda 2
        r2.setMaterial(" Madera ");
        r2.setPulgadas(12);

        System.out.println("Rueda 2: " + r2.getMaterial() + r2.getPulgadas());

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        coche1.setMarca("BMW");
        coche1.setModelo(" 7");
        coche2.setMarca("AUDI");
        coche2.setModelo(" A5");
        coche3.setMarca("TOYOTA");
        coche3.setModelo(" CELICA");
        
        coche1.setRueda(r1);
        coche2.setRueda(r1);
        coche3.setRueda(r2);
        
        //mostramos
        
        System.out.println("COCHE 1: " + coche1.getMarca() + coche1.getModelo() + coche1.getRueda());
        System.out.println("COCHE 2: " + coche2.getMarca() + coche2.getModelo() + coche2.getRueda());
        System.out.println("COCHE 3: " + coche3.getMarca() + coche3.getModelo() + coche3.getRueda());
        

    }
}
