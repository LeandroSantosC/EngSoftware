package unitTest.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import unitTest.Calculadora;

public class CalculadoraTest {

    @Test
    public void deveriaSubtrairInteiros(){
        Calculadora cal = Calculadora.getInstance();
        assertEquals(5,cal.diferenca(7, 2));
    }
    
    @Test
    public void deveriaDividirInteiros(){
        Calculadora cal = Calculadora.getInstance();   
        assertEquals(5,cal.divisao(10, 2));
    }

    @Test
    public void deveriaMultiplicarInteiros(){
        Calculadora cal = Calculadora.getInstance();   
        assertEquals(14,cal.produto(7, 2));
    }

    @Test
    public void deveriaSomarInteiros(){
        Calculadora cal = Calculadora.getInstance();
        assertEquals(9,cal.soma(7, 2));
    }

}
