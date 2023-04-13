package vinnsla.hi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorMultiplicationTest {
    private Calculator calculator;
    @Before
    public void createCalculator(){
        this.calculator = new Calculator();
    }
    @Test
    public void testMultiplication(){
        calculator.setOperatorIndex(3);
        calculator.setNum1(5);
        calculator.setNum2(3);
        Assert.assertEquals(15, calculator.calculate());
    }
    @Test
    public void testMultiplicationByZero(){
        calculator.setOperatorIndex(3);
        calculator.setNum1(0);
        calculator.setNum2(2);
        Assert.assertEquals(0, calculator.calculate());
    }

}
