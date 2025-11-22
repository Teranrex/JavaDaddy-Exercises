package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask2_TreeSetWithComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparator {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add("Jack");
        treeSet.add("Bobik");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Pineapple");

        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
