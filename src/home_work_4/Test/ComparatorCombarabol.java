package home_work_4.Test;

import java.util.Comparator;

public class ComparatorCombarabol implements Comparator<Comparable> {


    @Override
    public int compare(Comparable o1, Comparable o2) {
        return o1.compareTo(o2);
    }
}
