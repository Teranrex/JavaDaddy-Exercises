package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask2_DuplicateCheker;

import java.util.*;

public class DuplicateChecker {
    public static void main(String[] args) {
        HashSet<String> duplicates = new HashSet<String>();

        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        while (!(inputString.equals("стоп")) ) {
            if (duplicates.contains(inputString)) {
                System.out.println("Дубликат!");
            } else {
                duplicates.add(inputString);
            }
            inputString = sc.nextLine();
        }
        duplicates.forEach(System.out::println);
    }
}
