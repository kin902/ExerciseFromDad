package OOP;

public class Ex0083_OOP02 {
    public static void main(String[] args) {
        Car Mazda = new Car();
        Vehicle vehicle = new Vehicle();

        vehicle.drive();
        Mazda.drive();
    }
}

class Vehicle {
    public void drive() {
        System.out.println("Repairing a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}