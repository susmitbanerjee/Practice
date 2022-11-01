package Fundamentals;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableClassExample {
    static class Student implements Comparable<Student>{
        String name;
        int number;
        int age;

        public Student(String name, int number, int age) {
            this.name = name;
            this.number = number;
            this.age = age;
        }

        @Override
        public int compareTo(Student o) {
            if(this.number==o.number)
                return 0;
            else if(this.number>o.number)
                    return 1;
            else
                return -1;
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
        Student a= new Student("Ram",99,25);
        Student b = new Student("Shyam", 97, 26);
        Student c= new Student("Yadu", 98,27);
        ArrayList<Student> studentArrayList= new ArrayList<>();
        studentArrayList.add(a);
        studentArrayList.add(b);
        studentArrayList.add(c);
        Collections.sort(studentArrayList);
        for(Student student: studentArrayList){
            System.out.println(student.toString());
        }
    }
}
