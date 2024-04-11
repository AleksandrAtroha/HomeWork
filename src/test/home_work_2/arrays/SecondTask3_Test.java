package test.home_work_2.arrays;

import home_work_2.arrays.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondTask3_Test {
    private final IArraysOperation doWhileOperation = new DoWhileOperation();
    private final IArraysOperation whileOperation = new WhileOperation();
    private final IArraysOperation forEachOperation = new ForEachOperation();
    private final IArraysOperation forOperation = new ForOperation();
    private  int[] arr = new int[]{12,20,24,11};
    @Test
    public void doWhileOperationTest(){
        Assertions.assertEquals("12 20 24 11",doWhileOperation.printAllElements(arr));
        Assertions.assertEquals("12 24",doWhileOperation.printSecondElement(arr));
        Assertions.assertEquals("11 24 20 12",doWhileOperation.printReversElements(arr));
    }
    @Test
    public void whileOperationTest(){
        Assertions.assertEquals("12 20 24 11",whileOperation.printAllElements(arr));
        Assertions.assertEquals("12 24",whileOperation.printSecondElement(arr));
        Assertions.assertEquals("11 24 20 12",whileOperation.printReversElements(arr));
    }
    @Test
    public void forEachOperationTest(){
        Assertions.assertEquals("12 20 24 11",forEachOperation.printAllElements(arr));
        Assertions.assertEquals("12 24",forEachOperation.printSecondElement(arr));
        Assertions.assertEquals("11 24 20 12",forEachOperation.printReversElements(arr));
    }
    @Test
    public void forOperationTest(){
        Assertions.assertEquals("12 20 24 11",forOperation.printAllElements(arr));
        Assertions.assertEquals("12 24",forOperation.printSecondElement(arr));
        Assertions.assertEquals("11 24 20 12",forOperation.printReversElements(arr));
    }
}
