package home_work_2.loops;

public class FirstTask {
    public static void main(String[] args) {
            long number = Long.parseLong(args[0]);
            if (number < 1) {
                System.out.println("Число должно быть положительным.");
            }
            else {
                System.out.println( getStringFormatResult(number,multiplyNumbers(number)));
            }
    }
    public static long multiplyNumbers(long end){
        long result = 1;
        for (long i = 1; i <= end; i++) {
            result *= i;
        }
        return result;
    }
    public static String getStringFormatResult(long end,long result){
        StringBuilder strResult = new StringBuilder();
        for (int i = 1; i < end; i++) {
            strResult.append(i).append(" * ");
        }
        return strResult.toString() + end + " = " + result;
    }
}
