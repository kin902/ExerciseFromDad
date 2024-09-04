package Abstract;

public class Ex0096_AbstractClass05 {
    public static void main(String[] args) {
        Manager manager = new Manager(27, "An", 81534);

        System.out.println(manager.calculateSalary());
        manager.displayInfo();
    }
}

abstract class Employee {
    abstract int calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    int age;
    String name;
    int salary;

    public Manager(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    int calculateSalary() {
        return salary;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}