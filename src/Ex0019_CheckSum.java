import java.util.Scanner;

public class Ex0019_CheckSum {
    public boolean checkSum(int num1, int num2, int sum) {
        return num1 + num2 == sum;
    }
    public static void main(String[] args) {
        Ex0019_CheckSum checkSum = new Ex0019_CheckSum();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Input the sum of the two number: ");
        int sum = scanner.nextInt();
        System.out.println(checkSum.checkSum(num1, num2, sum));
    }
}
