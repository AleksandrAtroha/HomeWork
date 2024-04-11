package test.home_work_2.loops;

import home_work_2.loops.FirstTask2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTask2_Test {
    @Test
    public void CalculateMultiplyDigitsTest(){
        StringBuilder digits = new StringBuilder();
        Assertions.assertEquals(40320, FirstTask2.multiplyAllNumbers(13246578,digits));
        Assertions.assertEquals("1 * 3 * 2 * 4 * 6 * 5 * 7 * 8 = 40320",FirstTask2.printMultiplication(digits,40320));
    }
}
