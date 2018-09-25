import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareRootTests {
    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {

        System.out.println("Tests started!!! ");
    }

    @Test
    public void testSquareRootValue() {
        assertEquals("square root from 100 must be 10", 10.0, calc.squareRoot(100));
    }


    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
