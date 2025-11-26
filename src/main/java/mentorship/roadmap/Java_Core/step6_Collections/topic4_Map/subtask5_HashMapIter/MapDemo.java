package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask5_HashMapIter;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 85);
        map.put("Bobik", 90);
        map.put("Ckol", 32);
        map.put("Dima", 45);
        map.put("Evgenia", 53);
        map.put("Daniel", 76);
        System.out.println("Имена студентов с баллом выше 75:");
        for (Map.Entry<String, Integer> entry : map.entrySet() ) {
            if (entry.getValue() > 75) {
                System.out.println(entry.getKey());
            }
        }

    }
}
