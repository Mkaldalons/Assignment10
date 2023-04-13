package vinnsla.hi;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorSubtractionTest {
    private Calculator calculator;

    @Before
    public void createCalculator() {
        this.calculator = new Calculator();
    }

    @Test
    public void testSubtraction() {
        calculator.setOperatorIndex(1);
        calculator.setNum1(3);
        calculator.setNum2(2);
        Assert.assertEquals(1, calculator.calculate());
    }
}
