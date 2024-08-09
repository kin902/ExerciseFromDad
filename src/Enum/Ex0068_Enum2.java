package Enum;

public class Ex0068_Enum2 {
    public static void main(String[] args) {
        System.out.println("First day of the weekend is " + Weekend.SATURDAY);
        System.out.println("Second day of the weekend is " + Weekend.SUNDAY);
    }

    public enum Weekend {
        SATURDAY,
        SUNDAY
    }
}
