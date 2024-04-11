package test.home_work_2;

import home_work_2.utils.SortUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class UtiisTest {
    @Test
    public void bubbleSortTest(){
        Assertions.assertEquals("[-12, -7, 0, 5, 20, 30]", Arrays.toString(SortUtils.sort(new int[]{-12,20,5,0,-7,30})));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortUtils.sort(new int[]{1,2,3,4,5,6})));
        Assertions.assertEquals("[1, 5, 9, 9, 9, 99]", Arrays.toString(SortUtils.sort(new int[]{9,1,5,99,9,9})));
        Assertions.assertEquals("[]", Arrays.toString(SortUtils.sort(new int[]{})));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortUtils.sort(new int[]{6,5,4,3,2,1})));
    }
    @Test
    public void shakeSortTest(){
        Assertions.assertEquals("[-12, -7, 0, 5, 20, 30]", Arrays.toString(SortUtils.shake(new int[]{-12,20,5,0,-7,30})));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortUtils.shake(new int[]{1,2,3,4,5,6})));
        Assertions.assertEquals("[1, 5, 9, 9, 9, 99]", Arrays.toString(SortUtils.shake(new int[]{9,1,5,99,9,9})));
        Assertions.assertEquals("[]", Arrays.toString(SortUtils.shake(new int[]{})));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortUtils.shake(new int[]{6,5,4,3,2,1})));
    }

}
