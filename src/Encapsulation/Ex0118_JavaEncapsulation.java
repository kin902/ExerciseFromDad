package Encapsulation;

public class Ex0118_JavaEncapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setter(19401, "John", 2000);
        employee.getter();
    }

    static class Employee {
        private int employee_id;
        private String employee_name;
        private int employee_salary;

        public void setter(int employee_id, String employee_name, int employee_salary) {
            this.employee_id = employee_id;
            this.employee_name = employee_name;
            this.employee_salary = employee_salary;
        }

        public void getter() {
            System.out.println("Employee ID: " + this.employee_id);
            System.out.println("Employee Name: " + this.employee_name);
            System.out.println("Employee Salary: $" + this.employee_salary);
        }
    }
}
