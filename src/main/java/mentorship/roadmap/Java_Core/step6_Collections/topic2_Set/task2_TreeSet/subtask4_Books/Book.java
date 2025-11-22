package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask4_Books;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private Integer year;

    public Book(String title, Integer year) {
        this.title = title;
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", year=" + year + '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.year.compareTo(o.year);
    }
}
