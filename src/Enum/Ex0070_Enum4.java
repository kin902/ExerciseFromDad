package Enum;

public class Ex0070_Enum4 {
    public static void main(String[] args) {
        System.out.println("First direction is: " + Direction.NORTH);
        System.out.println("First direction is: " + Direction.WEST);
    }

    public enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }
}
