package Polymorphism;

public class Ex0129_JavaPolymorphism1 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        Animal animal = new Animal();

        bird.makeSound();
        cat.makeSound();
        animal.makeSound();
    }

    static class Animal {
        public void makeSound() {
            System.out.println("The animal make a sound");
        }
    }

    static class Bird extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The bird chirps");
        }
    }

    static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The cat meows");
        }
    }
}

