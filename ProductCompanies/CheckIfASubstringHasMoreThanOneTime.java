package ProductCompanies;

import java.util.HashMap;
import java.util.Map;

public class CheckIfASubstringHasMoreThanOneTime {
    static void checkSubStringCount(String str){
        HashMap<String, Integer> countMap = new HashMap<>();
        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String substring = str.substring(i,j);
                if(!countMap.containsKey(substring) && substring.length()>1){
                    countMap.put(str.substring(i,j),1);
                }else if(substring.length()>1)
                    countMap.put(substring, countMap.get(substring)+1);
            }
        }
        for(Map.Entry entry: countMap.entrySet()){
            if(Integer.parseInt(entry.getValue().toString())>1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = new String("abccfgrabc");
        checkSubStringCount(str);
    }
}
