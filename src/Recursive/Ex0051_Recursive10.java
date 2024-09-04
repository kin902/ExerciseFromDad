package Recursive;
import java.util.Scanner;


public class Ex0051_Recursive10 {
    public int countLengthString(String string) {
        char[] chars = string.toCharArray();
        int count = 0;
        for (char c : chars) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex0051_Recursive10 obj = new Ex0051_Recursive10();

        System.out.print("Enter a string: ");
        String string = scanner.next();

        System.out.println("The string length is: " + obj.countLengthString(string));
    }
}
