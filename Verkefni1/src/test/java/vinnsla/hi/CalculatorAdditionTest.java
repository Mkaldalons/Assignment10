package vinnsla.hi;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAdditionTest {
    private Calculator calculator;

    @Before
    public void createCalculator(){
        this.calculator = new Calculator();
    }

    @Test
    public void testAddition(){
        calculator.setOperatorIndex(0);
        calculator.setNum1(2);
        calculator.setNum2(3);
        Assert.assertEquals(5, calculator.calculate());
    }





}
