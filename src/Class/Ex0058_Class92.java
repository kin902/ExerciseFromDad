package Class;

public class Ex0058_Class92 {
    static class Dog {
        String name;
        String color;

        public Dog(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public String toString() {
            return name + " " + color;
        }
    }

    public static void main(String[] args) {
        Dog Windy = new Dog("Windy", "blue");
        System.out.println(Windy);

    }
}
