package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation{
    private final StringBuilder str = new StringBuilder();
    @Override
    public  String printAllElements(int[] array) {
        str.delete(0, str.length());
        int i = 0;
        do {
            str.append(array[i]).append(" ");
            i++;
        }
        while (i < array.length);
        return str.toString().trim();
    }
    @Override
    public  String printSecondElement(int[] array) {
        str.delete(0, str.length());
        int i = 0;
        do {
            if (i % 2 == 0) {
                str.append(array[i]).append(" ");
            }
            i++;
        }
        while (i < array.length);
        return str.toString().trim();
    }
    @Override
    public  String printReversElements(int[] array) {
        str.delete(0, str.length());
        int i = array.length - 1;
        do {
            str.append(array[i]).append(" ");
            i--;
        }
        while (i >= 0);
        return str.toString().trim();
    }

}
