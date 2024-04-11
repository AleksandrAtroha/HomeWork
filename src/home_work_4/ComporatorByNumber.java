package home_work_4;

import java.util.Comparator;

public class ComporatorByNumber implements Comparator<Integer> {
    @Override
    public int compare(Integer n1, Integer n2) {
        return n1.compareTo(n2);
    }
}
