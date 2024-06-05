
package munozh.tp5.inga;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class parameterTest {
    private double n1;
    private double n2;
    private double ex;

    public parameterTest(double n1, double n2, double ex) {
        this.n1 = n1;
        this.n2 = n2;
        this.ex = ex;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {8, 7, 15},
            {2, 0, 2},
            {10, -1, 9}
        });
    }

    @Test
    public void testDivCero() {
        Calculadora calculadora = new Calculadora();
        assertEquals(ex, calculadora.sumar(n1, n2), 0.001);
    }
}

