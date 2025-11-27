package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task7_JoinStrings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinStringDemo {
    public static void main(String[] args) {
        String[] arr = {"red", "green", "blue", "yellow"};
        String str= Arrays.stream(arr)
                .collect(Collectors.joining(", "))
                .toString();
        System.out.println(str);
    }
}
