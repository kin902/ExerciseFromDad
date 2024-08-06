package Enum;

public class Ex0058_Enum3 {
    public static void main(String[] args) {
        System.out.println("First shape: " + Shape.CIRCLE);
        System.out.println("Second shape: " + Shape.SQUARE);
    }

    public enum Shape {
        CIRCLE,
        SQUARE
    }
}
