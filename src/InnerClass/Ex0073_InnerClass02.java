package InnerClass;

public class Ex0073_InnerClass02 {
    public static void main(String[] args) {
        University.Department technology = new University.Department();
        technology.displayInfo();

    }
}

class University {

    static class Department {
        public void displayInfo() {
            System.out.println("Department: Technology");
            System.out.println("Number of faculty members: 24");
        }
    }
}