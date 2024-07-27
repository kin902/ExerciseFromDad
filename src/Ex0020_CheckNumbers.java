import java.util.Scanner;

public class Ex0020_CheckNumbers {
    public boolean CheckNumbers(int num1, int num2, int num3) {
        return num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10;
    }

    public static void main(String[] args) {
        Ex0020_CheckNumbers checkNumbers = new Ex0020_CheckNumbers();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();

        System.out.println("The result is: " + checkNumbers.CheckNumbers(num1, num2, num3));
    }
}
