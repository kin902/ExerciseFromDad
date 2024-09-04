package Abstract;

public class Ex0093_AbstractClass02 {
    public static void main(String[] args) {
        Circle circle = new Circle(134.4);
        Triangle triangle = new Triangle(10, 6, 4, 6, 7);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
    }
}

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (radius * radius) * 3.14;
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

class Triangle extends Shape {
    double base;
    double height;
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateArea() {
        return base * height / 2;
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}