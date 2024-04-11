package test.home_work_2.loops;

import home_work_2.loops.FirstTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirsTaskTest {
    @Test
    public void loopCalculateTest(){
        Assertions.assertEquals(120L,FirstTask.multiplyNumbers(5L));
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = 120",FirstTask.getStringFormatResult(5L,120));
    }

}
