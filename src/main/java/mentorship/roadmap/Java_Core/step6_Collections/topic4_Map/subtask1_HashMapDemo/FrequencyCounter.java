package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask1_HashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        String[] strArray = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String fruit : strArray) {
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
        }

//        for (Map.Entry<String,Integer> entry : map.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            if (value == null)
//                map.put(key, new Integer(1));
//            else
//                map.put(key, new Integer(value + 1));
//        }


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
