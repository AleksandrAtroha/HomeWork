package home_work_2.arrays;

public class ForOperation implements IArraysOperation {
    private final StringBuilder str = new StringBuilder();
    @Override
    public  String printAllElements(int[] array)
    {
        str.delete(0, str.length());
        for(int i=0;i<array.length;i++){
            str.append(array[i]).append(" ");
        }
        return str.toString().trim();
    }
    @Override
    public  String printSecondElement(int[] array){
        str.delete(0, str.length());
        for(int i=0;i<array.length;i++)
        {
            if(i%2==0)
                str.append(array[i]).append(" ");
        }
        return str.toString().trim();
    }
    @Override
    public  String printReversElements(int[] array){
        str.delete(0, str.length());
        for(int i=array.length-1;i>=0;i--){
            str.append(array[i]).append(" ");
        }
        return str.toString().trim();
    }
}
