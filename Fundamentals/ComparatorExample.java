package Fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    static class Student {
        String name;
        int number;
        int age;

        public Student(String name, int number, int age) {
            this.name = name;
            this.number = number;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", number=" + number +
                    ", age=" + age +
                    '}';
        }
    }


    public static void main(String[] args) {
        ComparableClassExample.Student a= new ComparableClassExample.Student("Ram",99,25);
        ComparableClassExample.Student b = new ComparableClassExample.Student("Shyam", 97, 26);
        ComparableClassExample.Student c= new ComparableClassExample.Student("Yadu", 98,27);
        List<ComparableClassExample.Student> studentArrayList= new ArrayList<ComparableClassExample.Student>();
        studentArrayList.add(a);
        studentArrayList.add(b);
        studentArrayList.add(c);
        //Collections.sort(studentArrayList, new AgeComparator());
    }
}
