package home_work_2.loops;

public class FirstTask2 {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(args[0]);
            int result = 1;
            while (number > 0) {
                result *= number % 10;
                number /= 10;
                System.out.print(number + "*");
            }
            System.out.print("=" + result);
        }
        catch (NumberFormatException e){
            System.out.println("Введите целое число");
        }
    }

}
