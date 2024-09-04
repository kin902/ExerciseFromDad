package Abstract;

public class Ex0098_AbstractClass07 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.startEngine();
        car.stopEngine();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("The car's engine is start");
    }

    @Override
    void stopEngine() {
        System.out.println("The car's engine is stop");
    }
}

class Motorcycle extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("The motorcycle's engine is start");
    }

    @Override
    void stopEngine() {
        System.out.println("The motorcycle's engine is stop");
    }
}