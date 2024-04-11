package test.home_work_4;

import home_work_4.ComporatorByNumber;
import home_work_4.ComporatorByStringSize;
import home_work_4.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataContainerTest {
    @Test
    public void addTest(){
        DataContainer<Integer> container= new DataContainer<>(new Integer[]{1, 2, 3,4,5});
        container.add(777);
        Assertions.assertEquals("[1, 2, 3, 4, 5, 777]",container.toString());
    }
    @Test
    public void deleteByIndexTest(){
        DataContainer<Integer> container= new DataContainer<>(new Integer[]{1, 2, 3,4,5});
        container.delete(4);
        Assertions.assertEquals("[1, 2, 3, 4]",container.toString());
    }
    @Test
    public void deleteByItemTest(){
        DataContainer<String> container= new DataContainer<>(new String[]{"1", "2", "hello","4","5"});
        container.delete("hello");
        Assertions.assertEquals("[1, 2, 4, 5]",container.toString());
    }
    @Test
    public void toStringContainerTest(){
        DataContainer<Integer> container= new DataContainer<>(new Integer[]{1, 2, 3,4,5});
        Assertions.assertEquals("[1, 2, 3, 4, 5]",container.toString());
    }
    @Test
    public void sortBuNumberTest(){
        DataContainer<Integer> container= new DataContainer<>(new Integer[]{1, 77, 3,2,5});
        container.sort(new ComporatorByNumber());
        Assertions.assertEquals("[1, 2, 3, 5, 77]",container.toString());
    }
    @Test
    public void sortBuStringSize(){
        DataContainer<String> container= new DataContainer<>(new String[]{"hello","1","как домашка?"});
        container.sort(new ComporatorByStringSize());
        Assertions.assertEquals("[1, hello, как домашка?]",container.toString());
    }
}
