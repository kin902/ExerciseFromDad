package Abstract;

public class Ex0092_AbstractClass01 {
    public static void main(String[] args) {
        Loin loin = new Loin();
        Tiger tiger = new Tiger();
        loin.sound();
        tiger.sound();
    }
}

abstract class Animal {
    abstract void sound();
}

class Loin extends Animal {
    public void sound() {
        System.out.println("Roars");
    }
}

class Tiger extends Animal {
    public void sound() {
        System.out.println("Growl");
    }
}