package OOP;

public class Ex0088_OOP07 {
    public static void main(String[] args) {
        Employee1 Khanh = new Employee1("Ngo Nam Khanh", 1824235, "Computer Science");

        System.out.println(Khanh.getFirstName() + " " + Khanh.getLastName());
    }
}

class Person {

    private final String firstName;
    private final String lastName;

    public Person(String name) {
        String[] names = name.split(" ");
        this.firstName = names[names.length - 1];
        this.lastName = names[0];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee1 extends Person {
    private final int employeeID;
    private final String jobTitle;

    public Employee1(String name, int employeeID, String jobTitle) {
        super(name);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + "; " + jobTitle;
    }
}