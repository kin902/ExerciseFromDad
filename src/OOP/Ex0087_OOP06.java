package OOP;

public class Ex0087_OOP06 {
    public static void main(String[] args) {
        Animal1 cow = new Animal1();
        Cheetah cheetah = new Cheetah();

        cow.move();
        cheetah.move();
    }
}

class Animal1 {
    public void move() {
        System.out.println("Animal moves");
    }
}

class Cheetah extends Animal1 {
    @Override
    public void move() {
        System.out.println("The cheetah is running!");
    }
}