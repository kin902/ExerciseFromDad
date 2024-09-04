package Abstract;

public class Ex0102_AbstractClass11 {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

        eagle.makeSound();
        hawk.makeSound();

        eagle.fly();
        hawk.fly();
    }
}

abstract class Bird {
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird {
    void fly() {
        System.out.println("The Eagle is flying");
    }

    void makeSound() {
        System.out.println("The Eagle is singing");
    }
}

class Hawk extends Bird {
    void fly() {
        System.out.println("The Hawk is flying");
    }

    void makeSound() {
        System.out.println("The Hawk is singing");
    }
}