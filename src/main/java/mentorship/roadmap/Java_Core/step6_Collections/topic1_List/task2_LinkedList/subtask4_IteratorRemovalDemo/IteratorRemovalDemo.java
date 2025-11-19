package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask4_IteratorRemovalDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorRemovalDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());

    }
}
