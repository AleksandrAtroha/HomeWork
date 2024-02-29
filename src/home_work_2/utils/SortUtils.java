package home_work_2.utils;

import java.util.Scanner;

public class SortUtils {
    public static void sort(int[] arr){
        int sizeArr = arr.length;
        for(int i=0;i<sizeArr;i++){
            for(int j =sizeArr-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void shake(int[] arr){
        int left = 0, right = arr.length - 1;
        boolean flag = true;
        while ((left < right) && flag) {
            flag = false;
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    flag = true;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i-1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    flag = true;
                }
            }
            left++;
        }
    }
}
