package Recursive;
import java.util.Scanner;

public class Ex0045_Recursive04 {
    public int sumBetweenNumbers(int num1, int num2, int index) {

        if (index > (num2 - num1) / 2) return 0;
        else if (index == (num2 - num1) / 2 + 1) return num1 + index;

        return (num1 + index) + (num2 - index) + sumBetweenNumbers(num1, num2, index + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.println(new Ex0045_Recursive04().sumBetweenNumbers(num1, num2, 0));
    }
}
