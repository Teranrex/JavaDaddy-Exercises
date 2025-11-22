package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask4_Books;

import java.util.Comparator;
import java.util.TreeSet;

public class BookSetDemo {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>(Comparator.reverseOrder());
        books.add(new Book("Cringe", 1984));
        books.add(new Book("Harry Potter Cocker", 1890));
        books.add(new Book("Harry Potter", 1990));
        books.add(new Book("Cocks", 1000));

        books.forEach(System.out::println);

    }
}
