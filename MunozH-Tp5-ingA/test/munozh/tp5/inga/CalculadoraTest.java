
package munozh.tp5.inga;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TestName;

public class CalculadoraTest {
    private static Calculadora calculadora;
    @Rule
    public TestName testName = new TestName();
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void inicializarCalculadora(){
        calculadora = new Calculadora();
        System.out.println("Bienvenido al test de calculadora.");
    }
    
    @AfterClass
    public static void finalizarClase() {
        System.out.println("La operacion ha finalizado");
    }
    
    @Before
    public void inicializarMetodo() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    /*
     @Before
    public void inicializarMetodo() {
        System.out.println("Ejecutando test: " + testName.getMethodName());
    }
    */
    
    @After
    public void finalizarMetodo() {
        System.out.println("Prueba finaliza, en campos en 0");
    }

    @Test
    public void testSuma(){
        assertEquals(5.0,calculadora.sumar(2.0, 3.0),0.001);
    }
    @Test
    public void testResta(){
        assertEquals(1.0, calculadora.restar(3.0, 2.0),0.001);
    }
    
    
}
