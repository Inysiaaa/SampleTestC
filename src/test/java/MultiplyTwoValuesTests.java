import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MultiplyTwoValuesTests {
    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {

        System.out.println("Tests started!!! ");
    }

    @Test
    public void testMultiplyTwoPositiveValues() {
        assertEquals("10 * 5 must be 50", 50, calc.multiply(10, 5));
    }

    @Test
    public void testMultiplyTwoNegativeValues() {
        assertEquals("-10 * -5 must be 50", 50, calc.multiply(-10, -5));
    }

    @Test
    public void testMultiplyPositiveAndNegativeValues() {
        assertEquals("10 * -5 must be -50", -50, calc.multiply(10, -5));
    }

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
