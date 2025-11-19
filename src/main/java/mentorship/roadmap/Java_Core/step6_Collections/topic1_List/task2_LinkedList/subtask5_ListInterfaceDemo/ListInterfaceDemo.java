package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask5_ListInterfaceDemo;

import java.util.*;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add(0, "A");
        list.add(0, "Adsadsa");
        list.add(0, "dsadsdadA");
        list.add(0, "Adsadasdf");
        list.add(0, "Atrtetre");
        list.add(0, "Asd");
        list.add(0, "Avref");

        list.set(0,"koshka");
        list.forEach(System.out::println);

        list.remove(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Индекс: " + list.indexOf(list.get(i)) + " Значение: " + list.get(i));
        }

    }
}
