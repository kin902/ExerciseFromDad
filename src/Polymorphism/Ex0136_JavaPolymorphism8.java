package Polymorphism;

public class Ex0136_JavaPolymorphism8 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5, 10);

        circle.draw();
        System.out.println("The circle area is: " + circle.calculateArea() + " cm2");

        square.draw();
        System.out.println("The square area is: " + square.calculateArea() + " cm2");

        triangle.draw();
        System.out.println("The triangle area is: " + triangle.calculateArea() + " cm2");
    }

    static class Shape {
        public void draw() {
            System.out.println("Drawing a shape");
        }

        public double calculateArea() {
            return 0;
        }
    }

    static class Circle extends Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }

        @Override
        public double calculateArea() {
            return Math.PI * (radius * radius);
        }
    }

    static class Square extends Shape {
        private final double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a square");
        }

        @Override
        public double calculateArea() {
            return side * side;
        }
    }

    static class Triangle extends Shape {
        private final double base;
        private final double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a triangle");
        }

        @Override
        public double calculateArea() {
            return (base * height) / 2;
        }
    }
}
