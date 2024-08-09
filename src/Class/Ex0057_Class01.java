package Class;

public class Ex0057_Class01 {
    static class Cat {
        String name = "Unknown";
        int age = 0;

        public String toString() {
            return name + " " + age;
        }
    }

    public static void main(String[] args) {
        Cat jimmy = new Cat();
        System.out.println(jimmy);
    }
}
