package test.home_work_1;

import home_work_1.FiveTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FiveTaskTest {
    @Test
    public void sleepInTest(){
        Assertions.assertTrue(FiveTask.sleepIn(false, false));
        Assertions.assertTrue(FiveTask.sleepIn(true, true));
        Assertions.assertFalse(FiveTask.sleepIn(true, false));
        Assertions.assertTrue(FiveTask.sleepIn(false, true));
    }
}
