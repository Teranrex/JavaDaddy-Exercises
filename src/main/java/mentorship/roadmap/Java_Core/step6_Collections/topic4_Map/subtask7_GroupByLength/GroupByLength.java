package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask7_GroupByLength;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupByLength {
    public static void main(String[] args) {
        String[] array = {"hi", "hello", "hey", "hola", "yo", "bonjour"};
        HashMap<Integer, List<String>> map = new HashMap<>();

        for (String string : array) {
            map.computeIfAbsent(string.length(), k -> new ArrayList<>()).add(string);
        }

        for (Integer key : map.keySet()) {
            System.out.println("Длина: " + key + " " + map.get(key));
        }

    }
}
