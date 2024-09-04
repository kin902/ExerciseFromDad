package Abstract;

public class Ex0099_AbstractClass08 {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();
        athlete.eat();
        lazyPerson.eat();

        System.out.println();

        athlete.exercise();
        lazyPerson.exercise();
    }
}

abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    void eat() {
        System.out.println("French toast + avocado + vegetable sides");
    }

    void exercise() {
        System.out.println("Running 100m for 9.63s");
    }
}

class LazyPerson extends Person {
    void eat() {
        System.out.println("Snacks");
    }

    void exercise() {
        System.out.println("Watching TV");
    }
}