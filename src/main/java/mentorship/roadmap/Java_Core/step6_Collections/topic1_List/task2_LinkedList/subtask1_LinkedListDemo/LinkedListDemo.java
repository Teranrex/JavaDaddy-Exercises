package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask1_LinkedListDemo;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("One","Two","Three"));

        list.addLast("Four");
        list.addFirst("Five");

        System.out.println("Original List: " + list.toString());
        list.removeFirst();
        System.out.println("Del first el: " + list.toString());
        list.removeLast();
        System.out.println("Del last el: " + list.toString());
    }
}
