package Encapsulation;

public class Ex0122_JavaEncapsulation {
    public static void main(String[] args) {
        Book newBook = new Book();

        newBook.setter("On the origin of species", "Charles Darwin", 21.95);
        newBook.getter();
        System.out.println("$ " + newBook.applyDiscount(80));

    }

    static class Book {
        private String title;
        private String author;
        private double price;

        public void setter(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void getter() {
            System.out.println(this.title);
            System.out.println(this.author);
            System.out.println(this.price);
        }

        public double applyDiscount(double percentage) {
            return this.price * percentage / 100;
        }
    }
}
