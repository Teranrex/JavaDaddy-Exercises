package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask2_PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Andrey", "555888");
        hashMap.put("Bob", "555555");
        hashMap.put("John", "555235");
        hashMap.put("Bobik", "333555");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Номер пользователя: " + hashMap.getOrDefault(input, "Пользователь не найден"));
        if  (hashMap.containsKey(input)) {
            System.out.println("Номер пользователя: " + hashMap.get(input));
        } else {
            System.out.println("Имя не найдено");
        }

    }
}
