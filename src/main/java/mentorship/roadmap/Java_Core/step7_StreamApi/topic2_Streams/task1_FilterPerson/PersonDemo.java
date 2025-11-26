package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Bobik", 45);
        Person person1 = new Person("Bobik2", 31);
        Person person2 = new Person("Bobik3", 15);
        Person person3 = new Person("Bobik4", 25);
        Person person4 = new Person("Bobik5", 40);


        Person[] arr = {person, person1, person2, person3, person4};
        Arrays.stream(arr).
                filter(p -> p.getAge() > 30)
                .toList()
                .forEach(System.out::println);
    }
}
