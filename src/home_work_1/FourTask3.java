package home_work_1;

import java.util.Scanner;

public class FourTask3 {
    public static void main(String[] args) {
        int result,a,b;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите числа a и b");
         a = console.nextInt();
         b = console.nextInt();
         if (a==0 || b==0)
         {
             System.out.println("Число не делится на 0");
         }
         else
         {
             if (a>b)
             {
                 if(a%b==0)
                 {
                     System.out.println("Число а/b= "+ a/b);
                 }
                 else System.out.println("Число а не кратно b, остаток - "+ a%b);
             }
             else
             {
                 if(b%a==0)
                 {
                     System.out.println("Число b/a= "+ b/a);
                 }
                 else System.out.println("Число b не кратно a, остаток - "+ b%a);
             }
         }


    }
}
