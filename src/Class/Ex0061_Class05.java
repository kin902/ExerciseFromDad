package Class;

import java.util.ArrayList;

public class Ex0061_Class05 {
    static class Book {
        String title;
        String author;
        int ISBN;

        public Book(int ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;

        }

        public String toString() {
            return this.ISBN + ", " + this.title + ", " + this.author + "; ";
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book(1244634732, "Poor Little Duck", "Harry"));
        library.add(new Book(1824125472, "Little naughty river", "Mai"));
        library.add(new Book(1928530512, "Little Star", "Jimmy"));

        library.remove(1);

        System.out.println(library);
    }
}
