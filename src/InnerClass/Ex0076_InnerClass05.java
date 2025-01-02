package InnerClass;

public class Ex0076_InnerClass05 {
    public static void main(String[] args) {
        Library Congress = new Library();
        System.out.println(Congress.libraryName);
    }
}

class Library {
    Book physic = new Book();
    String libraryName = physic.getLibraryName();

    static class Book {
        public String getLibraryName() {
            return "Library of Congress";
        }

    }

}