package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class ArraysUtils {
    public static int[] arrayFromConsole()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = console.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите %d массива ", i);
            array[i] = console.nextInt();
        }
        return array;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion)
    {
        Random random =new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;
    }
}
