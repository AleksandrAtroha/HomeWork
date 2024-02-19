package home_work_1;

import java.util.Scanner;

public class FourTask5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число, являющейся кодом в таблице ASC|| (0-127)");
        int a = console.nextInt();
        if(a<0 || a>127)  System.out.println("Число выъодит за пределы таблицы ASC||");
        else
        {
            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))
            {
                System.out.println("Число является кодом английской буквы");
            }
            else System.out.println("Число является кодом символа");
        }
    }
}
