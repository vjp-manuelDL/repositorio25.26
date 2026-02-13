package cc_ej1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CC_EJ1CajaNegraTest {
    
    private CC_EJ1 bb = new CC_EJ1();
    
    
    @Test
    public void testCajaNegra_ParticionValida() {
        // Valor dentro del rango del array [1,10]
        assertEquals(0, bb.busquedaBinaria(1)); // 1 está en posición 0
    }
    
    @Test
    public void testCajaNegra_ParticionInvalida() {
        // Valor fuera del rango del array (>10)
        assertEquals(-1, bb.busquedaBinaria(33)); // 33 no existe
    }
}