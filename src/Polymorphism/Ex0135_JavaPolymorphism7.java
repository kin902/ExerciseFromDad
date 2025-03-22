package Polymorphism;

public class Ex0135_JavaPolymorphism7 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Panthera panthera = new Panthera();

        bird.move();
        bird.makeSound();

        System.out.println();

        panthera.move();
        panthera.makeSound();
    }

    static class Animal {
        public void move() {
            System.out.println("Animal move");
        }

        public void makeSound() {
            System.out.println("Animal make a sound");
        }
    }

    static class Bird extends Animal {
        @Override
        public void move() {
            System.out.println("The bird fly");
        }

        @Override
        public void makeSound() {
            System.out.println("The bird sings");
        }
    }

    static class Panthera extends Animal {
        @Override
        public void move() {
            System.out.println("The panthera runs");
        }

        @Override
        public void makeSound() {
            System.out.println("The panthera roar");
        }
    }
}
