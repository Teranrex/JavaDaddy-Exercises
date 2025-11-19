package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask6_ArrayListSort;

import java.util.*;

public class SortedArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(42, 17, 8, 99, 23));
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
