package home_work_2.loops;

public class FirstTask2 {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(args[0]);
            StringBuilder digits = new StringBuilder();
            System.out.println(printMultiplication(digits, multiplyAllNumbers(number, digits)));
        }
        catch (NumberFormatException e){
            System.out.println("Введите целое число");
        }
    }
    public static int multiplyAllNumbers(int number,StringBuilder numbers){
        int result = 1;
        while (number > 0) {
            int digit = number %10;
            result *= digit;
            numbers.insert(0, digit);
            if (number >= 10) {
                numbers.insert(0, " * ");
            }
            number /= 10;
        }
        return result;
    }
    public static String printMultiplication(StringBuilder numbers, int result) {
        return numbers.toString() + " = " + result;
    }

}
