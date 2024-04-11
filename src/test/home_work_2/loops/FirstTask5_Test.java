package test.home_work_2.loops;

import home_work_2.loops.FirstTask5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTask5_Test {
    @Test
    public void findMaxDigitTest(){
        Assertions.assertEquals(8, FirstTask5.findmaxdigit(287));
        Assertions.assertEquals(9, FirstTask5.findmaxdigit(989));
    }
    @Test
    public void amountOfEvenDigitsTest(){
        Assertions.assertEquals(3, FirstTask5.amountOfEvenDigits(32564));
        Assertions.assertEquals(0, FirstTask5.amountOfEvenDigits(13579));
    }
    @Test
    public void amountOfOddDigitsTest(){
        Assertions.assertEquals(2, FirstTask5.amountOfOddDigits(32564));
        Assertions.assertEquals(0, FirstTask5.amountOfOddDigits(4620));
    }
    @Test
    public void printFibonaciTest(){
        Assertions.assertEquals("0 0 1 1 2 3", FirstTask5.printFibonaci(5));
    }
    @Test
    public void printDigitsWithStepTest(){
        Assertions.assertEquals("0 5 10 15 20", FirstTask5.printDigitsWithStep(0,20,5));
    }
    @Test
    public void printReverseNumberTest(){
        Assertions.assertEquals("1234", FirstTask5.printReverseNumber(4321));
    }
}
