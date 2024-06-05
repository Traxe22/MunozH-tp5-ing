package munozh.tp5.inga;

import munozh.tp5.inga.Calculadora;
import org.junit.Test;

public class DivisionesTest {
    @Test(expected = ArithmeticException.class)
    public void testDivisionCero() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(1.0, 0.0);
    }
}
