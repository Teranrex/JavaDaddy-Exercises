package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task5_MinString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("elephant", "cat", "hippopotamus", "dog", "lion");
        arr.stream().min(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
    }
}
