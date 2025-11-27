package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task3_GroupWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GroupWordsDemo {
    public static void main(String[] args) {
        String[] arr = {"apple", "ant", "banana", "berry", "cherry", "carrot"};
        Arrays.stream(arr)
                .collect(Collectors.groupingBy(word -> word.charAt(0)))
                .forEach((character, strings) -> System.out.println(character + ": " + strings ));

    }
}
