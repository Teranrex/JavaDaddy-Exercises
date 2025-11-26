package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task3_ArraySort;

import java.util.Arrays;

public class LambdaArraySortDemo {
    public static void main(String[] args) {
        String[] array = {"Java", "Lambda", "Stream", "API"};
        Arrays.sort(array, (s1,s2) ->Integer.compare(s1.length(),s2.length()));
        System.out.println(Arrays.toString(array));



    }
}
