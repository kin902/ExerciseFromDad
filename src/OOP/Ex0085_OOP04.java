package OOP;

public class Ex0085_OOP04 {
    public static void main(String[] args) {
        Employee emp = new Employee(45611);
        HRManager mgr = new HRManager(85116);

        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());

        mgr.addEmployee();
    }
}

class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Working as an employee!");
    }

    public int getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(int salary) {
        super(salary);
    }

    public void work() {
        System.out.println("Working as a HR manager!");
    }

    public void addEmployee() {
        System.out.println("Add new Employee");
    }
}