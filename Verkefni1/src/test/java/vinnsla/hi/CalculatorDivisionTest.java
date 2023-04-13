package vinnsla.hi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorDivisionTest{
    private Calculator calculator;

    @Before
    public void createCalculator(){
        this.calculator = new Calculator();
    }
    @Test
    public void testDivision(){
        calculator.setOperatorIndex(2);
        calculator.setNum1(6);
        calculator.setNum2(3);
        Assert.assertEquals(2, calculator.calculate());
    }

}
