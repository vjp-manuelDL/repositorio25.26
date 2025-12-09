package repaso_15;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    public static void probarTest() {
        Scanner entrada = new Scanner(System.in);

        Direccion dir1 = new Direccion();
        dir1.setCalle("Calle 1");
        dir1.setCiudad("CIUAD 1");
        dir1.setNumero(2);
        dir1.setPiso(1);

        Direccion dir2 = new Direccion();
        dir2.setCalle("Calle 2");
        dir2.setCiudad("CIUAD 2");
        dir2.setNumero(3);
        dir2.setPiso(2);

        Direccion dir3 = new Direccion();
        dir3.setCalle("Calle 3");
        dir3.setCiudad("CIUAD 3");
        dir3.setNumero(4);
        dir3.setPiso(3);

        Empleado emp1 = new Empleado();
        emp1.setNombre("Luc ass");
        emp1.setSalario(1000);
        emp1.setDireccion(dir1);
        
        Empleado emp2 = new Empleado();
        emp2.setNombre("Time Man");
        emp2.setSalario(2000);
        emp2.setDireccion(dir2);

        Empleado emp3 = new Empleado();
        emp3.setNombre("Yisus");
        emp3.setSalario(3000);
        emp3.setDireccion(dir3);
        
        System.out.println("EMPLEADO 1:");
        System.out.println(emp1.getNombre());
        System.out.println(emp1.getSalario());
        System.out.println(emp1.getDireccion());
        
        System.out.println("EMPLEADO 2:");
        System.out.println(emp2.getNombre());
        System.out.println(emp2.getSalario());
        System.out.println(emp2.getDireccion());
        
        System.out.println("EMPLEADO 3:");
        System.out.println(emp3.getNombre());
        System.out.println(emp3.getSalario());
        System.out.println(emp3.getDireccion());
    }

}
