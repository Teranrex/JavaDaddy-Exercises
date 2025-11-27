package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task4_CountEvenNumbers;

import java.util.Arrays;

public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35, 14, 3, 2, 15, 17};
        long num = Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .count();
        System.out.println("Отфильтровано: " + num);
    }
}
