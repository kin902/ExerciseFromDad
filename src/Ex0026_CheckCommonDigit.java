import java.util.Scanner;
import java.util.ArrayList;

public class Ex0026_CheckCommonDigit {
    public boolean isCommonDigit(int num1, int num2) {
        ArrayList<Character> num1Char = new ArrayList<>();
        ArrayList<Character> num2Char = new ArrayList<>();
        while(num1 != 0 || num2 != 0) {
            if (num1 != 0) {
                num1Char.add((char) ((char) num1 % 10));
                num1 = num1 / 10;
            }
            if (num2 != 0) {
                num2Char.add((char) ((char) num2 % 10));
                num2 = num2 / 10;
            }
        }
        for (char c : num1Char) {
            for (char c2 : num2Char) {
                if (c == c2) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Ex0026_CheckCommonDigit check = new Ex0026_CheckCommonDigit();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Result: " + check.isCommonDigit(num1, num2));
        scanner.close();
    }
}
