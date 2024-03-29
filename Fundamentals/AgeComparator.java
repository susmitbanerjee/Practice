package Fundamentals;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

class AgeComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Fundamentals.ComparableClassExample.Student s1=(Fundamentals.ComparableClassExample.Student)o1;
        Fundamentals.ComparableClassExample.Student s2=(Fundamentals.ComparableClassExample.Student)o2;
        if(((Fundamentals.ComparableClassExample.Student) o1).number== ((Fundamentals.ComparableClassExample.Student) o2).number)
            return 0;
        else if(((Fundamentals.ComparableClassExample.Student) o1).number> ((Fundamentals.ComparableClassExample.Student) o2).number)
            return 1;
        else
            return -1;
    }

    @Override
    public Comparator reversed() {
        return null;
    }

    @Override
    public Comparator thenComparing(Comparator other) {
        return null;
    }

    @Override
    public Comparator thenComparingInt(ToIntFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingLong(ToLongFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
        return null;
    }
}
