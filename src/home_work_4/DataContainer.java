package home_work_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
public class DataContainer<T> {
    private T[] data;
    public  DataContainer(T[] data){
        this.data = data;
    }
    public int add(T item){
        if(item==null){
            return -1;
        }
        int i =0;
        while (i<data.length && data[i]!= null){
            i++;
        }
        if(i< data.length){
            data[i] = item;
            return i;
        }
        else {
            data = Arrays.copyOf(data, data.length + 1);
            data[i] = item;
            return i;
        }
    }
    public T get(int index){
        if(index< data.length || index> data.length)
            return null;
        return data[index];
    }
    public T[] getItems(){
        return data;
    }
    public boolean delete(int index){
        if (index<0 || index > data.length)
            return false;
        else {
            for (int i = index + 1; i < data.length; i++) {
                data[i - 1] = data[i];
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
    }
    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null && data[i].equals(item)) {
                System.arraycopy(data, i + 1, data, i, data.length - i - 1);
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                sb.append(data[i].toString());
                if (i < data.length - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
