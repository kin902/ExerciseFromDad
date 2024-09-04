package Abstract;

public class Ex0095_AbstractClass04 {
    public static void main(String[] args) {
        Loin1 loin = new Loin1();
        Tiger1 tiger = new Tiger1();
        Deer1 deer = new Deer1();

        loin.eat();
        tiger.eat();
        deer.eat();

        System.out.println();

        loin.sleep();
        tiger.sleep();
        deer.sleep();
    }
}

abstract class Animal1 {
    abstract void eat();
    abstract void sleep();
}

class Loin1 extends Animal1 {

    @Override
    void eat() {
        System.out.println("The Loin is eating");
    }

    @Override
    void sleep() {
        System.out.println("The Loin is sleeping");
    }
}

class Tiger1 extends Animal1 {

    @Override
    void eat() {
        System.out.println("The Tiger is eating");
    }

    @Override
    void sleep() {
        System.out.println("The Tiger is sleeping");
    }
}

class Deer1 extends Animal1 {

    @Override
    void eat() {
        System.out.println("The Deer is eating");
    }

    @Override
    void sleep() {
        System.out.println("The Deer is sleeping");
    }
}