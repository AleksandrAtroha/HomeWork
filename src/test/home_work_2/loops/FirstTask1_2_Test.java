package test.home_work_2.loops;

import home_work_2.loops.FirstTask1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTask1_2_Test {
    @Test
    public void recurseCalculateTest(){
        Assertions.assertEquals(120L, FirstTask1_2.recurs(5L));
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = 120",FirstTask1_2.getStringFormatResult(5L,120));
    }

}
