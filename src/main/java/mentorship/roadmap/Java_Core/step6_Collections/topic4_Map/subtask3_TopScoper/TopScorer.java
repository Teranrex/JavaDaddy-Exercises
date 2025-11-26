package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask3_TopScoper;

import java.util.HashMap;
import java.util.Map;

public class TopScorer {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Bobik", 200);
        map.put("John", 300);
        map.put("Andrey", 4000);
        map.put("Bob", 500);
        map.put("Kishka", 100);
        System.out.println(getString(map));

    }

    public static String getString(HashMap<String, Integer> map) {
        String key = "";
        int maximum = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maximum) {
                maximum = entry.getValue();
                key =  entry.getKey();
            }
        }
        return key;

    }

}
