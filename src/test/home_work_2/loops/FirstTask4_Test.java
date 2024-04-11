package test.home_work_2.loops;

import home_work_2.loops.FirstTask4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTask4_Test {
    @Test
    public void testMultiplyUntilOverflow() {
        long expectedBeforeOverflow = Long.MAX_VALUE/2;
        long actualBeforeOverflow = FirstTask4.multiplyOverflow(1, 2);
        Assertions.assertEquals(expectedBeforeOverflow, actualBeforeOverflow);
    }
}
