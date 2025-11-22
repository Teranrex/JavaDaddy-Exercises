package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask4_SetToListSort;

import java.util.*;

public class SetToListSort {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        for  (int i = 1; i <= 100; i++) {
            set.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        list.forEach(System.out::println);
    }
}
