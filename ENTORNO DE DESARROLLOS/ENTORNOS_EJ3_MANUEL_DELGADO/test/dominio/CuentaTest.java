package dominio;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manuel
 */
public class CuentaTest {
    
    private Cuenta cuenta;
    
    @Before
    public void setUp() {
        cuenta = new Cuenta("Ana García", 1000.0);
    }
    
    // Test constructor con cantidad positiva
    @Test
    public void testConstructorConCantidadPositiva() {
        Cuenta c = new Cuenta("Luis", 500.0);
        assertEquals("Luis", c.getTitular());
        assertEquals(500.0, c.getCantidad(), 0.01);
    }
    
    // Test constructor con cantidad negativa (debe ser 0.0)
    @Test
    public void testConstructorConCantidadNegativa() {
        Cuenta c = new Cuenta("María", -200.0);
        assertEquals("María", c.getTitular());
        assertEquals(0.0, c.getCantidad(), 0.01);
    }
    
    // Test constructor sin cantidad (por defecto 0.0)
    @Test
    public void testConstructorSinCantidad() {
        Cuenta c = new Cuenta("Carlos");
        assertEquals("Carlos", c.getTitular());
        assertEquals(0.0, c.getCantidad(), 0.01);
    }
    
    // Test ingresar cantidad positiva
    @Test
    public void testIngresarPositivo() {
        cuenta.ingresar(200.0);
        assertEquals(1200.0, cuenta.getCantidad(), 0.01);
    }
    
    // Test ingresar cantidad negativa (debe ignorarse)
    @Test
    public void testIngresarNegativoIgnorado() {
        cuenta.ingresar(-100.0);
        assertEquals(1000.0, cuenta.getCantidad(), 0.01);
    }
    
    // Test retirar cantidad normal
    @Test
    public void testRetirarNormal() {
        cuenta.retirar(300.0);
        assertEquals(700.0, cuenta.getCantidad(), 0.01);
    }
    
    // Test retirar todo el saldo
    @Test
    public void testRetirarTodo() {
        cuenta.retirar(1000.0);
        assertEquals(0.0, cuenta.getCantidad(), 0.01);
    }
    
    // Test retirar más de lo que hay (saldo debe ser 0.0)
    @Test
    public void testRetirarExceso() {
        cuenta.retirar(1500.0);
        assertEquals(0.0, cuenta.getCantidad(), 0.01);
    }
    
    // Test retirar cantidad negativa (debe ignorarse)
    @Test
    public void testRetirarNegativoIgnorado() {
        cuenta.retirar(-200.0);
        assertEquals(1000.0, cuenta.getCantidad(), 0.01);
    }
    
    // Test toString
    @Test
    public void testToString() {
        String esperado = "Cuenta[titular=Ana García, cantidad=1000.0 €]";
        assertEquals(esperado, cuenta.toString());
    }
}