package vinnsla.hi;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAdditionTest extends TestCase {
    private Calculator calculator;

    @Before
    public void createCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void testAddition(){
        calculator.setOperatorIndex(Integer.parseInt("+"));
        calculator.setNum1(2);
        calculator.setNum2(3);
        assertEquals(5, calculator.calculate());
    }





}
