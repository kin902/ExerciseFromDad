package Polymorphism;

public class Ex0132_JavaPolymorphism4 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Programmer programmer = new Programmer();

        System.out.println("Manager salary is: $" + manager.calculateSalary());
        System.out.println("Programmer salary is: $" + programmer.calculateSalary());
    }

    static class Employee {
        public int calculateSalary() {
            return 0;
        }
    }

    static class Manager extends Employee {
        @Override
        public int calculateSalary() {
            return 1885;
        }
    }

    static class Programmer extends Employee {
        @Override
        public int calculateSalary() {
            return 8150;
        }
    }
}
