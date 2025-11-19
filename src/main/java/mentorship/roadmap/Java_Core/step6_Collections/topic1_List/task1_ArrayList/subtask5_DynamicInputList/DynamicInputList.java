package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask5_DynamicInputList;

import java.util.*;

public class DynamicInputList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input =  sc.nextLine();
        while (!(input.equals("stop"))) {
            System.out.println(input);
            list.add(input);
            input = sc.nextLine();
        }
        System.out.println(list.size());
        list.forEach(System.out::println);
    }
}
