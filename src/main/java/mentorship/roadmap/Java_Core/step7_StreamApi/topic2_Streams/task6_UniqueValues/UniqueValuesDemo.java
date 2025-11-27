package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task6_UniqueValues;

import java.util.Arrays;

public class UniqueValuesDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5, 1};
        int[] newArr = Arrays.stream(arr)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(newArr));
    }
}
