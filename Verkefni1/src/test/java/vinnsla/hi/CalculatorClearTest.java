package vinnsla.hi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorClearTest {
    private Calculator calculator;

    @Before
    public void createCalculator() {
        this.calculator = new Calculator();
    }

    @Before
    public void setCalculator() {
        calculator.setOperatorIndex(0);
        calculator.setNum1(3);
        calculator.setNum2(7);
    }

    @Test
    public void clearTest() {
        calculator.clear();
        Assert.assertEquals(0, calculator.calculate());
    }
}
