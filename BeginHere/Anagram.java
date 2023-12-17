package BeginHere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    static boolean anagramCheck(String s1, String s2){
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1.toString().equalsIgnoreCase(ch2.toString()))
            return false;
        else
            return true;
    }
    static class Employee{
        int age;
        String gender;
        String name;

        public Employee(int age, String gender, String name) {
            this.age = age;
            this.gender = gender;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "age=" + age +
                    ", gender='" + gender + '\'' +
                    ",name= "+name+'\''+
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(12,"male", "Ram");
        Employee emp2 = new Employee(13,"female", "Shyam");
        Employee emp3 = new Employee(14,"male", "Yadu");
        Employee emp4 = new Employee(15,"male", "Madhu");
        Employee emp5 = new Employee(16,"female", "Susmit");
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        List<Employee> filteredEmployee = employees.stream().filter(employee -> employee.gender.equalsIgnoreCase("male")).collect(Collectors.toList());
        filteredEmployee.stream().forEach(employee -> System.out.println(employee.toString()));

        employees.stream().map(employee -> employee.name.toUpperCase()).forEach(employee -> System.out.println(employee.toString()));

        System.out.println(anagramCheck("abcd", "cadb"));
    }
}
