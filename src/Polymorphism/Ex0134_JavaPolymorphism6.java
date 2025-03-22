package Polymorphism;

public class Ex0134_JavaPolymorphism6 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(5, 10, 6, 5, 6);
        Square square = new Square(10);

        System.out.println("Circle area: " + circle.getArea() + " cm2");
        System.out.println("Circle perimeter: " + triangle.getPerimeter() + " cm");

        System.out.println("Triangle area: " + triangle.getArea() + " cm2");
        System.out.println("Triangle perimeter: " + triangle.getPerimeter() + " cm");

        System.out.println("Square area: " + square.getArea() + " cm2");
        System.out.println("Square perimeter: " + square.getPerimeter() + " cm");

    }

    static class Shape {
        public double getArea() {
            return 0;
        }

        public double getPerimeter() {
            return 0;
        }
    }

    static class Circle extends Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * (radius * radius);
        }

        @Override
        public double getPerimeter() {
            return 2 * (Math.PI * radius);
        }
    }

    static class Triangle extends Shape {
        private final double height;
        private final double base;
        private final double sideA;
        private final double sideB;
        private final double sideC;

        public Triangle(double height, double base, double sideA, double sideB, double sideC) {
            this.height = height;
            this.base = base;
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        @Override
        public double getArea() {
            return (height * base) / 2;
        }

        @Override
        public double getPerimeter() {
            return sideA + sideB + sideC;
        }
    }

    static class Square extends Shape {
        private final double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public double getPerimeter() {
            return side * 4;
        }
    }
}
