package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask3_MergeLists;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        first.addAll(Arrays.asList("A", "B", "C", "D", "E"));
        second.addAll(Arrays.asList("csdad", "dsadasdgfB", "C", "Dfdsf", "sE"));
        List<String> third = Stream.concat(first.stream(), second.stream())
                .collect(Collectors.toList());

        third.forEach(n -> System.out.print(n + " "));
    }
}
