package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask6_WordCounter;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "dog", "bird", "cat", "dog"};
        HashMap<String,Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
