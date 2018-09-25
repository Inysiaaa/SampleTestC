import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DivisionTwoValuesTests {
    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {

        System.out.println("Tests started!!! ");
    }

    @Test
    public void testDivisionTwoPositiveValuesTests() {
        int b = 5;

        if (b == 0) {
            System.out.println("Деление на 0 невозможно");
        } else {
            assertEquals("10 / 5 must be 2", 2, calc.division(10, 5));
        }
    }

    @Test
    public void testDivisionOnNullValuesTests() {
        int b = 0;

        if (b == 0) {
            System.out.println("Деление на 0 невозможно");
        } else {
            assertEquals("10 / 0 must be 0", 0, calc.division(10, 0));
        }
    }

    @Test
    public void testDivisionTwoNegativeValues () {
            assertEquals("-10 / -5 must be 2", 2, calc.division(10, 5));

    }

    @Test
    public void testDivisionPositiveAndNegativeValues () {
            assertEquals("10 / -5 must be -2", -2, calc.division(10, -5));
    }

    @After
    public void consolePrintAfter () {
            System.out.println("Tests finished!!! ");

    }
}
