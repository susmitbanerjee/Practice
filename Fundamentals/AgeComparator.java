package Fundamentals;

import java.util.Comparator;

class AgeComparator implements Comparator<ComparatorExample.Student> {
    public int compare(ComparatorExample.Student o1, ComparatorExample.Student o2) {
        if(o1.number==o2.number)
            return 0;
        else if(o1.number>o2.number)
            return 1;
        else
            return -1;
    }
}
