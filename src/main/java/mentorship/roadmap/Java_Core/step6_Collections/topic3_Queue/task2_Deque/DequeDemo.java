package mentorship.roadmap.Java_Core.step6_Collections.topic3_Queue.task2_Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(1);
        deque.offerLast(3);
        deque.offerFirst(2);
        deque.offerLast(4);

        deque.pollFirst();
        deque.pollLast();



        deque.forEach(System.out::println);

    }
}
