package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask2_SearchIInList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchInList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Kotik", "Bobik", "Jeny"));

        Scanner sc = new Scanner(System.in);

        if (list.contains(sc.nextLine())) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }

    }
}
