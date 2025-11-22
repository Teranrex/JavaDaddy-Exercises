package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask5_Persons;


import java.util.HashSet;

public class UniquePersons {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("Jack", 25));
        set.add(new Person("Jack", 25));
        set.add(new Person("Bobik", 25));
        set.add(new Person("Jack", 45));

        set.forEach(System.out::println);
    }

}
