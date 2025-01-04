package Encapsulation;

public class Ex0120_JavaEncapsulation {
    public static void main(String[] args) {
        Car car = new Car();

        car.setter("Mazda", "Mazda3", 2019, 50000);
        car.getter();
    }

    static class Car {
        private String company_name;
        private String model_name;
        private int year;
        private int mileage;

        public void setter(String company_name, String model_name, int year, int mileage) {
            this.company_name = company_name;
            this.model_name = model_name;
            this.year = year;
            this.mileage = mileage;
        }

        public void getter() {
            System.out.println(this.mileage + " km");
        }
    }
}
