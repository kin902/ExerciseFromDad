package Class;

public class Ex0059_Class03 {
    static class Book {
        String title;
        String author;
        int price;

        public Book(String title, String author, int price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String toString() {
            return title + ", " + author + ", " + price + "$";
        }
    }

    public static void main(String[] args) {
        Book books = new Book("Jimmy the cat", "Loki", 14);
        System.out.println(books);
    }
}
