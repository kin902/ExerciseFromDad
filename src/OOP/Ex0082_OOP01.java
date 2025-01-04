package OOP;

public class Ex0082_OOP01 {
    public static void main(String[] args) {
        Cat BritishCat = new Cat();
        Animal cow = new Animal();

        cow.makeSound();
        BritishCat.makeSound();

    }
}

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow meow meow");
    }
}