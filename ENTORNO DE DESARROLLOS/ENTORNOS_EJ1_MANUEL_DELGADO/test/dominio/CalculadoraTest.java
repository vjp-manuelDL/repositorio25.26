package dominio;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    private Calculadora calc;
    
    @Before
    public void setUp() {
        calc = new Calculadora(10, 5); // operando1=10, operando2=5
    }
    
    @Test
    public void testSumar() {
        assertEquals(15.0, calc.sumar(), 0.001);
    }
    
    @Test
    public void testRestar() {
        assertEquals(5.0, calc.restar(), 0.001);
    }
    
    @Test
    public void testMultiplicar() {
        assertEquals(50.0, calc.multiplicar(), 0.001);
    }
    
    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(), 0.001);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        Calculadora calcCero = new Calculadora(10, 0);
        calcCero.dividir();
    }
    
    @Test
    public void testValoresNegativos() {
        Calculadora calcNeg = new Calculadora(-8, -2);
        assertEquals(-10.0, calcNeg.sumar(), 0.001);
        assertEquals(-6.0, calcNeg.restar(), 0.001);
    }
}