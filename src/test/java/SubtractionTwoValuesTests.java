import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SubtractionTwoValuesTests {
    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {

        System.out.println("Tests started!!! ");
    }

    @Test
    public void testSubtractionTwoPositiveValues() {
        assertEquals("10 - 5 must be 5", 5, calc.subtraction(10, 5));
    }

    @Test
    public void testSubtractionTwoNegativeValues() {
        assertEquals("-10 - (-5) must be -5", -5, calc.subtraction(-10, -5));
    }

    @Test
    public void testSubtractionPositiveAndNegativeValues() {
        assertEquals("10 - (-5) must be 15", 15, calc.subtraction(10, -5));
    }

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
