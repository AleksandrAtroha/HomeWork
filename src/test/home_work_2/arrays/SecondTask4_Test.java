package test.home_work_2.arrays;

import home_work_2.arrays.SecondTask4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondTask4_Test {
    private final int[]arr = new int[]{12,20,24,11};
    @Test
    public void findAllEvenElementsTest(){
        Assertions.assertEquals(56, SecondTask4.findAllEvenElements(arr));
    }
    @Test
    public void findMaxElementWithEvenIndexTest(){
        Assertions.assertEquals(24, SecondTask4.findMaxElementWithEvenIndex(arr));
    }
    @Test
    public void printElementsLessArithmeticTest(){
        Assertions.assertEquals("12 11", SecondTask4.printElementsLessArithmetic(arr));
    }
    @Test
    public void findMinElementsTest(){
        Assertions.assertEquals("Минимальные элементы массива: 11 и 12", SecondTask4.findMinElements(arr));
    }
    @Test
    public void findSumNumbersTest(){
        Assertions.assertEquals(13, SecondTask4.findSumNumbers(arr));
    }
}
