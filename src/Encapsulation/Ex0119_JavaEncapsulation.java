package Encapsulation;

public class Ex0119_JavaEncapsulation {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setter(10);
        circle.getter();
        System.out.println(circle.calculatePerimeter());
    }

    static class Circle {
        private double radius;

        public void setter(int radius) {
            this.radius = radius;
        }

        public void getter() {
            System.out.println("radius:" + this.radius);
        }

        public double calculateArea() {
            return 3.14 * this.radius * this.radius;
        }

        public double calculatePerimeter() {
            return 2 * 3.14 * this.radius;
        }
    }
}
