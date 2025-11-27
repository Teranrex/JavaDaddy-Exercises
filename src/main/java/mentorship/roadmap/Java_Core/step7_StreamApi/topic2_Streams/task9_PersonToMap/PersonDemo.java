package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task9_PersonToMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Borya",13);
        Person p2 = new Person("Vova",29);
        Person p3 = new Person("Eva",19);
        Person p4 = new Person("Dima",30);
        Person p5 = new Person("Bich",20);

        List<Person> people = Arrays.asList(p1,p2,p3,p4,p5);

        people.stream()
                .collect(Collectors.toMap(Person::getName,Person::getAge))
                .forEach((s, integer) ->  System.out.printf("%s : %d\n",s,integer));

    }


}
