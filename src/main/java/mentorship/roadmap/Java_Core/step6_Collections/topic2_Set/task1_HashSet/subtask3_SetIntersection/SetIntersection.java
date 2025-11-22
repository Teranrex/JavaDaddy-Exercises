package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask3_SetIntersection;

import java.util.HashSet;

public class SetIntersection {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");
        set1.add("E");


        set2.add("D");
        set2.add("E");
        set2.add("F");

        HashSet<String> set1IntersectionSet1 = new HashSet<>();
        set1IntersectionSet1 = (HashSet<String>)set1.clone();
        set1IntersectionSet1.retainAll(set2);


        System.out.println(set1IntersectionSet1);

    }
}
