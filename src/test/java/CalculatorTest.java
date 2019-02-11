import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(6, 3);
    }

    @Test
    public void add() {
        assertEquals(9, calculator.add());
    }

@Test
    public void subtract() {
        assertEquals(3, calculator.subtract());
}

@Test
    public void multiply() {
        assertEquals(18, calculator.multiply());
}


@Test
    public void divide() {
        assertEquals(2, calculator.divide());
}

}

