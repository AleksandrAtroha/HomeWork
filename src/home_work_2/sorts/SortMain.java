package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortUtils;

import java.util.Scanner;

public class SortMain {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole();
        int[] array1 = ArraysUtils.arrayRandom(50,100);
        System.out.println("Массив до сортировки:");
        for (int item:array){
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println("Массив после пузырьковой сортировки:");
        SortUtils.sort(array);
        for (int item:array){
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println("Массив до сортировки:");
        for (int item:array1){
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println("Массив после шейкерной сортировки:");
        SortUtils.shake(array1);
        for (int item:array1){
            System.out.print(item+" ");
        }
    }
}
