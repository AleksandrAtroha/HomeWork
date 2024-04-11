package test.home_work_1;

import home_work_1.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
 * 4.1 Определить нечётное число
 * 4.2 Среди трёх чисел найти среднее
 * 4.3 Проверка делимости одного числа на другое
 * 4.4 Перевести байты в килобайты или наоборот
 * 4.5 Буква или иной символ
 * 4.6 Определить високосный год или нет
 * */
public class FourTaskTest {
    @Test
    public void testIsOdd(){

        Assertions.assertTrue(FourTask1.findOddNumber(15));
        Assertions.assertFalse(FourTask1.findOddNumber(12));
    }
    @Test
    public void getAverageNumberTest(){
        Assertions.assertEquals(15, FourTask2.getAverageNumber(10,15,20));
        Assertions.assertEquals(-150, FourTask2.getAverageNumber(-150,-600,15));
        Assertions.assertEquals(0, FourTask2.getAverageNumber(0,0,0));
    }
    @Test
    public void divisionNumberTest(){
        Assertions.assertTrue(FourTask3.checkDivisionNumbers(-4,2));
        Assertions.assertFalse(FourTask3.checkDivisionNumbers(10,3));
    }
    @Test
    public void converterTest(){
        Assertions.assertEquals(2048, FourTask4.convertInByte(2));
        Assertions.assertEquals(10, FourTask4.convertInKbyte(10240));
    }
    @Test
    public void checkLetterTest(){
        Assertions.assertFalse(FourTask5.checkLetter(145));
        Assertions.assertTrue(FourTask5.checkLetter(69));
    }
    @Test
    public void sHighGradeYear(){
        Assertions.assertTrue(FourTask6.isHighGradeYear(2020));
        Assertions.assertFalse(FourTask6.isHighGradeYear(2021));
    }
}
