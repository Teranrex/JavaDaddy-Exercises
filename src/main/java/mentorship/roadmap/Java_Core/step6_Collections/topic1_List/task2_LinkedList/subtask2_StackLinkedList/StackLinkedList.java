package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask2_StackLinkedList;

import java.util.*;

public class StackLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.push(i);
        }
        System.out.println(list.toString());

        int listSize = list.size();
        for (int i = 0; i < listSize; i++){
            System.out.println(list.pop());
        }
        System.out.println(list.toString());
    }
}
