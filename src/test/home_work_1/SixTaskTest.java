package test.home_work_1;

import home_work_1.SixTask2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SixTaskTest {
    @Test
    public void checkNameTest(){
        Assertions.assertEquals("Привет!" + "\n" + "Я тебя так долго ждал", SixTask2.checkName("Вася"));
        Assertions.assertEquals("Я тебя так долго ждал", SixTask2.checkName("Анастасия"));
        Assertions.assertEquals("Добрый день, а вы кто?", SixTask2.checkName("Игорь"));
    }
}
