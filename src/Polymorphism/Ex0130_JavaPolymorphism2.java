package Polymorphism;

public class Ex0130_JavaPolymorphism2 {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.speedUp();
        bicycle.speedUp();
    }

    static class Vehicle {
        int speed;

        public void speedUp(){
            speed += 10;
        }
    }

    static class Car extends Vehicle {
        @Override
        public void speedUp() {
            super.speedUp();
            speed += 20;
            System.out.println("Car speed increase");
        }
    }

    static class Bicycle extends Vehicle {
        @Override
        public void speedUp() {
            super.speedUp();
            speed += 8;
            System.out.println("Bicycle speed increase");
        }
    }
}
