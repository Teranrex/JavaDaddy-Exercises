package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task8_AverageValue;

import java.util.Arrays;
import java.util.List;

public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 20, 30, 40, 50,100);
        arr.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
    }
}
