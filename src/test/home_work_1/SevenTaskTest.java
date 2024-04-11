package test.home_work_1;

import home_work_1.SevenTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SevenTaskTest {
    @Test
    public void createPhoneNumberTest(){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Assertions.assertEquals("(123) 456-7890", SevenTask.createPhoneNumber(numbers));
    }
}
