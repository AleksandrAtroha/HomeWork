package test.home_work_2.loops;

import home_work_2.loops.FirstTask2;
import home_work_2.loops.FirstTask3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTask3_Test {
    @Test
    public void powCalculateTest(){
        Assertions.assertEquals(64, FirstTask3.pow(4,3));
    }
}
