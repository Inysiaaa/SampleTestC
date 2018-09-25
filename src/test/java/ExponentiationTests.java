import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExponentiationTests {
    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {

        System.out.println("Tests started!!! ");
    }

    @Test
    public void testExponentiationPositiveValues() {
        assertEquals("10^2 must be 100", 100.0, calc.exponentiation(10, 2));
    }

    @Test
    public void testExponentiationNegativeValues() {
        assertEquals("-10^2 must be 100", 100.0, calc.exponentiation(-10, 2));
    }


    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
