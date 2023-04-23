package ProductCompanies;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Netcracker {
    public static void main(String[] args) {
        HashMap<String, List<String>> map=new HashMap<>();
        List<String> a=new ArrayList<>();
        a.add("D1");
        a.add("D2");
        map.put("E1",a);
        List<String> b=new ArrayList<>();
        b.add("D4");
        b.add("D3");
        map.put("E2",b);
        List<String> c=new ArrayList<>();
        c.add("D2");
        c.add("D3");
        map.put("E3",c);
        List<String> d=new ArrayList<>();
        d.add("D4");
        d.add("D1");
        map.put("E4",d);

        HashSet<String> charSet=new HashSet<>();
        for(Map.Entry mapentry: map.entrySet()){
            for(String str: (List<String>)mapentry.getValue()){
                charSet.add(str);
            }
        }
        HashMap<String, List<String>> result = new HashMap<>();
        for(Map.Entry mapentry: map.entrySet()){
            List<String> newList = new ArrayList<>();
            for(String str: (List<String>)mapentry.getValue()){

                if(charSet.contains(str)){
                    newList.add(mapentry.getKey().toString());
                }
                result.put(str,newList);
            }
        }
        Map<String, Long> mapnew = map.keySet().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        mapnew.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
