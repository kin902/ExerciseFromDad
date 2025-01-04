package OOP;

public class Ex0084_OOP03 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(16, 4);
        System.out.println(rectangle.getArea());
    }
}

class Shape {
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}