package home_work_1;

import java.util.Scanner;

public class FourTask3 {
    public static void main(String[] args) {
        int a,b;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите числа a и b");
         a = console.nextInt();
         b = console.nextInt();
         if (b==0)
         {
             System.out.println("Число не делится на 0");
         }
         else
         {
                 if(checkDivisionNumbers(a,b))
                 {
                     System.out.println("Число а/b= "+ a/b);
                 }
                 else System.out.println("Число а не кратно b, остаток - "+ a%b);
         }
    }
    public static boolean checkDivisionNumbers(double a,double b){
        return a%b==0;
    }
}
