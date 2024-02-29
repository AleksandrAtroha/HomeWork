package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
 public static void printAllElements(int[] array)
    {
        System.out.println("Вывод массива:");
        int i =0;
        do {
            System.out.print(array[i] + " ");
            i++;
        }
        while (i<array.length);
        System.out.println();
        i =0;
        while (i<array.length){
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
        for(i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for(int j:array) {
            System.out.print(j + " ");
        }
    }
    public static void printSecondElement(int[] array){
     System.out.println("Каждое 2е число массива:");
        int i =0;
        do {
            if(i%2==0) {
                System.out.print(array[i]+" ");
            }
            i++;
        }
        while (i<array.length);
        System.out.println();
        i =0;
        while (i<array.length){
            if(i%2==0) {
                System.out.print(array[i]+" ");
            }
            i++;
        }
        System.out.println();
        for(i=0;i<array.length;i++)
        {
            if(i%2==0)
                System.out.print(array[i]+" ");
        }
        System.out.println();
        i =0;
        for(int j:array){
            if(i%2==0) {
                System.out.print(j+" ");
            }
            i++;
        }
    }
    public static void printReversElements(int[] array){
        System.out.println("Вывод массива в обратном порядке:");
        int i = array.length-1;
        do{
            System.out.print(array[i]+" ");
            i--;
        }
        while (i>=0);
        System.out.println();
        i=array.length-1;
        while (i>=0){
            System.out.print(array[i]+" ");
            i--;
        }
        System.out.println();
        for(i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        i= array.length-1;
        for(int j:array){
            System.out.print(array[i]+" ");
            i--;
        }
    }
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole();
        printAllElements(array);
        System.out.println();
        printSecondElement(array);
        System.out.println();
        printReversElements(array);
    }
}
