package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask1_TreeSetDemo;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(25);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(20);

        treeSet.forEach(System.out::println);
    }
}
