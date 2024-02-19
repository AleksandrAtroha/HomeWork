package home_work_1;
import java.util.Scanner;

public class FourTask4 {
    public static void main(String[] args) {
        double result;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        double a = console.nextDouble();
        System.out.println("Введите число для выбора действия:");
        System.out.println("1 - перевод числа в килобайты");
        System.out.println("2 - перевод числа в байты");
        int choose = console.nextInt();
        switch (choose)
        {
            case 1: result = a/1024;
            System.out.printf("%.3f Килобайт",result);
            break;
            case 2: result = a*1024;
            System.out.println(result + " Байт");
            break;
            default: System.out.println("Введите число 1 или 2!");
            break;
        }
    }
}
