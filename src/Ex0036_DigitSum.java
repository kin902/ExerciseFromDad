import java.util.Scanner;
import java.util.ArrayList;

public class Ex0036_DigitSum {
    public int digitSum(int n) {
        int result = 0;
        while (n != 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    public String readDigit(int n) {
        switch (n) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "";
    }

    public static void main(String[] args) {
        Ex0036_DigitSum digitSum = new Ex0036_DigitSum();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum =  digitSum.digitSum(number);
        ArrayList<String> result = new ArrayList<>();

        while (sum != 0) {
            result.add(digitSum.readDigit(sum % 10));
            sum /= 10;
        }
        for (int index = result.size() - 1; index >= 0; index--) {
            System.out.print(result.get(index) + " ");
        }
    }
}
