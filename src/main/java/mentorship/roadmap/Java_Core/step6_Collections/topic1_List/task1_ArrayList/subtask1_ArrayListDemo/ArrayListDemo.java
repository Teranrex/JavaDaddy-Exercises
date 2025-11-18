package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask1_ArrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }

        list.remove(Integer.valueOf(10));
        list.forEach(System.out::println);

    }
}
