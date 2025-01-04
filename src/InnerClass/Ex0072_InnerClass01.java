package InnerClass;

public class Ex0072_InnerClass01 {

    public static void main(String[] args) {
        Computer.Processor Core = new Computer.Processor();
        Core.displayDetails();

    }
}

class Computer {

    static class Processor {
        public void displayDetails() {
            System.out.println("Brand: Intel Core i9 processor 14900k");
            System.out.println("Speed: 8946");
        }
    }
}