package repaso_19;

import javax.xml.transform.stream.StreamResult;

/**
 *
 * @author Admin
 */
public class Test {

    public static void probarTest() {
        Empleado emp1 = new Empleado("Emp1", 40, 10);
        Empleado emp2 = new Empleado("Emp2", 45, 10);
        Empleado emp3 = new Empleado("Emp3", 50, 10);

        double sueldo1 = emp1.getHoras();
        double sueldo2 = emp2.getHoras();
        double sueldo3 = emp3.getHoras();
        double tar1 = emp1.getTarifa();
        double tar2 = emp2.getTarifa();
        double tar3 = emp3.getTarifa();
        double resultado;
        double pagar;
        double normal;

        if (sueldo1 > 40) {
            resultado = sueldo1 - 40;
            normal = 40 * tar1;
            pagar = normal + (tar1 * resultado * 1.5);
            System.out.println("Empleado uno ha ganado: " + pagar);

        } else {
            pagar = sueldo1 * tar1;
            System.out.println("Empleado uno ha ganado: " + pagar);
        }
        
        
        if (sueldo2 > 40) {
            resultado = sueldo2 - 40;
            normal = 40 * tar2;
            pagar = normal + (tar2 * resultado * 1.5);
            System.out.println("Empleado dos ha ganado: " + pagar);

        } else {
            pagar = sueldo2 * tar2;
            System.out.println("Empleado dos ha ganado: " + pagar);
        }
        if (sueldo3 > 40) {
            resultado = sueldo3 - 40;
            normal = 40 * tar3;
            pagar = normal + (tar3 * (resultado * 1.5));
            System.out.println("Empleado tres ha ganado: " + pagar);

        } else {
            pagar = sueldo3 * tar3;
            System.out.println("Empleado tres ha ganado: " + pagar);
        }

    }

}
