package Enum;

public class Ex0067_Enum1 {
    public static void main(String[] args) {

        System.out.println("Today is: " + DayOfWeek.MONDAY);
        System.out.println("Tomorrow is: " + DayOfWeek.TUESDAY);
    }

    public enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}
