package Static;
import java.util.Scanner;

public class Ex0074_Static4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Constants.circleArea(radius);

        System.out.println("The area of the circle is: " + area);
    }
}
