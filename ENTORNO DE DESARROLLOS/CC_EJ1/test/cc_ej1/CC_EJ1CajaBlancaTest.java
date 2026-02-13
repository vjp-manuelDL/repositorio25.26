package cc_ej1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CC_EJ1CajaBlancaTest {
    
    private CC_EJ1 bb = new CC_EJ1();
    
    
    @Test
    public void testCajaBlanca_Camino1_NoEncontrado() {
        assertEquals(-1, bb.busquedaBinaria(100));
    }
    
    @Test
    public void testCajaBlanca_Camino2_EncontradoCentro() {
        assertEquals(4, bb.busquedaBinaria(5));
    }
    
    @Test
    public void testCajaBlanca_Camino3_IrDerecha() {
        assertEquals(9, bb.busquedaBinaria(10));
    }
    
    @Test
    public void testCajaBlanca_Camino4_IrIzquierda() {
        assertEquals(0, bb.busquedaBinaria(1));
    }
}