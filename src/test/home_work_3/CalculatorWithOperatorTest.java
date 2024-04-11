package test.home_work_3;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {
    @Test
    public void allOperationTest(){
        ICalculator calculator = new CalculatorWithOperator();
        Assertions.assertEquals(-14.3,calculator.subtraction(4,18.3));
        Assertions.assertEquals(5,calculator.multiplication(2,2.5));
        Assertions.assertEquals(30.5,calculator.addition(28,2.5));
        Assertions.assertEquals(12,calculator.division(144,12));
        Assertions.assertEquals(22,calculator.abs(-22));
        Assertions.assertEquals(400,calculator.degree(20,2));
        Assertions.assertEquals(5,calculator.sqrt(25));
    }
}
