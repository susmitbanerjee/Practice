package ProductCompanies;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThompsonReuters {
    //class person with name and age
    //list<persons> age
    public static void main(String[] args) {
        Person person1=new Person("Susmit",27);
        Person person2=new Person("Another",45);
        Person person3=new Person("ABC",27);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        Map<Integer, List<Person>> resultMap = persons.stream().collect(Collectors.groupingBy(Person::getAge));
        resultMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().toString());
        });
    }


}
