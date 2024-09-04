package Abstract;

public class Ex0103_AbstractClass12 {
    public static void main(String[] args) {
        Triangle1 triangle = new Triangle1(5.2, 6.4, 7, 8.4, 9);
        Square square = new Square(10);

        System.out.println(triangle.area() + "cm2");
        System.out.println(square.area() + "cm2");

        System.out.println(triangle.perimeter() + "cm");
        System.out.println(square.perimeter() + "cm");
    }
}

abstract class GeometricShape {
    public abstract double area();
    public abstract double perimeter();
}

class Triangle1 extends GeometricShape {
    double a, b, c, base, height;
    public Triangle1(double a, double b, double c, double base, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.height = height;
    }

    public double area() {
        return base * height / 2;
    }

    public double perimeter() {
        return a + b + c;
    }
}

class Square extends GeometricShape {
    double side;
    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }
}