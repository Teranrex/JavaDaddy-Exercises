package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask5_Persons;

public class Person {
    public static void main(String[] args) {
        Person p1 = new Person("bobik", 45);
        Person p2 = new Person("bobik", 45);
        Person p3 = new Person("bobik", 44);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p1));

        System.out.println(p1.hashCode() == p2.hashCode());
        System.out.println(p1.hashCode() == p3.hashCode());
    }


    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person))
            return false;
        Person other = (Person) o;
        if (this.age == other.age && this.name.equals(other.name))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        final int hash = 7;
        int result = 4;
        result = hash * result + this.name.hashCode();
        result += hash * result + this.age;
        return result;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d", this.name, this.age);
    }

}
