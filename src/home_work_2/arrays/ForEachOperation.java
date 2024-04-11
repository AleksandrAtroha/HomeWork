package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    private final StringBuilder str = new StringBuilder();
    @Override
    public  String printAllElements(int[] array)
    {
        str.delete(0, str.length());
        for(int j:array) {
            str.append(j).append(" ");
        }
        return str.toString().trim();
    }
    @Override
    public  String printSecondElement(int[] array){
        str.delete(0, str.length());
       int i =0;
        for(int j:array){
            if(i%2==0) {
                str.append(j).append(" ");
            }
            i++;
        }
        return str.toString().trim();
    }
    @Override
    public  String printReversElements(int[] array){
        str.delete(0, str.length());
       int i= array.length-1;
        for(int j:array){
            str.append(array[i]).append(" ");
            i--;
        }
        return str.toString().trim();
    }
}
