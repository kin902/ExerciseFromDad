package OOP;

public class Ex0089_OOP08 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea(5));
    }
}

class Shape1 {
    public double getPerimeter(double side) {
        return side + side + side + side;
    }

    public double getArea(double side) {
        return side * side;
    }
}

class Circle extends Shape1 {
    @Override
    public double getPerimeter(double diameter) {
        return diameter * Math.PI;
    }

    public double getArea(double diameter) {
        return Math.pow(diameter / 2, 2) * Math.PI;
    }
}