package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task10_PersonSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Borya",13);
        Person p2 = new Person("Vova",29);
        Person p3 = new Person("Eva",19);
        Person p4 = new Person("Dima",30);
        Person p5 = new Person("Bich",20);
        Person p6 = new Person("Dima",30);

        List<Person> people = Arrays.asList(p1,p2,p3,p4,p5,p6);

        people.stream()
                .sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
