package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task2_MapToSquare;

import java.util.Arrays;

public class SquareNumbersDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).map(x -> x*x)
                .forEach(System.out::println);
    }
}
