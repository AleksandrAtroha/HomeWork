package home_work_2.loops;

public class FirstTask {
    public static void main(String[] args) {
            long number = Long.parseLong(args[0]);
            if (number < 1) {
                System.out.println("Число должно быть положительным.");
            }
            else {
                long result = 1;
                for (long i = 1; i <= number; i++) {
                    result *= i;

                    System.out.print(i+"*");
                }
                System.out.print("="+result);
            }
    }
}
