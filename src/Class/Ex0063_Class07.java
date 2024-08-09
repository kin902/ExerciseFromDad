package Class;

public class Ex0063_Class07 {
    static class Car {
        String make;
        String model;
        int year;

        public Car() {
            this.make = "Germany";
            this.model = "BMW";
            this.year = 1916;
        }

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String toString() {
            return model + " was made by " + make + " on " + year;
        }
    }

    public static void main(String[] args) {
        Car BMW = new Car();
        Car Toyota = new Car("Japan", "Toyota", 1937);

        System.out.println(Toyota);
        System.out.println(BMW);
    }
}
