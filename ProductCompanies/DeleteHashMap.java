package ProductCompanies;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DeleteHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(1, 10);
        hm.put(2, 20);
        hm.put(3, 30);
        hm.put(4, 40);
        hm.put(5, 50);
        hm.put(6, 60);

        int[] keySet = new int[hm.size()];
        int i = 0;

        for (Map.Entry hMap : hm.entrySet()) {
            if ((Integer) hMap.getValue() > 20 && (Integer) hMap.getValue() < 50) {
                keySet[i] = (int) hMap.getKey();
                i++;
            }
        }

        for (int j = 0; j < keySet.length; j++) {
            hm.remove(keySet[j]);
        }

        System.out.println(hm);
    }
}
