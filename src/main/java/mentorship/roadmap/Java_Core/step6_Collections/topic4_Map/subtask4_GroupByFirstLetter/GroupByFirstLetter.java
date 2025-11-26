package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask4_GroupByFirstLetter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        String[] names = {"Bobik", "Komik", "Gomik", "Tsenachik","Koker","Dima", "Bibik"};
        HashMap<Character, List<String>> map = new HashMap<>();
        for (String name : names) {
            map.computeIfAbsent(name.charAt(0), k -> new ArrayList<>()).add(name);
        }
        for (Character character : map.keySet()) {
            System.out.printf("First letter is: %c, List: %s\n",character, map.get(character));
        }


    }
}
