package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask4_RemoveFromList;

import java.util.*;

public class RemoveFromList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Cringe","cocks","dsadsa","a","321"));
        var valueDel = list.remove(2);
        System.out.println(list + "\n Был удалён: " + valueDel);
    }
}
