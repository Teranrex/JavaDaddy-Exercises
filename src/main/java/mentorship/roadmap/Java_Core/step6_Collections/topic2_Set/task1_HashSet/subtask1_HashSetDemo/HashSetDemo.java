package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask1_HashSetDemo;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("1");
        hs.add("2");
        hs.add("3");
        hs.add("4");

        hs.forEach(System.out::println);
    }
}
