package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask6_PerformanceCompare;

import java.util.*;

public class PerformanceCompare {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < 100_000; i++) {
            arrayList.add(i);
        }

    }
}
