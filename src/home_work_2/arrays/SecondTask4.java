package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class SecondTask4 {
    public static int findAllEvenElements(int[]array){
        int sum =0;
        for (int j : array) {
            if (j % 2 == 0 && j > 0)
                sum = sum + j;
        }
        return sum;
    }
    public static int findMaxElementWithEvenIndex(int[] array){
        int i =0;
        int max = array[0];
        for (i=0;i<array.length;i++){
            if(i%2==0 && array[i]>max)
                max = array[i];
        }
        return max;
    }
    public static String printElementsLessArithmetic(int[] array){
        StringBuilder str = new StringBuilder();
        int sum=0;
        for (int item : array) {
            sum = sum + item;
        }
        double average = (double) sum / array.length;
        for(int item:array)
        {
            if(item<average)
                str.append(item).append(" ");
        }
        return str.toString().trim();
    }
    public static String findMinElements(int[]array) {
        int min1 = array[0];
        int min2 = array[1];
        for (int i = 2; i < array.length; i++) {
            if (array[i] < min1) {
                min2 = min1;
                min1 = array[i];
            } else if (array[i] < min2) {
                min2 = array[i];
            }
        }
        return "Минимальные элементы массива: " + min1 + " и " + min2;
    }
    public  static int findSumNumbers(int[]array){
        int sum= 0;
        for(int item:array){
            while (item>0){
                sum = sum+item%10;
                item= item/10;
            }
        }
       return sum;
    }

    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayRandom(4,1000);
        for (int item:array){
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println("Сумма четных положительных элементов массива= " +findAllEvenElements(array));
        System.out.println("Максимальный элемент с четным индексом: " +findMaxElementWithEvenIndex(array));
        System.out.println("Все элементы ниже среднего арифметического: " + printElementsLessArithmetic(array));
        System.out.println();
        System.out.println(findMinElements(array));
        System.out.println("Сумма цифр= "+findSumNumbers(array));
    }
}
