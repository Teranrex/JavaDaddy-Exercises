package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task4_Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFilterDemo {
    public static void main(String[] args) {
        Integer[] arr = {5, 12, 7, 20, 3};
        MyPredicate<Integer> n = x -> x > 10;

        System.out.println(filterArray(arr, n));
    }

    static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate) {
        List<T> list = new ArrayList<>();
        for (T t : array) {
            if (predicate.test(t)) {
                list.add(t);
            }
        }
        return list;
    }
}
