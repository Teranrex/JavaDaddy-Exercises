package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask3_QueueLinkedList;

import java.util.LinkedList;

public class QueueLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.offer("Cringe");
        list.offer("David");
        list.offer("Robin");
        list.offer("Harry");
        System.out.println(list.toString());

        while (list.poll() != null) {
            System.out.println(list.toString());
            if (list.isEmpty()) {
                System.out.println("null");
                break;
            }
        }
    }
}
