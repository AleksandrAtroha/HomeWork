package home_work_2.arrays;

public class WhileOperation implements IArraysOperation{
    private final StringBuilder str = new StringBuilder();
    @Override
    public  String printAllElements(int[] array)
    {
        str.delete(0, str.length());
        int i =0;
        while (i<array.length){
            str.append(array[i]).append(" ");
            i++;
        }
        return str.toString().trim();
    }
    @Override
    public  String printSecondElement(int[] array){
        str.delete(0, str.length());
        int i =0;
        while (i<array.length){
            if(i%2==0) {
                str.append(array[i]).append(" ");
            }
            i++;
        }
        return str.toString().trim();
    }
    @Override
    public  String printReversElements(int[] array){
        str.delete(0, str.length());
        int i=array.length-1;
        while (i>=0){
            str.append(array[i]).append(" ");
            i--;
        }
        return str.toString().trim();
    }
}
