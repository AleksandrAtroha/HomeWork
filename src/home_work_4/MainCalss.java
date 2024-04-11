package home_work_4;

import java.util.Arrays;

public class MainCalss {
    public static void main(String[] args) {
        String[] array = {"12",null,"45",null};
        String[] strArray = new String[]{"i", "hello", "1", "Как домашка"};
        Integer[] intArray = new Integer[]{3, 1, 3, 777};
        DataContainer<Integer> containerInt = new DataContainer<>(intArray);
        DataContainer<String> containerStr = new DataContainer<>(strArray);
        DataContainer<String> dataContainer = new DataContainer<>(array);
        System.out.println("Вывод массива- "+dataContainer.toString());
        System.out.println(dataContainer.add("15"));
        System.out.println("Вывод массива после добавления 15 - "+dataContainer.toString());
        System.out.println(dataContainer.delete("45"));
        System.out.println("Вывод массива после удаления 45- "+dataContainer.toString());
        System.out.println(dataContainer.delete(2));
        System.out.println("Вывод массива после удаления 2 элемента- "+dataContainer.toString());
        containerStr.sort(new ComporatorByStringSize());
        System.out.println("Вывод массива после сортировки по длинне строки- " + containerStr.toString());
        containerInt.sort(new ComporatorByNumber());
        System.out.println("Вывод массива после сортировки - "+containerInt.toString());
    }
}
